package br.com.mastertech.customer.entity.builder;

import br.com.mastertech.customer.entity.Customer;

public final class CustomerBuilder {
    private String name;

    private CustomerBuilder() {
    }

    public static CustomerBuilder aCustomer() {
        return new CustomerBuilder();
    }

    public CustomerBuilder name(String name) {
        this.name = name;
        return this;
    }

    public Customer build() {
        return new Customer(name);
    }
}
