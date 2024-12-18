package ecount.sell.domain;

import java.sql.Timestamp;
import java.util.Date;

import lombok.Data;


@Data
public class Payment {
	String pay_uuid;
	String acc_uuid;
	Date payreqdate;
	int amount;
	int paytype;
	int status;
	Timestamp created_at;
	Timestamp modified_at;
}
