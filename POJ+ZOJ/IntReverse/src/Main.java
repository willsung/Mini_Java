import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner Int = new Scanner(System.in);
		
		long a = Int.nextInt();
		String str = String.valueOf(a);
		char[] ch = str.toCharArray();
		
		for(int i = 0;i < ch.length;i++){
			System.out.print(ch[ch.length - i - 1]);
		}
	}
}