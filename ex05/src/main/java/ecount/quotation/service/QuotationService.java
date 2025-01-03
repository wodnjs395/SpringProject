package ecount.quotation.service;

import java.util.List;

import ecount.quotation.domain.QuotationDTO;

public interface QuotationService {
	
	public void register(QuotationDTO quot);
	
	public QuotationDTO read(Long acc_number);
	
	public boolean modify(QuotationDTO quot);
	
	public boolean remove(QuotationDTO quot);
	
	public List<QuotationDTO> getList();

}
