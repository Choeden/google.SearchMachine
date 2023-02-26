package advanceSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox{
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		WebElement box1= driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		WebElement box2=driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		
		if(box1.isSelected()) {
			System.out.println("box 1 is already checked");
		}
		else {
			box1.click();
			box2.click();
		}
		
	}
}