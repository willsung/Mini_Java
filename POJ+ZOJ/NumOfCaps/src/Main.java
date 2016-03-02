import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);	//定义监视器接收外部输入；
		String str = input.nextLine();			//将外部输入存入字符串中；
		char[] arr = str.toCharArray();			//将字符串转存在字符数组中；
		System.out.println(sum(arr));			//调用sum()函数，并输出返回值；
	}

	static int sum(char[] exm){
		int i = 0,j = 0;
		for(; i < exm.length;i++){	//对数组从头到尾扫描；
			if((exm[i] >= 'A') && (exm[i] <= 'Z')){
				j++;				//若是数组元素属于A到Z，则j自加1；
			}
		}
		return j;
	}
}