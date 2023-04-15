package qsp;

import java.awt.Dimension;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.DismissAlert;

public class Windowplaying {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
		public static void main(String[] args) {
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://secure.indeed.com/");
			System.out.println(driver.manage().window().getPosition());
			System.out.println(driver.manage().window().getSize());
			driver.manage().window().setPosition(new Point(200, 200));
			driver.manage().window().setSize(new org.openqa.selenium.Dimension(200, 200));
			//driver.manage().window().maximize();
			driver.manage().window().fullscreen();
			
			driver.quit();
			
			
}
}