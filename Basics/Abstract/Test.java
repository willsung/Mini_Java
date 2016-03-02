class Test{
	public static void main(String args[]){
	
		Person p = new Student();//这个语句是向上转型
		
		p.name = "热";
		p.age = 23;
		
		p.eat();
		p.introduce();
	}
	
}