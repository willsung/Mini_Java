package com.willsuny;

public class Person{

	public String name;
	public String school;
	public int age;
	
	public void write(String name){
		System.out.println("������" + name);
	}
	
	public void write(String name,int age){
		this.write(name);
		System.out.println("���䣺" + age);
	}
	
	public void write(String name,int age,String school){
		this.write(name,age);
		System.out.println("��ַ��" + school);
	}
	
}