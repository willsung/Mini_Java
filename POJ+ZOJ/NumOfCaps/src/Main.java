import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);	//��������������ⲿ���룻
		String str = input.nextLine();			//���ⲿ��������ַ����У�
		char[] arr = str.toCharArray();			//���ַ���ת�����ַ������У�
		System.out.println(sum(arr));			//����sum()���������������ֵ��
	}

	static int sum(char[] exm){
		int i = 0,j = 0;
		for(; i < exm.length;i++){	//�������ͷ��βɨ�裻
			if((exm[i] >= 'A') && (exm[i] <= 'Z')){
				j++;				//��������Ԫ������A��Z����j�Լ�1��
			}
		}
		return j;
	}
}