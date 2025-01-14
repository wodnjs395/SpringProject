package ecount.quotation.domain;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
	private LocalDateTime    created_at; // sysdate
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
	private LocalDateTime    modified_at; // sysdate
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
	private LocalDateTime    deleted_at; // 해당값이 존재하면 검색 X
}
