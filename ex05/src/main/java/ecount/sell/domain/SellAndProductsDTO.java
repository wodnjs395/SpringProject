package ecount.sell.domain;

import java.util.List;

import ecount.common.domain.ProductList;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SellAndProductsDTO {
	private String dateNo;
	private String clientName;
	private String first_product;
	private int productCount;
	private int total_price;
	private String salestype;
	
	

	public SellAndProductsDTO(SellVO sell, ProductItemPrice pi) {
		
		dateNo = String.valueOf(sell.getCreated_at())+ String.valueOf(sell.getAcc_num());
		clientName = String.valueOf(sell.getClientnum());
		first_product = pi.getFirst_product();
		if (pi.getTotal_count() > 1) {productCount = pi.getTotal_count()-1;}
		else {productCount = 0;}
		total_price = pi.getTotal_price();
		salestype = String.valueOf(sell.getSalestype());
	}
	
	
	
	

}
