package ecount.quotation.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/quotation/*")
@AllArgsConstructor
public class QuotationContoller {

	@PostMapping("/register")
	public void register() {
		
	}
}
