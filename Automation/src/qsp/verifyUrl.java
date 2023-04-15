package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifyUrl {

			static {
				System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.seleniumhq.org/");
Thread.sleep(2000,200);
	 String url = driver.getCurrentUrl();
	 
		if(url.equals("https://www.selenium.dev/"))
		{
			System.out.print(true);
		}
		else 
		{
			System.out.print(false);
		}
		Thread.sleep(2000);
		driver.close();
	}
	 
	}

