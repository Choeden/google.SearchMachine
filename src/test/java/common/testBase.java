package common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testBase {
	
	public WebDriver Driver;
	public void launchBrowser() {
		
		//// launchhhhhhhh
		
WebDriverManager.chromedriver().setup();
		
		Driver = new ChromeDriver();
		
	    Driver.get("https://www.google.com/");
	    Driver.manage().window().maximize();
	    Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public void closeAll() {
		Driver.quit();
	}
}
