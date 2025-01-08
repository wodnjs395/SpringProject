package ecount.sell.mapper;

import java.util.List;

import ecount.sell.domain.Criteria;

import ecount.common.domain.ProductList;
import ecount.sell.domain.ProductItemPrice;

public interface ProductsMapper {
	
	public List<ProductList> getProductList(String acc_uuid);
	
	
	public List<ProductItemPrice> getOneOfSellProducts();
	
	public List<ProductItemPrice> getProductItemPriceAndcount();

	public List<ProductItemPrice> getPagingProudcts(Criteria cri);
	
	

}
