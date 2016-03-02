class A{

	A(){
		System.out.println("我是构造函数。");
	}
	void fun(){
		System.out.println("没有参数的fun().");
	}
	
	void fun(int i){
		System.out.println("带有参数的fun().");
	}

	void fun(int i,char j){
		System.out.println("带有两个参数的fun().");
	}
}