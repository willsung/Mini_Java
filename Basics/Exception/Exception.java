class Exception{
	public static void main(String arge[]){
		
		try{
			int i = 2 / 1;
			System.out.println("�����ж����֮��������䡣");
		}
		
		catch(Exception e){
			System.out.println("catch������ʾ������쳣��Ϣ��");
		}
		
		finally{
			System.out.println("��β����finally�е������䡣");
		}
	}
}