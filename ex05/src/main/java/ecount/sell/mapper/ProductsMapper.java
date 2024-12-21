package ecount.sell.mapper;

import java.util.List;

import ecount.common.domain.ProductList;

public interface ProductsMapper {
	
	public List<ProductList> getProductList(String acc_uuid);

}
