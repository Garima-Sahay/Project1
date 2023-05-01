package Garima;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

//import dev.failsafe.Timeout;

public class facebook {

	public static void main(String[] args) { 
		implicit_wait();
  
	}



public static void implicit_wait() {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.OfSeconds(10));
	driver.get("https://www.facebook.com");
}	
}