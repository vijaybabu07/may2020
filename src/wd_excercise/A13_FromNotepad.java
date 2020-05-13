package wd_excercise;

import java.io.BufferedReader;
import java.io.FileReader;

public class A13_FromNotepad {

	public static void main(String[] args) throws Exception {
		FileReader f=new FileReader("E:\\Sel\\DDT\\test.txt");
		BufferedReader b=new BufferedReader(f);
		System.out.println(b.readLine());
	}
}
