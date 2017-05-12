package org.zerock.web;

import java.util.List;

import javax.inject.Inject;

import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;
import org.zerock.domain.ReplyVO;
import org.zerock.service.ReplyService;

@Controller
@RequestMapping("/reply")
public class ReplyController {

	static final Logger logger = Logger.getLogger(SubController.class);
	
	@Inject
	ReplyService reservice;
	
	
	@GetMapping
	public ResponseEntity<List<ReplyVO>> replyGet(BoardVO vo, Model model, Criteria cri){
		logger.info("reply get!!!!");
		logger.info(vo);
		logger.info(cri);		
		logger.info(cri.getPage());	
		
		model.addAttribute("vo",vo);
		model.addAttribute("cri",cri);

		ResponseEntity<List<ReplyVO>> entity=null;
		
		logger.info(reservice.read(vo.getBno()));
		
		entity= new ResponseEntity<List<ReplyVO>>(reservice.read(vo.getBno()),HttpStatus.OK);
		
		logger.info(entity);
		
		return entity;
		
		
	}
	
	@PostMapping
	public ResponseEntity<String> replyPost(@RequestBody ReplyVO vo){

		logger.info("reply post!!!!");
		logger.info(vo);
		
		ResponseEntity<String> entity=null;
		reservice.recreate(vo);
		entity= new ResponseEntity<String>("success",HttpStatus.OK);
		
		logger.info(entity);
		
		return entity;
		
		
	}
	
	
	
}
