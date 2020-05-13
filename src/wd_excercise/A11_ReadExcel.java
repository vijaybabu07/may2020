package wd_excercise;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;

public class A11_ReadExcel {

	public static void main(String[] args) throws Exception {
		FileInputStream f=new FileInputStream("E:\\Sel\\DDT\\Jxl_97_2003WB.xls");
		Workbook wb=Workbook.getWorkbook(f);
		Sheet s=wb.getSheet("demo");
		System.setProperty("webdriver.chrome.driver", "E:\\Sel\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(s.getCell(1,0).getContents());
		driver.manage().window().maximize();
		
		//Read data from excel to application 
		driver.findElement(By.id(s.getCell(2,1).getContents())).sendKeys(s.getCell("B2").getContents());
		driver.findElement(By.id(s.getCell("C3").getContents())).sendKeys(s.getCell(1,2).getContents());
		driver.findElement(By.xpath(s.getCell("C4").getContents())).sendKeys(s.getCell(1,3).getContents());
		//driver.findElement(By.xpath(s.getCell(2,4).getContents())).click();
		driver.findElement(By.xpath(s.getCell(2,4).getContents())).sendKeys(s.getCell("B5").getContents());
		driver.close();
		
		/***************To display all rows and columns*/
		int rc=s.getRows();
		System.out.println("No of rows:"+rc);
		int cc=s.getColumns();
		System.out.println("No of Columns:"+cc);
		
		for(int i=0;i<cc;i++)
		{
			for(int j=0;j<rc;j++)
			{   //displays all rows and columns
				System.out.println(s.getCell(i,j).getContents());
				//if "babu" is available, printing the cell position
				if(s.getCell(i,j).getContents().contains("babu")==true)
				{
					System.out.println("Coulumn:"+s.getCell(i, j).getColumn()+" Row:"+s.getCell(i, j).getRow());
				}
			}
		}
		
	
	}
}
