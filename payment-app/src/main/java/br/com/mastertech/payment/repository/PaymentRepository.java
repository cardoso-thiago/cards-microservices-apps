package br.com.mastertech.payment.repository;

import br.com.mastertech.payment.entity.Payment;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PaymentRepository extends CrudRepository<Payment, Long> {
    List<Payment> findAllByCardId(Long cardId);

    void deleteAllByCardId(Long cardId);
}
