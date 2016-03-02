package com.willsuny;

public class Person{

	public String name;
	public String school;
	public int age;
	
	public void write(String name){
		System.out.println("ĞÕÃû£º" + name);
	}
	
	public void write(String name,int age){
		this.write(name);
		System.out.println("ÄêÁä£º" + age);
	}
	
	public void write(String name,int age,String school){
		this.write(name,age);
		System.out.println("µØÖ·£º" + school);
	}
	
}