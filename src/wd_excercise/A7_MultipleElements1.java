package wd_excercise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A7_MultipleElements1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Sel\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.borland.com/InsuranceWebExtJS/signup.jsf");
		driver.manage().window().maximize();
		List<WebElement> links_count=driver.findElements(By.tagName("a"));
		System.out.println("No of Links: "+links_count.size());
		//display links starting with w
		for(int i=0;i<links_count.size();i++)
		{
			String lname=links_count.get(i).getText();
			if(lname.startsWith("W")==true)
			{
				System.out.println("Link name starting with W :"+lname);
				System.out.println("link attribute value:"+links_count.get(i).getAttribute("href"));
			}
		}
//to click last but one link: (links_count.size()-1 is the last link, so last but one link would be links_count.size()-2)
		links_count.get(links_count.size()-2).click();
		List<WebElement> img_count=driver.findElements(By.tagName("img"));
		System.out.println("No of images:"+img_count.size());
		//no of links should be greater than no of images
		if(links_count.size()>img_count.size())
		{
			System.out.println("Links greater than images");
		}
		else
		{
			System.out.println("Links not greater than images");
		}
	}
}
