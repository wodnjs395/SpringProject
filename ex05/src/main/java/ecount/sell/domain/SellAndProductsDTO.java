package ecount.sell.domain;

import java.util.List;

import ecount.common.domain.ProductList;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SellAndProductsDTO {
	private SellVO sell;
	private ProductItemPrice pi;
	private String dateNo;
	private String productSummary;
	private String salestype;
	

	public SellAndProductsDTO(SellVO sell, ProductItemPrice pi) {
		this.sell = sell;
		this.pi = pi;
		dateNo = String.valueOf(sell.getCreated_at())+ String.valueOf(sell.getAcc_num());
		if (pi.getTotal_count().intValue() > 1) {
			productSummary = pi.getFirst_product() + " 외 "+ (pi.getTotal_count().intValue()-1)+"건";
			}
		else {
			productSummary = pi.getFirst_product();			
			}
		
		salestype = String.valueOf(sell.getSalestype());
	}
	
	
	
	

}
