package br.com.mastertech.invoice.client;

import br.com.mastertech.invoice.exception.CardServiceDownException;
import br.com.mastertech.invoice.exception.PaymentServiceDownException;

import java.util.List;

public class ServiceFallback implements CardClient, PaymentClient {
    @Override
    public Card getCardById(Long cardId) {
        throw new CardServiceDownException();
    }

    @Override
    public Card getCardByIdAndCustomerId(Long customerId, Long cardId) {
        throw new CardServiceDownException();
    }

    @Override
    public Card expireCard(Long customerId, Long cardId) {
        throw new CardServiceDownException();
    }

    @Override
    public void deleteAllByCardId(Long cardId) {
        throw new PaymentServiceDownException();
    }

    @Override
    public List<Payment> getPayments(Long cardId) {
        throw new PaymentServiceDownException();
    }
}
