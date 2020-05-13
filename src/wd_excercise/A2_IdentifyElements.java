package wd_excercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A2_IdentifyElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Sel\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.borland.com/InsuranceWebExtJS/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("login-form:email")).sendKeys("vijay");
		driver.findElement(By.id("login-form:signup")).click();
		driver.findElement(By.id("signup:state")).click();
		driver.findElement(By.id("signup:state")).sendKeys("Arizona");
		
		driver.findElement(By.id("home")).click();
		driver.findElement(By.id("quick-link:jump-menu")).click();
		driver.findElement(By.id("quick-link:jump-menu")).sendKeys("Auto Quote");
		driver.findElement(By.xpath("//*[@id='autoquote:vehicle:1']")).click();
		//driver.close();

	}

}
