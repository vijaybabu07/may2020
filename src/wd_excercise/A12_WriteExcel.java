package wd_excercise;

import java.io.FileOutputStream;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class A12_WriteExcel {
	public static void main(String[] args) throws Exception {
		FileOutputStream fo=new FileOutputStream("E:\\Sel\\DDT\\Jxl_97_2003WB_op.xls");
		WritableWorkbook wwb=Workbook.createWorkbook(fo);
		WritableSheet ws=wwb.createSheet("add", 1);
		int a=23,b=34,c;
		c=a+b;
		Label l=new Label(1, 2, "C value is: "+c);
		ws.addCell(l);
		wwb.write();
		wwb.close();
		
	}


}
