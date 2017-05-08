package org.zerock.web;

import javax.inject.Inject;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;
import org.zerock.domain.PageMaker;
import org.zerock.service.BoardService;

@Controller
@RequestMapping("/sub")
public class SubController {
	
	static final Logger logger = Logger.getLogger(SubController.class);
	
	@Inject
	BoardService service;
	
	@GetMapping
	public void subGet(BoardVO vo, Model model, @RequestParam("bno") int bno, @RequestParam("page") int page){
		
		logger.info(vo);
		
		logger.info(page);
		
		
		System.out.println("bno==================" + bno);
		vo = service.read(bno);
				
		model.addAttribute("vo",vo);
		
		
	}
	
}

