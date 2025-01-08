package ecount.quotation.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ecount.quotation.service.QuotationService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/quotation/*")
@AllArgsConstructor
public class QuotationContoller {
	
	@Autowired
	private QuotationService service;
	
	@GetMapping("/list")
	public void list() {
		service.getList();
	}

	@PostMapping("/register")
	public void register() {
		
	}
}
