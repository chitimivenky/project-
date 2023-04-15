package qsp;

  import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HiddendivisionPopup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args)  {
		WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.id("policynumber")).sendKeys("123");
		driver.findElement(By.id("dob")).click();
		driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")).click();
		WebElement hidd = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select s=new Select(hidd);
		s.selectByIndex(9);
		driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")).click();
		WebElement mo= driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select s1=new Select(mo);
		s1.selectByValue("1999");
		driver.findElement(By.xpath("(//a[@class='ui-state-default'])[21]")).click();
		driver.findElement(By.id("alternative_number")).sendKeys("9845098450");
		driver.findElement(By.id("renew_policy_submit")).click();
		 boolean d = driver.findElement(By.id("policynumberError")).isDisplayed();
if (d==true) {
	System.out.println("policy number is Displayed");
}
else {
	System.out.println("policy number is not Displayed");
}
	driver.quit();	
}
}