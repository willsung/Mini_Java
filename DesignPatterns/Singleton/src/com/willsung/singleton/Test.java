package com.willsung.singleton;

public class Test {

	public static void main(String[] args) {
		
		//饿汉模式
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		if (s1 == s2) {
			System.out.println("s1 == s2");
		}else {
			System.out.println("s1 != s2");
		}
		
		//懒汉模式
		Singleton2 s3 = Singleton2.getInstance();
		Singleton2 s4 = Singleton2.getInstance();
		if(s3 == s4){
			System.out.println("s3 == s4");
		}
		else {
			System.out.println("s3 != s4");
		}
	}

}
