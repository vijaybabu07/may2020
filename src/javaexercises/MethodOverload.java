package javaexercises;

public class MethodOverload {
	public static void opensheet(String sname)
	{
		System.out.println(sname+"  opened successfully");
	}
	public static void opensheet(int sno)
	{
		System.out.println("Sheet "+sno+" opened successfully");
	}

	public static void main(String[] args) {
		opensheet(1);
		opensheet("sheet1");
		opensheet(2);
		opensheet("sheet2");
	}

}
