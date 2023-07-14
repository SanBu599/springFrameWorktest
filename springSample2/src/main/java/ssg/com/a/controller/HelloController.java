package ssg.com.a.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import org.apache.catalina.connector.Response;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ssg.com.a.dto.StudentDto;

@Controller		// <- annotation
public class HelloController {

	@RequestMapping("/hello")
	public String hello() {
		System.out.println("HelloController hello() " + new Date());
		return "hello";		// hello.jsp 로 가라!
	}
	@RequestMapping(value = "home.do",method = RequestMethod.GET)
	public String home(Model model) {
		System.out.println("HelloController home() " + new Date());
		
		String name= "홍길동";
		model.addAttribute("name",name);
		
		return "home";		// home.jsp로 가라!	forward
	}
	
	@RequestMapping(value = "world.do", method = {RequestMethod.GET, RequestMethod.POST } )
	public String world(String name, int age) {
		
		
		System.out.println("HelloController world() " + new Date());
		
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		
		return "home";
	}
	//@RequestMapping(value = "object.do",method = RequestMethod.POST)
	@PostMapping("object.do")
	public String objectMethod(StudentDto dto) {
		System.out.println("HelloController objectMethod()" +new Date());
		
		System.out.println(dto.toString());
		
		
		
		
		return "home";
	}
	/*
	 	message 출력
	 	
		StudentDto - > 3명의 데이터
		list로 보낸다.
	 */
	
	@GetMapping("list.do")
	public String listMethod(String message, Model model) {
		System.out.println("HelloController listMethod()" +new Date());
		
		System.out.println("message"+message);
		
		List<StudentDto> list = new ArrayList<StudentDto>();
		list.add(new StudentDto("홍길동",24));
		list.add(new StudentDto("제갈길동",12));
		list.add(new StudentDto("고길동",64));
		
		model.addAttribute("list",list);
		
		return "home";
		
	}
}
	
	
