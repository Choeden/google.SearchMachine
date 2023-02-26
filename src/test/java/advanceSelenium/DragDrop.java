package advanceSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement boxA=driver.findElement(By.xpath("(//div[@class='column'])[1]"));
		WebElement boxB=driver.findElement(By.xpath("(//div[@class='column'])[2]"));
				
		Actions act=new Actions(driver);
		//act.dragAndDropBy(boxA, 150, 150).build().perform();
		act.dragAndDrop(boxA, boxB).build().perform();
	
	}

}
