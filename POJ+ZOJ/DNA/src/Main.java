import java.io.IOException;
import java.util.*;

class Main{
	public static void main(String args[]) throws IOException{
		Scanner input = new Scanner(System.in);
		String DNAstr = input.nextLine();
		int n = input.nextInt();//定义n，用于存储从外部输入的一个数字
		
		System.out.println(MaxSubOfDNA(DNAstr,n));
	}
	//筛选出字符串str的长度n子串中GC-比最大的子串
	static String MaxSubOfDNA(String str,int n){
		int i,j,temp = 0;
		int[] max = new int[200];

		for(i = 0;i <= str.length() - n;i++){
			for(j = i;j <= i + n - 1;j++){
				if((str.charAt(j) == 'G') || (str.charAt(j) == 'C'))
					max[i]++;
			}
		}
		
		for(i = 0;i < (str.length() - n + 1);i++)
			if(max[0] < max[i]){
				max[0] = max[i];
				temp = i;
			}
		return str.substring(temp,temp + n);
	}
}