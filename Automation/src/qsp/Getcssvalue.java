package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getcssvalue {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
		public static void main(String[] args) {
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://secure.indeed.com/");
			WebElement css = driver.findElement(By.name("__email"));
			System.out.println(css.getCssValue("font-weight"));
			System.out.println(css.getCssValue("flex-grow"));
			System.out.println(css.getCssValue("font-size"));
			driver.quit();
}
}