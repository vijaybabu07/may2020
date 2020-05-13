package javaexercises;

public class Constuctor1 {
	Constuctor1()
	{
		System.out.println("This is constructor");
	}
	public void method1()
	{
		System.out.println("This is method");
	}

	public static void main(String[] args) {
		Constuctor1 o=new Constuctor1();
		o.method1();
	}

}
