package wd_excercise;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A18_FromConsoleApp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Sel\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter url:");
		String url=s.nextLine();
		driver.get(url);
		driver.manage().window().maximize();
		System.out.println("Enter fname:");
		String fname=s.nextLine();
		driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[3]/td[3]/input")).sendKeys(fname);
	}
}
