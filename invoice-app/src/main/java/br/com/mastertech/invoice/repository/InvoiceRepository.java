package br.com.mastertech.invoice.repository;

import br.com.mastertech.invoice.entity.Invoice;
import org.springframework.data.repository.CrudRepository;

public interface InvoiceRepository extends CrudRepository<Invoice, Long> {}
