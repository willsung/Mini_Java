public class TestEquals{
	public static void main(String[] args){
		Cat c1 = new Cat(1,2,3);
		Cat c2 = new Cat(1,2,3);
		//在没有重写equals方法之前，说下面两条语句比较的是两个对象的引用是否等同，形式不同作用完全相同；
		System.out.println(c1 == c2);
		System.out.println(c1.equals(c2));
	}
}

class Cat{
	int color;
	int height, weight;
	
	public Cat(int color, int height, int weght){
		this.color = color;
		this.height = height;
		this.weight = weight;
	}
}