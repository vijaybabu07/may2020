package javaexercises;
class Parent1
{
	public void land()
	{
		System.out.println("land");
	}
}
class Child1 extends Parent1
{
	public void gold()
	{
		System.out.println("gold");
	}
}
class Child2 extends Parent1{
	public void business()
	{
		System.out.println("business");
	}
}
public class Inherit_Hierarchy {

	public static void main(String[] args) {
		Child1 c1=new Child1();
		c1.land();
		c1.gold();
		Child2 c2=new Child2();
		c2.land();
		c2.business();

	}

}
