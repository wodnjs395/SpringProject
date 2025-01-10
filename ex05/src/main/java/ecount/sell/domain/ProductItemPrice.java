package ecount.sell.domain;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductItemPrice {
	private String rn;
	private String uuid;
	private String productnum;
	private String total_count;
	private String total_price;
	private Timestamp created_at;

}
