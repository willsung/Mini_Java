import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		char[] arr = str.toCharArray();
		int i,j,k = 0;
		for(i = 0;i < str.length();){
			if(arr[i] == ' '){
				for(j = i;j < str.length() - 1;){ //ע��j < str.length() - 1�б����С�-1����������������Խ���쳣��
					j++;
					if(arr[j] != ' '){
						k = 0;
						break;
					}
					else 
						continue;
				}
			}
			else k++;
			i++;
		}
		System.out.println(k);
	}
}