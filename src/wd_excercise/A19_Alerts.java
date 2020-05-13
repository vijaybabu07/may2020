package wd_excercise;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A19_Alerts {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\Sel\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("html/body/div/div/div[3]/p/a[2]")).click();
		driver.findElement(By.xpath("//*[@id='Register']")).click();
		Alert a=driver.switchTo().alert();
		Thread.sleep(2000);
		String text=a.getText();
		System.out.println(text);
		a.dismiss();
		driver.close();
	}
}
