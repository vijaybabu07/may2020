package wd_excercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A3_Validations {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Sel\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.borland.com/InsuranceWebExtJS/");
		driver.manage().window().maximize();
		//app title length should be greater than app url length
		String title=driver.getTitle();
		int title_len=title.length();
		System.out.println("Title :"+title+" and its length:"+title_len);
		String url=driver.getCurrentUrl();
		int url_len=url.length();
		System.out.println("URL :"+url+" and its length:"+url_len);
		if(title_len>url_len)
		{
			System.out.println("title length is greater than url length");
		}
		else
		{
			System.out.println("title length is not greater than url length");
		}
		
		// enter email , login button should be available and enabled
		driver.findElement(By.id("login-form:email")).sendKeys("vijay");
		boolean login_available=driver.findElement(By.id("login-form:login")).isDisplayed();
		boolean login_enabled=driver.findElement(By.id("login-form:login")).isEnabled();
		if(login_available==true && login_enabled==true)
		{
			System.out.println("Login button is available and enabled");
		}
		else
		{
			System.out.println("Login button is not available and enabled");
		}
		driver.findElement(By.id("login-form:signup")).click();
		String title_signuup=driver.getTitle();
		System.out.println("title of sign up:"+title_signuup);
		boolean title_contains=title_signuup.contains("Insurance");
		if(title_contains==true)
		{
			System.out.println("Title contains Insurance");
		}
		else
		{
			System.out.println("Title does not contains Insurance");
		}
		//driver.navigate().to("www.google.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

}
