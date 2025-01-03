package ecount.sell.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductItemPrice {
	private String uuid;
	private int productnum;
	private int count;
	private int total_price;

}
