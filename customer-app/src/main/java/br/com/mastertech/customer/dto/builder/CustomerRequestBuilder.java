package br.com.mastertech.customer.dto.builder;

import br.com.mastertech.customer.dto.CustomerRequest;

public final class CustomerRequestBuilder {
    private Long id;
    private String name;

    private CustomerRequestBuilder() {
    }

    public static CustomerRequestBuilder aCustomerRequest() {
        return new CustomerRequestBuilder();
    }

    public CustomerRequestBuilder id(Long id) {
        this.id = id;
        return this;
    }

    public CustomerRequestBuilder name(String name) {
        this.name = name;
        return this;
    }

    public CustomerRequest build() {
        return new CustomerRequest(id, name);
    }
}
