package ecount.quotation.mapper;

import static org.junit.Assert.assertTrue;

import java.sql.Timestamp;
import java.util.UUID;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ecount.quotation.domain.QuotationDTO;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class QuotationMapperTests {

	@Setter(onMethod_ = @Autowired)
	private QuotationMapper mapper;

	@Test
	public void registerTest() {

		QuotationDTO quot = new QuotationDTO();
		quot.setAcc_uuid(UUID.randomUUID().toString());
		quot.setAcc_num(1);
		quot.setClientNum(2);
		quot.setManagerNum(3);
		quot.setStorageId(4);
		quot.setProjectNum(5);
		quot.setStatus("1");
		quot.setCreated_at(new Timestamp(System.currentTimeMillis()));
		quot.setModified_at(new Timestamp(System.currentTimeMillis()));

		int result = mapper.insertQuot(quot);
		assertTrue(result > 0);
		log.info(quot);
	}
}
