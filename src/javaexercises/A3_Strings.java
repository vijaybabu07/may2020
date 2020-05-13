package javaexercises;

public class A3_Strings {

	public static void main(String[] args) {
		String a="abcd";
		String b="xyz";
		String c="abcd xyz klmn 1234 4567";
		if(a.length()>b.length() && a.length()<c.length())
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("fail");
		}
		String ab=a.concat(b);
		if(ab.length()<c.length())
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("fail");
		}
		if(a.startsWith("ab")==true && b.endsWith("yz")!=true)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("fail");
		}
		if(c.contains(" ")==true && c.contains("9")==false)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("fail");
		}
		
	}

}
