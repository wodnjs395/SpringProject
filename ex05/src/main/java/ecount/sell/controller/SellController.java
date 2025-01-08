package ecount.sell.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ecount.sell.domain.PageDTO;

import ecount.sell.domain.Criteria;
import ecount.sell.service.SellService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/sell/*")
@AllArgsConstructor

public class SellController {
	private SellService service;
	
	
	
	@GetMapping("/list")
	public void list(Criteria cri, Model model) {
		
		model.addAttribute("list", service.getList(cri));
		
		int total = service.getTotal(cri);
		
		model.addAttribute("pageMaker", new PageDTO(total, cri));
		
	}
	
	
	@GetMapping("/list2")
	public void list2(Model model) {
		
		model.addAttribute("list", service.getList2());
		
		
	}
	
}
