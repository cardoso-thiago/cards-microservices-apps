package br.com.mastertech.payment.mapper;

import br.com.mastertech.payment.dto.PaymentRequest;
import br.com.mastertech.payment.entity.Payment;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DataMapper {
    DataMapper INSTANCE = Mappers.getMapper(DataMapper.class);

    Payment paymentRequestToPayment(PaymentRequest paymentRequest);
    PaymentRequest paymentToPaymentRequest(Payment payment);
    List<PaymentRequest> paymentToPaymentRequest(List<Payment> payment);
}
