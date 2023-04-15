package qsp;

import java.awt.AWTException;
import java.awt.Event;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws AWTException, InterruptedException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_WINDOWS);
		r.keyRelease(KeyEvent.VK_WINDOWS);
		Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_S);
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_E);
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(1000);
	for(int i=0;i<=6;i++) { 
	r.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(1000);
	}
	r.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(1000);
	for(int i=0;i<=21;i++) { 
		r.keyPress(KeyEvent.VK_RIGHT);
		Thread.sleep(1000);
	}
	
	
	
	
	
		
//		r.keyRelease(KeyEvent.VK_CONTROL);
//		Thread.sleep(1000);
//		r.keyPress(KeyEvent.VK_TAB);
//		Thread.sleep(2000);
//		r.keyPress(KeyEvent.VK_RIGHT);
//		Thread.sleep(2000);
//		r.keyPress(KeyEvent.VK_RIGHT);
//		Thread.sleep(2000);
//		r.keyPress(KeyEvent.VK_RIGHT);
//		Thread.sleep(2000);
//		r.keyPress(KeyEvent.VK_RIGHT);
//		Thread.sleep(1000);
//		r.keyPress(KeyEvent.VK_RIGHT);
//		Thread.sleep(1000);
//		r.keyPress(KeyEvent.VK_MINUS);
//		Thread.sleep(1000);
//		r.keyPress(KeyEvent.VK_2);
//		Thread.sleep(1000);
//		r.keyPress(KeyEvent.VK_ENTER);
//		Thread.sleep(1000);
//		r.keyPress(KeyEvent.VK_ENTER);

	}

}
