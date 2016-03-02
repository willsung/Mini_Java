import java.lang.reflect.Array;
import java.util.*;

class Main{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] ch = str.toCharArray();
		System.out.println(counter(ch));
	}
	
	
	static int counter(char[] ch){
	
		int count = 0;
		int flag = 0;
		char[] temp = null;
		for(int i = 0;i < 200;i++){
			for(int j = 0;j < 200;j++){
				if(ch.toString().equals(temp.toString())){
					flag = 0;
				}
				else flag = 1;
				
				if(flag == 1){
					count++;
				}
			}
		}
		return count;
	}
}