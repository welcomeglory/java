package com.fxmx.simple;
public class Child {
	private int age;
	private String name;	
	
	public Child(int age,String name) {
	setAge(age);
	setName(name);
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if( age <0 ) {
			age=0;
			return;
		}			
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if( name == null ) {
			this.name = "잘못된 이름 입니다.";
			return;
		}	
		this.name = name;
	}
	public void showInfo() {
		System.out.println("나이: " + age);
		System.out.println("이름: " + name);
	}
}
