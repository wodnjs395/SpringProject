package ecount.quotation.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ecount.quotation.domain.QuotationDTO;
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
	public ResponseEntity<String> register(@RequestBody QuotationDTO quot) {

		log.info("Quotation received: {}" + quot);

		service.register(quot);

		return ResponseEntity.ok("success");
	}

	@GetMapping("/get")
	public void get(@RequestParam("acc_num") int acc_num, Model model) {
		model.addAttribute("quot", service.get(acc_num));
	}

}
