package javaexercises;

public class Methods {

	public static void a()
	{
		System.out.println("This is static method");
	}
	public void b()
	{
		System.out.println("This is non static method");
	}
	public static void main(String[] args) {
		a();
		Methods o=new Methods();
		o.b();
		

	}

}
