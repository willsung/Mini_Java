package com.willsung.singleton;

/*
 * 懒汉模式
 * 饿汉模式：加载慢，获取对象的速度快，线程安全
 * 懒汉模式：加载快，获取对象的速度慢，线程不安全
 */
public class Singleton2 {

	//将构造方法私有化，不允许外界直接创建类的对象
	private Singleton2(){
		
	}
	
	//声明类的实例，使用private static修饰
	private static Singleton2 instance;
	
	//提供获取类实例的方法，用public static修饰
	public static Singleton2 getInstance(){
		if (instance == null) {
			instance = new Singleton2();
		}
		return instance;
	}
}
