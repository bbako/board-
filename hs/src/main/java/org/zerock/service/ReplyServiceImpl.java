package org.zerock.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.zerock.domain.ReplyVO;
import org.zerock.persistence.ReplyDAO;

@Service
public class ReplyServiceImpl implements ReplyService {

	@Inject
	ReplyDAO dao;
	
	@Override
	public List<ReplyVO> read(int bno) {
		return dao.read(bno);
	}

	@Override
	public void recreate(ReplyVO vo) {
				dao.recreate(vo);
		
	}

	@Override
	public void reupdate(ReplyVO vo) {
			dao.update(vo);
		
	}

	@Override
	public void redelete(ReplyVO vo) {
			dao.delete(vo);
	}

}
