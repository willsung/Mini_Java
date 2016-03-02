import java.util.Scanner;

class Main{
	public static void main(String[] args){		
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		char[] org = str.toCharArray();
		
		for(int i = 0; i < org.length; i++){
			System.out.print(org[org.length - i - 1]);
		}
	}
}