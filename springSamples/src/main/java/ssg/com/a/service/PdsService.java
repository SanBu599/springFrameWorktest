package ssg.com.a.service;

import java.util.List;

import ssg.com.a.dto.BbsUpdate;
import ssg.com.a.dto.PdsDto;

public interface PdsService {

	List<PdsDto> pdslist();
	
	boolean uploadPds(PdsDto pds);
	
	PdsDto getPds(int seq);
	
	
}
