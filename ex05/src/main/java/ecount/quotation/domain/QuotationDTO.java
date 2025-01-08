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
	private int acc_num; // 해당 날짜의 만들어진 순번 
	private int clientNum;
	private int managerNum;
	private int storageId;
	private int projectNum; 
	private String status; // 0 - 결제중 1 - 진행중 2 - 완료  
	private Timestamp created_at; // sysdate
	private Timestamp modified_at; // sysdate
	private Timestamp deleted_at; // 해당값이 존재하면 검색 X
}
