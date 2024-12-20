package ecount.sell.domain;

import java.sql.Timestamp;
import java.util.List;

import ecount.common.domain.ProductList;
import ecount.common.domain.Products;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SellAndProductListDTO {
	
	private Sell sell;
	
	private List<ProductList> productlist;
	

}
