package org.zerock.persistence;

import java.util.List;

import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;

public interface BoardDAO {
	
	public String getTime() ;
	
	public List<BoardVO> listAll(Criteria cri);

	public int totalCount();
	
	public void creat(BoardVO vo);
	
	public BoardVO read(int bno);
}
