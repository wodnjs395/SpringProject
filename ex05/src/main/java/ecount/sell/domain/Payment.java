package ecount.sell.domain;

import java.sql.Timestamp;
import java.util.Date;

import lombok.Data;


@Data
public class Payment {
	private String pay_uuid;
	private String acc_uuid;
	private Date payreqdate;
	private int amount;
	private int paytype;
	private int status;
	private Timestamp created_at;
	private Timestamp modified_at;
}
