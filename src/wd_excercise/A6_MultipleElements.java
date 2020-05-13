package wd_excercise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class A6_MultipleElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Sel\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.borland.com/InsuranceWebExtJS/signup.jsf");
		driver.manage().window().maximize();
		List<WebElement> links_count=driver.findElements(By.tagName("a"));
		System.out.println("No of Links : "+links_count.size());
		
		//printing the links
		for(int i=0;i<links_count.size();i++)
		{
			String linkname=links_count.get(i).getText();
			System.out.println("Link no "+(i+1)+" : "+linkname);
		}
		
	}

}
