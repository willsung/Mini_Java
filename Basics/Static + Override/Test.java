class Test extends Student{
	public static void main(String args[]){
	
		Student s = new Student();
		Student s2 = new Student();
		
		s.name = "哈哈";
		s.age = 32;
		s.address = "河南";
		
		s.introduce();
		s.introduce("谷歌",23,"电饭锅");

		System.out.println("s的age  是：" + s.age + ";s2的age  是：" + s2.age);
	}
	
}