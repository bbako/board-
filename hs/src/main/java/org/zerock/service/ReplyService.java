package org.zerock.service;

import java.util.List;

import org.zerock.domain.ReplyVO;

public interface ReplyService {

	public List<ReplyVO> read(int bno);
	
	public void recreate(ReplyVO vo);
	
	public void reupdate(ReplyVO vo);
	
	public void redelete(ReplyVO vo);
}
