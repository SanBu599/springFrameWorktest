package ssg.com.a.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ssg.com.a.dto.BbsComment;
import ssg.com.a.dto.BbsDto;
import ssg.com.a.dto.BbsParam;
import ssg.com.a.dto.BbsUpdate;
import ssg.com.a.dto.PdsDto;

@Repository
public class BbsDaoImpl implements BbsDao{

	@Autowired
	SqlSessionTemplate session;
	
	String ns = "Bbs.";

	@Override
	public List<BbsDto> bbslist(BbsParam param) {
		return session.selectList(ns + "bbslist", param);		
	}

	@Override
	public int getAllBbs(BbsParam param) {
		return session.selectOne(ns + "getallbbs", param);
	}

	@Override
	public int bbswrite(BbsDto dto) {		
		return session.insert(ns + "bbswrite", dto);
	}

	@Override
	public BbsDto bbsdetail(int seq) {		
		return session.selectOne(ns + "bbsdetail", seq);
	}

	@Override
	public int commentWrite(BbsComment comment) {		
		return session.insert(ns + "commentWrite", comment);
	}

	@Override
	public List<BbsComment> commentList(int seq) {		
		return session.selectList(ns + "commentList", seq);
	}

	@Override
	public PdsDto getPds(int seq) {
		
		return session.selectOne(ns+"getPds",seq);
	}

	@Override
	public int bbsupdate(BbsUpdate update) {
		
		return session.update(ns+"bbsupdate",update);
	}
	
	
}
