package javaexercises;

public class ConstructOverload {
	int a,b,c;
	ConstructOverload(int m1,int m2) {
		a=m1;
		b=m2;
	}
	public void total1()
	{
		System.out.println(a+b);
	}
	ConstructOverload(int m1,int m2,int m3) {
		a=m1;
		b=m2;
		c=m3;
	}
	public void total2()
	{
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) {
		ConstructOverload o1=new ConstructOverload(2,3);
		o1.total1();
		ConstructOverload o2=new ConstructOverload(2,3,4);
		o2.total2();
		

	}

}
