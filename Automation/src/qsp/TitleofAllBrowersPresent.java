package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleofAllBrowersPresent {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
		public static void main(String[] args) {
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://secure.indeed.com/");
			driver.findElement(By.id("apple-signin-button")).click();
			driver.findElement(By.id("login-facebook-button")).click();
			Set<String> WNHS1 = driver.getWindowHandles();
			for (String As : WNHS1) {
		driver.switchTo().window(As);
		String title = driver.getTitle();
		System.out.println(title);
					}
			driver.quit();
		}

}

