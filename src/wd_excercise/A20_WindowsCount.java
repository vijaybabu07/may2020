package wd_excercise;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A20_WindowsCount {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\Sel\\Jars\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/popup.php");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//a[contains(@href,'popup')]")).click();
	ArrayList windows_count=new ArrayList(driver.getWindowHandles());
	System.out.println("no of windows: "+windows_count.size());
	}

}
