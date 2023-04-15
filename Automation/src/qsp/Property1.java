package qsp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Property1 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws IOException {
		FileInputStream f=new FileInputStream("./data/cv.property");
	Properties p=new Properties();
	p.load(f);
	String m = p.getProperty("url");
	String m1 = p.getProperty("username");
	String m2 = p.getProperty("password");
	WebDriver driver=new ChromeDriver();
	driver.get(m);
 
	}
	

}
