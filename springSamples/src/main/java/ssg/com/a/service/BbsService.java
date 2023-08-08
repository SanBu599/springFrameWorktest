package ssg.com.a.service;

import java.util.List;

import ssg.com.a.dto.BbsComment;
import ssg.com.a.dto.BbsDto;
import ssg.com.a.dto.BbsParam;
import ssg.com.a.dto.BbsUpdate;

public interface BbsService {

	List<BbsDto> bbslist(BbsParam param);
	int getAllBbs(BbsParam param);	
	boolean bbswrite(BbsDto dto);	
	BbsDto bbsdetail(int seq);
	
	boolean commentWrite(BbsComment comment);
	List<BbsComment> commentList(int seq);
	boolean bbsupdate(BbsUpdate update);
}







