package ecount.sell.domain;

import java.util.List;

import ecount.common.domain.Product_mapping;
import ecount.common.domain.Products;
import lombok.Data;

@Data
public class OneOfProducts {
	private Product_mapping pm;
	private List<Products> productList;

}
