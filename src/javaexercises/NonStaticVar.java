package javaexercises;

public class NonStaticVar {
	public int a=20;
	public int b=3;
	public static void main(String[] args) {
		NonStaticVar o=new NonStaticVar();
		System.out.println(o.a*o.b);

	}

}
