package ssg.com.a.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class StudentController {
	
	@RequestMapping(value = "hello.do", method = RequestMethod.GET)
	public String hello() {
		System.out.println("HelloController hello() " + new Date());
		return "hello";
	}
}
