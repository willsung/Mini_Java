import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		String str2ch = input.nextLine();
		
		System.out.println(getNumOfChar(str,str2ch.charAt(0)));
	}
	
	static int getNumOfChar(String str,char ch){
		int i,num = 0;
		for(i = 0;i < str.length();i++){
			if(str.charAt(i) >= 'A' || str.charAt(i) <= 'Z' ||str.charAt(i) >= 'a' || str.charAt(i) <= 'z' || str.charAt(i) == ' ')
				if(str.toCharArray()[i] == ch)
					num++;
		}
		return num;
	}
}