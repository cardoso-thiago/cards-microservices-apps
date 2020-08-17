package br.com.mastertech.payment.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.SERVICE_UNAVAILABLE, reason = "O serviço de consulta de cartões está temporariamente indisponível.")
public class CardServiceDownException extends RuntimeException {}