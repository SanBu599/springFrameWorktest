package ssg.com.a.dao;

import java.util.List;

import ssg.com.a.dto.MemberDto;

public interface MemberDao {

	List<MemberDto> allMember();
	
	MemberDto find(String id);
}
