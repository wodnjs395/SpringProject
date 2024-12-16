package ecount.common.domain;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class ShppingStorage {
	private int storageId;
	private String storageName;
	private String addres;
	private Timestamp created_at;
	private Timestamp modified_at;
	private Timestamp deleted_at;
}