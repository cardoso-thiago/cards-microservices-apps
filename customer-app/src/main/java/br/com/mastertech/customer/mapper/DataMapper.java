package br.com.mastertech.customer.mapper;

import br.com.mastertech.customer.dto.CustomerRequest;
import br.com.mastertech.customer.entity.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DataMapper {
    DataMapper INSTANCE = Mappers.getMapper(DataMapper.class);

    Customer customerRequestToCustomer(CustomerRequest customerRequest);
    CustomerRequest customerToCustomerRequest(Customer customer);
    List<CustomerRequest> customerToCustomerRequest(List<Customer> customer);
}
