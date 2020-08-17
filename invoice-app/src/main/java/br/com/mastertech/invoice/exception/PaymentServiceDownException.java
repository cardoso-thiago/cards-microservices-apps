package br.com.mastertech.invoice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.SERVICE_UNAVAILABLE, reason = "O serviço de consulta de pagamentos está temporariamente indisponível.")
public class PaymentServiceDownException extends RuntimeException {}