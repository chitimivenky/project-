package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alllinks {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
	 public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.get("https://www.google.com");
		List<WebElement> s = driver.findElements(By.tagName("a"));
		int count = s.size();
		System.out.println(count);
		for (int i = 0; i <count; i++) {
			String string = s.get(i).getAttribute("href");
			System.out.println(string);
			
		}
		 
		 
	}
}
