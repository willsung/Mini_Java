public class TestToString{
	public static void main(String[] args){
		Dog d = new Dog();
		//下面两条语句的作用是一模一样。
		System.out.println("d:" + d.toString());
		System.out.println("d:" + d);
	}
}

class Dog{
	//注意；方法的重写一定是要方法名字完全一样！！！
	public String toString(){
		return "I'm a COOL dog.";
	}
}