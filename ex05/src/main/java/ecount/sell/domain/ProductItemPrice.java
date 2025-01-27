package ecount.sell.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductItemPrice {
	private String uuid;
	private BigDecimal productnum;
	private String first_product;
	private BigDecimal total_count;
	private BigDecimal total_price;
	private Timestamp created_at;
	

}
