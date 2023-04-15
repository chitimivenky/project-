package qsp;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosetheAlltheBrowersExceptParent {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
		public static void main(String[] args) {
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://secure.indeed.com/");
			driver.findElement(By.id("apple-signin-button")).click();
			driver.findElement(By.id("login-facebook-button")).click();
			driver.findElement(By.id("login-google-button")).click();
			String qw = driver.getWindowHandle();
			Set<String> WNHS = driver.getWindowHandles();
			for (String lo : WNHS) {
				driver.switchTo().window(lo);
		
			if (qw.equals(lo)) {
				
			}else {
					driver.close();
				}
				
			}
} 
}