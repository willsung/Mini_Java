import java.io.IOException;
import java.util.*;

class Main{
	public static void main(String args[]) throws IOException{
		Scanner input = new Scanner(System.in);
		String DNAstr = input.nextLine();
		int n = input.nextInt();//����n�����ڴ洢���ⲿ�����һ������
		
		System.out.println(MaxSubOfDNA(DNAstr,n));
	}
	//ɸѡ���ַ���str�ĳ���n�Ӵ���GC-�������Ӵ�
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