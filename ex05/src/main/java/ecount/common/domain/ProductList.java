package ecount.common.domain;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductList {
	private int ProductNum;
	private String uuid;
	private Products product;
	private int numberOfItem;
	private String comment;
	private Timestamp created_at;
	private Timestamp deleted_at;
}
