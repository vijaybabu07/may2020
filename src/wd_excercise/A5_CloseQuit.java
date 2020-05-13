package wd_excercise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A5_CloseQuit {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Sel\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.popuptest.com/popuptest2.html");
		driver.manage().window().maximize();
		//driver.close();
		driver.quit();
	}

}
