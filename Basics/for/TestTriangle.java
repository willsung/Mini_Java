import java.util.Scanner;

class TestTriangle{
	public static void main(String arge[]){
		Scanner sc = new Scanner(System.in);
		int m = sc.nextint();
		System.out.println("请输入一个m的值"):
		for(int i = 1;i < ;i++){
			for(int j = 0;j < 4 - i;j++){
				System.out.print(" ");
			}
			for(int k = 0;k < i;k++){
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}