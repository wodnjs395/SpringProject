package ecount.sell.mapper;

import java.util.List;

import ecount.common.domain.ProductList;
import ecount.sell.domain.Sell;

public interface SellMapper {
	
	public List<Sell> getList();
	
	public List<ProductList> getProductList(String acc_uuid);

}
