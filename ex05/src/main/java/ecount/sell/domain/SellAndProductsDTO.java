package ecount.sell.domain;

import java.text.DecimalFormat;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SellAndProductsDTO {
	private SellVO sell;
	private ProductItemPrice pi;
	private String date_num;
	private String dateNo;
	private String productSummary;
	private String salestype;
	private String total_price;
	

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
		
		date_num = String.valueOf(sell.getCreated_at()) +"-"+ sell.getAcc_num();	
//		salestype = String.valueOf(sell.getSalestype());
		switch (sell.getSalestype()) {
		case 1:
			this.salestype = "부가세율 적용";
		case 2:
			this.salestype = "부가세율 미적용";
		}
		DecimalFormat df = new DecimalFormat("###,###");
		total_price = df.format(pi.getTotal_price());
		
	}
	
	
	
	
	

}
