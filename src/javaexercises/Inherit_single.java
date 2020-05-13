package javaexercises;
class Parent{
	public void land()
	{
		System.out.println("land");
	}
}
class Child extends Parent{
	public void gold()
	{
		System.out.println("gold");
	}
}
public class Inherit_single {

	public static void main(String[] args) {
		Child c=new Child();
		c.land();
		c.gold();

	}

}
