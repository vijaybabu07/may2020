package wd_excercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A10_Xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Sel\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://rediff.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/p/a[2]")).click();
		driver.findElement(By.xpath("//*[starts-with(@name, 'name')]")).sendKeys("vijay");
		driver.findElement(By.xpath("//input[contains(@name,'login')]")).sendKeys("vj@xyz.com");
		driver.findElement(By.xpath("//*[@id='mobno' and starts-with(@name,'mobno')]")).sendKeys("985464");
		driver.findElement(By.xpath("//*[@id='Register']")).click();
	}
}
