//����һ���̳г���������������ҲҪ�ǳ��������ܱ���ͨ��
//abstract class Student extends Person{
//���������������еĳ��������и�д��
class Student extends Person{

	//�����Student����Ϊ���캯��.�������һЩ������Ϣ
	Student(){
		super();
		System.out.println("Student�Ĺ��캯�������������Ϣ��");
	}
	
	void eat(){
		System.out.println("����������");
	}
	
}