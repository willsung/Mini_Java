public class Person{

	String name;
	String address;
	int age;
	
	Person(){
		System.out.println("无参数的构造函数");
	}
	
	Person(String name,int age){
		this();
		this.name = name;
		this.age = age;
		System.out.println("两个参数的构造函数");
	}
	
	Person(String name,int age, String address){ 
		this(name,age);
		//上面这个this语句，调用上一个Person()构造函数，调用依据是函数中的参数。并且类似这种语句必须作为构造函数的第一个语句
		this.address = address;
		System.out.println("三个函数的构造函数");
		System.out.println("name 是" + name);
		System.out.println("name 是" + this.name);
		//name前加上this，表示是成员变量
		//name前不加this，表示是函数中的参数
	
		
	}
	
	void talk(){
		System.out.println("My name is " + name + ".My age is " + age + ".我来自" + address);
		//name 前面省略了"this."
	}
	
}