package ecount.common.domain;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class ProductList {
	
	private int ProductNum;
	private String uuid;
	private int productcode2;
	private int numberOfItem;
	private String comment;
	private Timestamp created_at;
	private Timestamp deleted_at;
}
