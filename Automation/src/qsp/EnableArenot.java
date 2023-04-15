package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnableArenot {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
		public static void main(String[] args) {
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://secure.indeed.com/");
			WebElement e = driver.findElement(By.id("login-google-button"));
			System.out.println(e.isEnabled());
			System.out.println(e.getTagName());
			driver.quit();

			
			
			
}
}