package org.zerock.service;

import java.util.List;

import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;

public interface BoardService {

	public int totalCount();
	
	public List<BoardVO> listAll(Criteria cri);

	public void regist(BoardVO vo);
	
	public BoardVO read(int bno);
	
}
