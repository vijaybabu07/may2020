package javaexercises;

public class A1_stringlength {

		public static void main(String[] args) {
			String a="abcdef";
			String b="xyz1234";
			String c="abcxy";
			int alen=a.length();
			System.out.println("a length="+alen);
			int blen=b.length();
			System.out.println("b length="+blen);
			int clen=c.length();
			System.out.println("c length="+clen);
			if(alen>clen && alen<blen)
			{
				System.out.println("true");
			}
			else
			{
				System.out.println("false");
			}
			if(a.equals(b)==false && a.equals(c)==false)
			{
				System.out.println("true");
			}
			else
			{
				System.out.println("false");
			}
			if(a.contains("cd")==true && a.contains("xy")==false)
			{
				System.out.println("true");
			}
			else
			{
				System.out.println("false");
			}
			String bup=b.toUpperCase();
			System.out.println(bup);
			if(bup.contains("Z")==true && bup.contains("z")==false)
			{
				System.out.println("pass");
			}
			else
			{
				System.out.println("fail");
			}
			String tr="   vijay babb   ";
			System.out.println(tr.trim());
			String ab="aaa bbbb ccc ddd  eee fff";
			String ar[]=ab.split(" ");
			for(int i=0;i<ar.length;i++)
			{
				System.out.println(ar[i]);
			}
					
		}
		
	}
