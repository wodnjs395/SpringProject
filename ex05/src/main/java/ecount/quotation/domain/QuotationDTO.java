package ecount.quotation.domain;

import java.sql.Timestamp;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuotationDTO {

	private String acc_uuid;
	private int acc_number;
	private int clientNum;
	private int storageId;
	private int projectNum; //Nullable
	private String status;
	private Timestamp created_at;
	private Timestamp modified_at;
	private Timestamp deleted_at; //Nullable
}
