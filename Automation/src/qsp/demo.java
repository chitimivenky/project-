package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.geko.driver","./driver/gekodriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:www.google.com");
		driver.get("https:www.gmail.com");
		driver.get("https:www.facebook.com");
		driver.get("https:www.firefox.com");
		driver.close();
	}

}
