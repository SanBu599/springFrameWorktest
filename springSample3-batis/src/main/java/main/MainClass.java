package main;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import dto.BbsDto;
import dto.BbsParam;
import dto.MemberDto;

public class MainClass {

	public static void main(String[] args) throws Exception {
		
		// configration(설정)파일을 load
		InputStream is = Resources.getResourceAsStream("mybatis/config.xml");
		
		// sqlSessionFactory 객체를 생성
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);	
		
		// sqlSession 객체를 생성
		SqlSession session = factory.openSession();
		
		// insert
		/*
		 * MemberDto dto = new MemberDto("aabb","1122","이승철","aabb@daum.net",0);
		 * 
		 * int count = session.insert("addmember", dto); 
		 * if(count>0) {
		 * session.commit(); //Db에 적용 
		 * System.out.println("추가성공!");
		 * }else { 
		 * session.rollback(); //취소
		 * System.out.println("추가실패"); }
		 */
		
		// select(1개의 row)
		/*
		 * String id = "aabb";
		 * MemberDto mem = session.selectOne("getMember",id);
		 * System.out.println(mem.toString());
		 */
		
		// select(다수의 row)
		/*
		 * List<MemberDto> list = session.selectList("allMember"); for(MemberDto m :
		 * list) { System.out.println(m.toString()); }
		 */
		
		// delete
		/*
		 * String id = "aabb"; 
		 * int count = session.delete("deleteMember", id);
		 * if(count>0) { 
		 * session.commit(); 
		 * System.out.println("삭제성공!"); 
		 * }else {
		 * session.rollback(); 
		 * System.out.println("삭제실패"); }
		 */
		
		// update
		
		/*
		 * MemberDto dto = new MemberDto("1111","111","Ireny","sksks@naver.com",0); int
		 * count = session.update("updateMember", dto); if(count>0) { session.commit();
		 * System.out.println("변경성공"); }else { session.rollback();
		 * System.out.println("변경실패"); }
		 */
		BbsParam param = new BbsParam("title", "111");
		List<BbsDto> list = session.selectList("search", param);
		for (BbsDto bbs : list) {
			System.out.println(bbs.toString());
		}
		}
		
		
	}

