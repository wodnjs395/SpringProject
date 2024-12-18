package ecount.quotation.persistence;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class JDBCTests {

	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			log.error("Oracle Driver Not Found");
			fail("Oracle Driver Not Found" + e.getMessage());
		}
	}

	@Test
	public void testConnection() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "system";
		String password = "1234";

		try (Connection con = DriverManager.getConnection(url, username, password)) {
			log.info(con);
		} catch (SQLException e) {
			fail(e.getMessage());
		}
	}
}
