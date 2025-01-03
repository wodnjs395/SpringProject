package ecount.sell.domain;

import java.util.List;

import ecount.common.domain.ProductList;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SellAndProductsDTO {
	private Sell sell;
	private ProductItemPrice pi;
	

}
