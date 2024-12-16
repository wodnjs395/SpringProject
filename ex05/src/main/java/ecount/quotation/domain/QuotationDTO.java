package ecount.quotation.domain;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class QuotationDTO {

	private String acc_uuid;
	private int acc_number;
	private int clientNum;
	private int storageId;
	private int projectNum;
	private int status;
	private Timestamp created_at;
	private Timestamp modified_at;
	private Timestamp deleted_at;
}
