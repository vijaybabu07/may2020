package wd_excercise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class A16_FromNotepadEx {

	public static void main(String[] args) throws Exception{
		FileReader f1=new FileReader("E:\\Sel\\DDT\\test.txt");
		FileReader f2=new FileReader("E:\\Sel\\DDT\\testop.txt");
		BufferedReader b1=new BufferedReader(f1);
		BufferedReader b2=new BufferedReader(f2);
		String s1,s2,s;
		//while((s1=b1.readLine())!=null)
		s1=b1.readLine();
		s2=b2.readLine();
		s=s1.concat(s2);
		FileWriter fw=new FileWriter("E:\\Sel\\DDT\\testop1.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write(s);
		bw.close();

	}

}
