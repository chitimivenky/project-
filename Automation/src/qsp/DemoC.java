package qsp;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoC {
	static {
		System.setProperty( "webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) {
		WebDriver driver1=new ChromeDriver();
		DemoA.testA(driver1);
		
		 
	} 
}