package wd_excercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A4_Webelements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Sel\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.borland.com/InsuranceWebExtJS/signup.jsf");
		driver.manage().window().maximize();
		WebElement fname=driver.findElement(By.id("signup:fname"));
		WebElement lname=driver.findElement(By.id("signup:lname"));
		WebElement state=driver.findElement(By.id("signup:state"));
		fname.sendKeys("vijay");
		lname.sendKeys("babu");
		state.sendKeys("Alaska");
		lname.clear();
		driver.findElement(By.id("signup:signup")).click();
		
	}

}
