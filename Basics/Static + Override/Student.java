class Student extends Person{

	String address;
	
	//ֻ�д��ڸ��Ӽ̳й�ϵ���������еĳ�Ա�����Ŵ��ڸ�д��
	//������дҪ���Ա�����ĺ���������������ȫ����ͬ��
	void introduce(String name,int age,String address){
		this.address = address;
		System.out.println("Student�е�introduce������");
		System.out.println(address);
	}
	
}