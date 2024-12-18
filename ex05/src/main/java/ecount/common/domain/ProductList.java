package ecount.common.domain;

import java.sql.Timestamp;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProductList {
	private int ProductNum;
	private String uuid;
	private Products product;
	private int numberOfItem;
	private String comment;
	private Timestamp created_at;
	private Timestamp deleted_at;
}
