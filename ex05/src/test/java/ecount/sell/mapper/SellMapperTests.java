package ecount.sell.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ecount.sell.domain.Criteria;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class SellMapperTests {
	
	@Setter(onMethod_ = @Autowired)
	private SellMapper mapper;
	
	@Setter(onMethod_ = @Autowired)
	private ProductsMapper pmapper;
	
	@Test
	public void testGetList() {
		mapper.getList().forEach(sell -> log.info(sell));
	}
	
	
	@Test
	public void testGetProduct() {
		Criteria cri = new Criteria(1,10);
		pmapper.getPagingProudcts(cri).forEach(product -> log.info(product));
	}
	
	
	@Test
	public void testGetProduct2() {
		pmapper.getProductItemPriceAndcount().forEach(pro -> log.info(pro));
	}
	

}
