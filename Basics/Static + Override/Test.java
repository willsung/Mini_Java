class Test extends Student{
	public static void main(String args[]){
	
		Student s = new Student();
		Student s2 = new Student();
		
		s.name = "����";
		s.age = 32;
		s.address = "����";
		
		s.introduce();
		s.introduce("�ȸ�",23,"�緹��");

		System.out.println("s��age  �ǣ�" + s.age + ";s2��age  �ǣ�" + s2.age);
	}
	
}