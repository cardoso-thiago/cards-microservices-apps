package br.com.mastertech.invoice.mapper;

import br.com.mastertech.invoice.dto.InvoiceRequest;
import br.com.mastertech.invoice.entity.Invoice;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface DataMapper {
    DataMapper INSTANCE = Mappers.getMapper(DataMapper.class);
    InvoiceRequest invoiceToInvoiceRequest(Invoice invoice);
}
