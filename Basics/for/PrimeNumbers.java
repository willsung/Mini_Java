//��ӡ��100-200֮�����е�������

class PrimeNumbers{
	public static void main(String args[]){
		for(int i = 100 ; i < 201 ; i++){
			boolean b = true;
			for(int j = 2 ; j < i; j++){
				int k = i % j ;
				if(k == 0){
					b = false;
				}
			}
			if(b){
				System.out.println(i);
			}
		}
	}
}
