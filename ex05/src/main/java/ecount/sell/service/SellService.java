package ecount.sell.service;

import java.util.List;

import ecount.sell.domain.Criteria;
import ecount.sell.domain.SellAndProductsDTO;
import ecount.sell.domain.SellVO;

public interface SellService {
	
	public List<SellAndProductsDTO> getList(Criteria cri);
	
	public int getTotal(Criteria cri);
	
	public List<SellVO> getList2();

}
