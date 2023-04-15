package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
private static void main() {
	WebDriver driver =new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	PageEn n=new PageEn(driver);
	n.setLogin("admin","manager");
			
	
}

	
}

