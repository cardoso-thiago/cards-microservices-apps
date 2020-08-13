package br.com.mastertech.customer.entity;

import br.com.mastertech.customer.entity.builder.CustomerBuilder;

import javax.persistence.*;

@Entity
@Table(name="customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;

    public Customer() {
    }

    public Customer(String name) {
        this.name = name;
    }

    public static CustomerBuilder builder() {
        return CustomerBuilder.aCustomer();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
