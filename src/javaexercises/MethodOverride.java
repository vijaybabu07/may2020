package javaexercises;
class A
{
	public void m()
	{
		System.out.println("This is a method in class A");
	}
}
class B extends A
{
	public void m()
	{
		System.out.println("This is a method in class B");
	}
}
class C extends B
{
	public void m()
	{
		System.out.println("This is a method in class C");
	}
}

public class MethodOverride extends C {

	public static void main(String[] args) {
		MethodOverride o=new MethodOverride();
		o.m();
		
	}

}
