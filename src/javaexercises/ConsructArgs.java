package javaexercises;

public class ConsructArgs {

	int a, b;
	public ConsructArgs(int m1,int m2) {
		a=m1;
		b=m2;
		
	}
	public void total()
	{
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		ConsructArgs o=new ConsructArgs(2, 3);
		o.total();
		ConsructArgs o1=new ConsructArgs(20, 13);
		o1.total();

	}

}
