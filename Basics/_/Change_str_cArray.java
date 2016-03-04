public class Change_str_cArray{
	String str = new String("good");
	char[] ch = {'a', 'b', 'c'};
	public static void main(String[] args){
		Change_str_cArray ex = new Change_str_cArray();
		ex.change(ex.str, ex.ch);
		System.out.print(ex.str + " and ");
		System.out.println(ex.ch);
	}
	
	public void change(String str, char[] ch){
		str = "test ok";
		ch[0] = 'g';
	}
}