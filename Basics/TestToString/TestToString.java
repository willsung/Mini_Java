public class TestToString{
	public static void main(String[] args){
		Dog d = new Dog();
		//������������������һģһ����
		System.out.println("d:" + d.toString());
		System.out.println("d:" + d);
	}
}

class Dog{
	//ע�⣻��������дһ����Ҫ����������ȫһ��������
	public String toString(){
		return "I'm a COOL dog.";
	}
}