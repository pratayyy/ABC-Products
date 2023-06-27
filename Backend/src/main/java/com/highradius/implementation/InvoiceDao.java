package com.highradius.implementation;

import java.util.List;

import com.highradius.model.Invoice;

public interface InvoiceDao {
	List<Invoice> getInvoice(int start, int end);
	
	List<Invoice> searchInvoice(int customerOrderId);
	
	void insertInvoice(Invoice invoice);
	
	void updateInvoice(int customerOrderId, Invoice invoice);
	
	void deleteInvoice(int customerOrderId);
}
