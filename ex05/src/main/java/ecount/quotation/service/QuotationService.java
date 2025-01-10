package ecount.quotation.service;

import java.util.List;

import ecount.quotation.domain.QuotationDTO;

public interface QuotationService {
	
	public void register(QuotationDTO quot);
	
	public QuotationDTO get(int acc_num);
	
	public boolean modify(QuotationDTO quot);
	
	public boolean remove(QuotationDTO quot);
	
	public List<QuotationDTO> getList();

}
