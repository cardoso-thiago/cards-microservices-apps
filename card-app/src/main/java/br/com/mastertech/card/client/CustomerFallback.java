package br.com.mastertech.card.client;

import br.com.mastertech.card.exception.CustomerServiceDownException;

public class CustomerFallback implements CustomerClient {
    @Override
    public Customer getCustomer(Long customerId) {
        throw new CustomerServiceDownException();
    }
}
