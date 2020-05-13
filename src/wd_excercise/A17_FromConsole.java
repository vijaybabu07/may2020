package wd_excercise;

import java.util.Scanner;

public class A17_FromConsole {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a:");
		int a=s.nextInt();
		System.out.println("Enter b:");
		int b=s.nextInt();
		System.out.println("Product of a&b:"+a*b);
		System.out.println("Enter string1");
		String s1=s.nextLine();
		System.out.println("Enter string2");
		String s2=s.nextLine();
		System.out.println("Concat of s1 and s2:"+s1.concat(s2));

	}

}
