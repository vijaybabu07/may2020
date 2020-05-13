package wd_excercise;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A21_CloseAllWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Sel\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(@href,'popup')]")).click();
		ArrayList win_count=new ArrayList(driver.getWindowHandles());
		System.out.println("no of opened windows: "+win_count.size());
		for(int i=0;i<win_count.size();i++)
		{
			System.out.println("window "+(i+1)+": "+win_count.get(i));
		}
		System.out.println("Closing the windows");
		for(int i=0;i<win_count.size();i++)
		{
			System.out.println("window "+(i+1)+" is closed");
			driver.switchTo().window((String)win_count.get(i)).close();
		}
	}
}
