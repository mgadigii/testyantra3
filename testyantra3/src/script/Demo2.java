package script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Demo2 {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.bluestone.com");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Actions action1 = new Actions(driver);
		WebElement g = driver.findElement(By.xpath("//a[text()='Gold Coins ']"));
		action1.moveToElement(g).perform();
		
		Actions action = new Actions(driver);
		
		WebElement t = driver.findElement(By.xpath("(//span[text()='2 gram'])[2]"));
	     action.moveToElement(t).perform();
	     action.click().perform();
	          	    
	     Thread.sleep(2000);
	     WebElement act = driver.findElement(By.xpath("//h1[text()='2 gram 24 KT Lakshmi Gold Coin']"));
			String actualval = act.getText();
			
			 String expectedval = "2 gram 24 KT Lakshmi Gold Coin";
			
			Assert.assertEquals(actualval,expectedval);
	     

	}

}
