package com.training.lambda.syntax;
public class Student {
	
	Long id;
	String name;
	int age;
	
	
	
	public Student(Long id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
		StringBuffer buff = new StringBuffer();
		buff.append("ID:").append(id).append("\n");
		buff.append("NAME:").append(name).append("\n");
		buff.append("AGE:").append(age).append("\n");
		return buff.toString();
	}

}
