package wd_excercise;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A22_WindowTitles {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Sel\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.idbibank.in/index.asp");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
		ArrayList win_count=new ArrayList(driver.getWindowHandles());
		System.out.println("No of windows opened :"+win_count.size());
		String title;
		for(int i=0;i<win_count.size();i++)
		{
			title=driver.switchTo().window((String)win_count.get(i)).getTitle();
			System.out.println("window "+(i+1)+" title: "+title);
			List links_count=driver.switchTo().window((String)win_count.get(i)).findElements(By.tagName("a"));
			System.out.println("No of links in window "+(i+1)+" is "+ links_count.size());
			/*for(int j=0;j<links_count.size();j++)
			{
				links_count.get(j).
			}*/
			driver.switchTo().window((String)win_count.get(i)).close();
			System.out.println("window "+(i+1)+" is closed");
		}
	}
}
