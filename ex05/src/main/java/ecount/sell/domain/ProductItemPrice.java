package ecount.sell.domain;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductItemPrice {
	private String uuid;
	private int productnum;
	private String first_product;
	private int total_count;
	private int total_price;
	private Date created_at;

}
