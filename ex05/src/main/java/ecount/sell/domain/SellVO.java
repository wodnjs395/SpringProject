package ecount.sell.domain;

import java.sql.Timestamp;
import java.util.List;

import ecount.common.domain.ProductList;
import lombok.Data;

@Data
public class SellVO {
	private  String acc_uuid;
	private int acc_num;
	private int clientnum;
	private int managerNum;
	private int storageid;
	private int projectnum;
	private int salestype;
	private int type;	
	private int status;
	private Timestamp created_at;
	private Timestamp modified_at;
	private Timestamp deleted_at;

}





