//类是抽象的，对象是具体的；
//只要存在抽象函数，所在的类也必须定义为抽象函数；
//抽象类本身不能生成对象，只能通过子类来生成对象；
abstract class Person{

	//下面的Person也是构造函数，用以输出一些附加信息
	Person(){
		System.out.println("Person的构造函数，输出附加信息。");
	}

	String name;
	int age; 
	
	void introduce(){
		System.out.println("我的名字是：" + name + ",我的年龄是：" + age);
	}
	
	abstract void eat();
	
}