package org.zerock.persistence;

import java.util.List;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;
import org.zerock.domain.ReplyVO;

@Repository
public class ReplyDAOImpl implements ReplyDAO {
	
	static final String namespace="org.zerock.persistence.ReplyDAO";

	@Inject
	SqlSessionTemplate sess;
	
	@Override
	public List<ReplyVO> read(int bno) {
		return sess.selectList(namespace+".replylist", bno);
	}

	@Override
	public void recreate(ReplyVO vo) {
		sess.insert(namespace+".recreate",vo);
		
	}

	@Override
	public void update(ReplyVO vo) {
		sess.update(namespace+".reupdate",vo);
		
	}

	@Override
	public void delete(ReplyVO vo) {
		sess.update(namespace+".redelete",vo);
	}

}
