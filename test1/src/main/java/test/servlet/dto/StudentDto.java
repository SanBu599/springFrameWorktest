package test.servlet.dto;

import java.io.Serializable;

public class StudentDto  implements  Serializable{
	
	private String name;
	private int age;
	
	
	
	public StudentDto() {
		super();
		// TODO Auto-generated constructor stub
	}



	public StudentDto(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	@Override
	public String toString() {
		return "StudentDto [name=" + name + ", age=" + age + "]";
	}
	
	
}
