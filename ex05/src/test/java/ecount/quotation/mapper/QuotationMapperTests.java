package ecount.quotation.mapper;

import static org.junit.Assert.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.time.LocalDateTime;
import java.util.UUID;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import ecount.quotation.domain.QuotationDTO;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration({ "file:src/main/webapp/WEB-INF/spring/root-context.xml",
		"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml" })
@Log4j
public class QuotationMapperTests {

	@Autowired
	private WebApplicationContext ctx;

	private MockMvc mockMvc;

	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(ctx).build();
	}

	@Autowired
	private QuotationMapper mapper;

//	@Test
//	public void checkBeans() {
//	    String[] beanNames = ctx.getBeanDefinitionNames();
//	    for (String beanName : beanNames) {
//	        System.out.println(beanName);
//	    }
//	}

	public void registerTest() throws Exception {

		QuotationDTO quot = new QuotationDTO();
		quot.setAcc_uuid(UUID.randomUUID().toString());
		quot.setAcc_num(1);
		quot.setClientNum(2);
		quot.setManagerNum(3);
		quot.setStorageId(4);
		quot.setProjectNum(5);
		quot.setStatus("1");
		quot.setCreated_at(LocalDateTime.now());
		quot.setModified_at(LocalDateTime.now());

		int result = mapper.insertQuot(quot);
		assertTrue(result > 0);
		log.info(quot);
	}

	public void ControllerRegisterTest() throws Exception {

		QuotationDTO quot = new QuotationDTO();
		quot.setAcc_uuid(UUID.randomUUID().toString());
		quot.setAcc_num(99);
		quot.setClientNum(88);
		quot.setManagerNum(77);
		quot.setStorageId(66);
		quot.setProjectNum(55);
		quot.setStatus("2");
		quot.setCreated_at(LocalDateTime.now());
		quot.setModified_at(LocalDateTime.now());
		quot.setDeleted_at(null);

		// 객체 생성하는 부분마다 JavaTimeModule 등록해야함
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.registerModule(new JavaTimeModule());

		mockMvc.perform(post("/quotation/register").contentType(MediaType.APPLICATION_JSON)
				.content(objectMapper.writeValueAsString(quot))).andExpect(status().isOk());
	}
	
	public void ControllerGetTest() throws Exception {
		log.info(mockMvc.perform(MockMvcRequestBuilders
				.get("/quotation/get")
				.param("acc_num", "99"))
				.andReturn()
				.getModelAndView().getModelMap());
	}
	
	@Test
	public void ControllerGetListTest() throws Exception {
		log.info(
				mockMvc.perform(MockMvcRequestBuilders.get("/quotation/list"))
				.andReturn()
				.getModelAndView()
				.getModelMap());
	}
}
