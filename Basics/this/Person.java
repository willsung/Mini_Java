public class Person{

	String name;
	String address;
	int age;
	
	Person(){
		System.out.println("�޲����Ĺ��캯��");
	}
	
	Person(String name,int age){
		this();
		this.name = name;
		this.age = age;
		System.out.println("���������Ĺ��캯��");
	}
	
	Person(String name,int age, String address){ 
		this(name,age);
		//�������this��䣬������һ��Person()���캯�������������Ǻ����еĲ�������������������������Ϊ���캯���ĵ�һ�����
		this.address = address;
		System.out.println("���������Ĺ��캯��");
		System.out.println("name ��" + name);
		System.out.println("name ��" + this.name);
		//nameǰ����this����ʾ�ǳ�Ա����
		//nameǰ����this����ʾ�Ǻ����еĲ���
	
		
	}
	
	void talk(){
		System.out.println("My name is " + name + ".My age is " + age + ".������" + address);
		//name ǰ��ʡ����"this."
	}
	
}