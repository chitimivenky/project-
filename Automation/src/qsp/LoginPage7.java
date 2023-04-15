package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage7 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
		 try {
			 driver.get("https://demo.actitime.com/login.do");
			 System.out.println("pages is loaded with in 7 sec");
		} catch (Exception e) {
			System.out.println("pages is not loaded with in 7 sec");
		}
}
}

