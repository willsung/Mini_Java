//方法一：继承抽象函数得来的子类也要是抽象函数才能编译通过
//abstract class Student extends Person{
//方法二：对子类中的抽象函数进行复写；
class Student extends Person{

	//下面的Student函数为构造函数.用以输出一些附加信息
	Student(){
		super();
		System.out.println("Student的构造函数，输出附加信息。");
	}
	
	void eat(){
		System.out.println("吃起来不错！");
	}
	
}