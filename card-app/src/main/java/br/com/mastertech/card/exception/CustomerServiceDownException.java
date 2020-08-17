package br.com.mastertech.card.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.SERVICE_UNAVAILABLE, reason = "O serviço de consulta de clientes está temporariamente indisponível.")
public class CustomerServiceDownException extends RuntimeException {}