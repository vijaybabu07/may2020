package javaexercises;

class GrandParents{
	public void land()
	{
		System.out.println("land");
	}
}
class Parents extends GrandParents{
	public void business()
	{
		System.out.println("business");
	}
}
class Children extends Parents{
	public void gold()
	{
		System.out.println("gold");
	}
}

public class Inherit_multiLevel {

	public static void main(String[] args) {
		Children c=new Children();
		c.land();
		c.business();
		c.gold();

	}

}
