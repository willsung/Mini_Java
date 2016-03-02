class Exception{
	public static void main(String arge[]){
		
		try{
			int i = 2 / 1;
			System.out.println("条件判断语句之后的输出语句。");
		}
		
		catch(Exception e){
			System.out.println("catch用以显示具体的异常信息。");
		}
		
		finally{
			System.out.println("收尾步骤finally中的输出语句。");
		}
	}
}