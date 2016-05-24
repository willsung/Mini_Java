package com.willsung.singleton;

/*
 *单例模式
 *作用：保证整个应用中某个类的实例有且只有一个
 *类型：饿汉模式、懒汉模式 
 */

public class Singleton {
	
	//构造方法私有化，不允许外加直接创建对象
	private Singleton(){
		
	}
	
	//创建类的唯一实例，用private static修饰
	//类加载的时候创建类的实例
	private static Singleton instance = new Singleton();
	
	//提供用于获取实例的方法，用public static修饰
	public static Singleton getInstance(){
		return instance;
	}
}
