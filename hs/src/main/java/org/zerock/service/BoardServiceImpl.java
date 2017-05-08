package org.zerock.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;
import org.zerock.persistence.BoardDAO;

@Service
public class BoardServiceImpl implements BoardService {

	@Inject
	BoardDAO dao;

	@Override
	public List<BoardVO> listAll(Criteria cri) {
		return dao.listAll(cri);
	}

	@Override
	public void regist(BoardVO vo) {
		dao.creat(vo);
	}

	@Override
	public int totalCount() {
		return dao.totalCount();
	}

	@Override
	public BoardVO read(int bno) {
		return dao.read(bno);
	}

}
