package ecount.common.domain;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class Client {
	private int clientNum;
	private String name;
	private String exponentName;
	private String businessType;
	private String Phonenum;
	private String address;
	private String email;
	private Timestamp created_at;
	private Timestamp modified_at;
}