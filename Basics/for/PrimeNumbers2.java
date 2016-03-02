class PrimeNumbers2{
	public static void main(String arge[]){
		for(int i = 100;i < 200;i++){
			boolean bl = true;
			for(int j = 2;j < i;j++){
				int k = i %j;
				if(k == 0)
					bl = false;
			}
			if(bl)
				System.out.println(i);
		}
		
	}
}