package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class meesho {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");

		}
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.get( "https://www.meesho.com/search?q=watchs%20for%20mens&searchType=manual&searchIdentifier=text_search");
		List<WebElement> mee = driver.findElements(By.xpath("(//a/div/div[2]/div[1]/span/p)"));
		Thread.sleep(3000);
		List<WebElement> cast= driver.findElements(By.xpath("//h5[@class='sc-dkrFOg iIAyXW']"));
		Thread.sleep(3000);
		for (int i = 0; i <mee.size(); i++) {
			System.out.println(mee.get(i).getText() + "------------->@" + cast.get(i).getText() );
			//driver.close();
			
		}
		
}
}