package ecount.common.domain;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class Manager {
	private int managerNum;
	private String name;
	private Timestamp created_at;
	private Timestamp modified_at;
}
