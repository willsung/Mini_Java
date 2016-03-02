class Student extends Person{

	String address;
	
	//只有存在父子继承关系的两个类中的成员函数才存在复写；
	//函数复写要求成员函数的函数名、变量名等全部相同。
	void introduce(String name,int age,String address){
		this.address = address;
		System.out.println("Student中的introduce方法。");
		System.out.println(address);
	}
	
}