package ecount.sell.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ecount.sell.domain.Criteria;
import ecount.sell.domain.ProductItemPrice;
import ecount.sell.domain.SellAndProductsDTO;
import ecount.sell.domain.SellVO;
import ecount.sell.mapper.ProductsMapper;
import ecount.sell.mapper.SellMapper;
import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@AllArgsConstructor
public class SellServiceImpl implements SellService{
	
	@Setter(onMethod_= @Autowired)
	private SellMapper smapper;
	
	
	@Setter(onMethod_ = @Autowired)
	private ProductsMapper pmapper;

	@Override
	public List<SellAndProductsDTO> getList(Criteria cri) {
		// TODO Auto-generated method stub
		List<SellAndProductsDTO> spList = new ArrayList<SellAndProductsDTO>();
		List<SellVO> sList = new ArrayList<SellVO>();
		sList = smapper.getListWithPaging(cri);
		List<ProductItemPrice> pList = new ArrayList<ProductItemPrice>();
		pList = pmapper.getPagingProudcts(cri);
		for(int i = 0; i < sList.size(); i++) {
			for(int j=0;j < pList.size(); j++) {
				if(sList.get(i).getAcc_uuid().equals(pList.get(j).getUuid())) {}
				SellAndProductsDTO temp = new SellAndProductsDTO(sList.get(i),pList.get(j));
				spList.add(temp);
			}
		}
		return spList;
	}

	@Override
	public int getTotal(Criteria cri) {
		return smapper.getTotalCount(cri);
	}

	@Override
	public List<SellVO> getList2() {
		
		return smapper.getList();
	}
	
	
	
	
	
	
	
	

}
