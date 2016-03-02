package com.willsuny;

//可以被外部类继承并调用的话必须声明为public类型，无论类、成员变量、成员函数。
//不声明为public的话，在编译时会提示“Person在com.willsuny中不是公共的”。
public class Person{

	//下面的Person函数是构造函数，不需要子类引用就可以实现。
	public Person(){
		System.out.println("Person类中的函数");
	}

	public String name;
	public int age;
	
	public void introduce(){
		System.out.println("姓名：" + name + "\n年龄：" + age);
	}
	
}