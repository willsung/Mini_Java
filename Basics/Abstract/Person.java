//���ǳ���ģ������Ǿ���ģ�
//ֻҪ���ڳ����������ڵ���Ҳ���붨��Ϊ��������
//�����౾�������ɶ���ֻ��ͨ�����������ɶ���
abstract class Person{

	//�����PersonҲ�ǹ��캯�����������һЩ������Ϣ
	Person(){
		System.out.println("Person�Ĺ��캯�������������Ϣ��");
	}

	String name;
	int age; 
	
	void introduce(){
		System.out.println("�ҵ������ǣ�" + name + ",�ҵ������ǣ�" + age);
	}
	
	abstract void eat();
	
}