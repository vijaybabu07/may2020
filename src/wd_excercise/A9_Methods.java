package wd_excercise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A9_Methods {

	WebDriver driver;
	public void launchApp(String url)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Sel\\Jars\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	public void closeApp()
	{
		driver.close();
	}
	public void elementDisplayed(String loc, boolean exp)
	{
		boolean a=driver.findElement(By.id(loc)).isDisplayed();
		if(a==exp)
		{
			System.out.println("Element is displayed");
		}
		else
		{
			System.out.println("Element is not displayed");
		}
	}
	public void elementEnabled(String loc,boolean exp)
	{
		boolean a=driver.findElement(By.id(loc)).isEnabled();
		if(a==exp)
		{
			System.out.println("Element is enabled");
		}
		else
		{
			System.out.println("Element is not enabled");
		}
	}
	public void elementSelected(String loc,boolean exp)
	{
		boolean a=driver.findElement(By.id(loc)).isSelected();
		if(a==exp)
		{
			System.out.println("Element is selected");
		}
		else
		{
			System.out.println("Element is not selected");
		}
	}
	public void linksCount(int exp)
	{
		List<WebElement> lcount=driver.findElements(By.tagName("a"));
		int llen=lcount.size();
		if(exp>llen)
		{
			System.out.println("Actual link count "+llen+" is smaller than expected link count: "+exp);
		}
		else
		{
			System.out.println("Actual link count "+llen+" is greater than expected link count: "+exp);
		}
	}
	public void validateTitleLen(int exp)
	{
		String title=driver.getTitle();
		int titlelen=title.length();
		System.out.println("Title :"+title+" and its length is "+titlelen);
		if(titlelen==exp)
		{
			System.out.println("Title length "+titlelen+" is equal to expected "+exp);
		}
		else
		{
			System.out.println("Title length "+titlelen+" is not equal to expected "+exp);
		}
	}
	public void validateUrl(String exp)
	{
		String url=driver.getCurrentUrl();
		if(url.contains(exp)==true)
		{
			System.out.println("url :"+url+" contains expected "+exp);
		}
		else
		{
			System.out.println("url :"+url+" does not contains expected "+exp);
		}
	}
	public void validateTitle(String exp)
	{
		String title=driver.getTitle();
		if(title.startsWith(exp)==true)
		{
			System.out.println("Title :"+title+" starts with expected "+exp);
		}
		else
		{
			System.out.println("Title :"+title+" does not starts with expected "+exp);
		}
	}

}
