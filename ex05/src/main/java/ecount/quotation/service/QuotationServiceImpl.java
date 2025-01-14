package ecount.quotation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ecount.quotation.domain.QuotationDTO;
import ecount.quotation.mapper.QuotationMapper;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Service
@AllArgsConstructor
@Log4j
public class QuotationServiceImpl implements QuotationService {
	
	@Autowired
	private QuotationMapper mapper;
	
	@Override
	public void register(QuotationDTO quot) {
		mapper.insertQuot(quot);
	}

	@Override
	public QuotationDTO get(int acc_num) {
		return mapper.findQuotByAccNum(acc_num);
	}

	@Override
	public boolean modify(QuotationDTO quot) {
		return false;
	}

	@Override
	public boolean remove(QuotationDTO quot) {
		return false;
	}

	@Override
	public List<QuotationDTO> getList() {
		return mapper.findAllQuot();
	}

}
