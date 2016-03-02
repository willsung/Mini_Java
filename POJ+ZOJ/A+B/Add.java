import java.io.*;
import java.util.*;

public class Add{
	public static void main(String[] args) throws Exception{
		Scanner input = new Scanner(System.in);
		while (input.hasNextInt()){
			int a = input.nextInt();
			int b = input.nextInt();
			
			System.out.println(a + b);
		}
		
	}
}