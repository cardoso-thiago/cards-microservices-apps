package br.com.mastertech.payment.service;

import br.com.mastertech.payment.client.Card;
import br.com.mastertech.payment.client.CardClient;
import br.com.mastertech.payment.entity.Payment;
import br.com.mastertech.payment.exception.DeactivatedCardException;
import br.com.mastertech.payment.exception.ExpiredCardException;
import br.com.mastertech.payment.repository.PaymentRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PaymentService {
    private final PaymentRepository paymentRepository;
    private final CardClient cardClient;

    public PaymentService(PaymentRepository paymentRepository, CardClient cardClient) {
        this.paymentRepository = paymentRepository;
        this.cardClient = cardClient;
    }

    public Payment save(Long cardId, Payment payment) throws DeactivatedCardException, ExpiredCardException {
        Card card = getCardImpl(cardId);
        if(!card.isActive()) {
            throw new DeactivatedCardException("Não é possível realizar o pagamento, o cartão está desativado.");
        }
        if(card.isExpired()) {
            throw new ExpiredCardException("Não é possível realizar o pagamento, o cartão está expirado.");
        }
        payment.setCardId(card.getId());
        return paymentRepository.save(payment);
    }

    public List<Payment> getPaymentsByCardId(Long cardId) {
        return paymentRepository.findAllByCardId(cardId);
    }

    private Card getCardImpl(Long cardId) {
        return cardClient.getCardById(cardId);
    }

    public void deleteAllByCardId(Long cardId) {
        paymentRepository.deleteAllByCardId(cardId);
    }
}
