package ssg.com.a.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ssg.com.a.dao.BbsDao;
import ssg.com.a.dto.BbsComment;
import ssg.com.a.dto.BbsDto;
import ssg.com.a.dto.BbsParam;
import ssg.com.a.dto.BbsUpdate;

@Service
public class BbsServiceImpl implements BbsService{

	@Autowired
	BbsDao dao;

	@Override
	public List<BbsDto> bbslist(BbsParam param) {		
		return dao.bbslist(param);
	}

	@Override
	public int getAllBbs(BbsParam param) {		
		return dao.getAllBbs(param);
	}

	@Override
	public boolean bbswrite(BbsDto dto) {		
		return dao.bbswrite(dto)>0?true:false;
	}

	@Override
	public BbsDto bbsdetail(int seq) {		
		return dao.bbsdetail(seq);
	}

	@Override
	public boolean commentWrite(BbsComment comment) {		
		return dao.commentWrite(comment)>0?true:false;
	}

	@Override
	public List<BbsComment> commentList(int seq) {		
		return dao.commentList(seq);
	}
	@Override
	public boolean bbsupdate(BbsUpdate update) {
		
		return dao.bbsupdate(update)>0?true:false;
	}			
	
}
