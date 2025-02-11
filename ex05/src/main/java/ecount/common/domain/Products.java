package ecount.common.domain;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Products {
	
	private int productcode;
	private String name;
	private int unitprice;
	private int numberOfItem;
	private String memo;
	private Timestamp created_at;
	private Timestamp modified_at;
	private Timestamp delete_at;
}
