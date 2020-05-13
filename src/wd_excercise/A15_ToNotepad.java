package wd_excercise;

import java.io.BufferedWriter;
import java.io.FileWriter;



public class A15_ToNotepad {

	public static void main(String[] args) throws Exception {
		FileWriter fw=new FileWriter("E:\\Sel\\DDT\\testop.txt");
		BufferedWriter b=new BufferedWriter(fw);
		b.write("This is vijay \n babu");
		b.close();

	}

}
