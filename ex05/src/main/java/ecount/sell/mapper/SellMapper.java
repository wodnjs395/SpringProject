package ecount.sell.mapper;

import java.util.List;

import ecount.sell.domain.Criteria;

import ecount.common.domain.Mappingtable;
import ecount.common.domain.Product_mapping;
import ecount.sell.domain.SellVO;

public interface SellMapper {
	
	public List<SellVO> getList();
	
	public List<SellVO> getListWithPaging(Criteria cri);
	
	public void insertSell(SellVO sell);
	
	public void insertMappingTable(Mappingtable mappingtable);
	
	public void insertProductMapping(Product_mapping pm);
	
	public int getTotalCount(Criteria cri);
	
	
	
	

}
