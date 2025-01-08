package ecount.sell.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductItemPrice {
	private int rn;
	private String uuid;
	private int productnum;
	private int total_count;
	private double total_price;

}
