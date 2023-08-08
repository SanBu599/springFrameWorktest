package ssg.com.a.dao;

import java.util.List;

import ssg.com.a.dto.BbsComment;
import ssg.com.a.dto.BbsDto;
import ssg.com.a.dto.BbsParam;
import ssg.com.a.dto.PdsDto;
import ssg.com.a.dto.BbsUpdate;

public interface BbsDao {
	
	List<BbsDto> bbslist(BbsParam param);
	int getAllBbs(BbsParam param);	
	int bbswrite(BbsDto dto);	
	BbsDto bbsdetail(int seq);
	
	int commentWrite(BbsComment comment);
	List<BbsComment> commentList(int seq);
	
	PdsDto getPds(int seq);
	
	int bbsupdate(BbsUpdate update);
}





