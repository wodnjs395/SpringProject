package ecount.sell.domain;

import java.sql.Timestamp;
import java.util.List;

import ecount.common.domain.ProductList;
import lombok.Data;

@Data
public class Sell {
	String acc_uuid;
	int acc_num;
	int clientnum;
	int managerNum;
	int storageid;
	int projectnum;
	int salestype;
	int type;	
	int status;
	Timestamp created_at;
	Timestamp modified_at;
	Timestamp deleted_at;

	
	List<ProductList> productList;
}





