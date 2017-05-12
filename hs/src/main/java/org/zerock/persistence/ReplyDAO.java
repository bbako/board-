package org.zerock.persistence;

import java.util.List;

import org.zerock.domain.ReplyVO;

public interface ReplyDAO {
	
	public List<ReplyVO> read(int bno);  

	public void recreate(ReplyVO vo);
	
	public void update(ReplyVO vo);
	
	public void delete(ReplyVO vo);
	
}
