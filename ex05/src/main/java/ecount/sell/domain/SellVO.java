package ecount.sell.domain;

import java.sql.Timestamp;
import java.util.Date;

import lombok.Data;

@Data
public class SellVO {
	private  String acc_uuid;
	private int acc_num;
	private String clientname;
	private String managername;
	private String storagename;
	private String projectname;
	private int salestype;
	private int type;	
	private int status;
	private Date created_at;
	private Date modified_at;
	private Date deleted_at;

}





