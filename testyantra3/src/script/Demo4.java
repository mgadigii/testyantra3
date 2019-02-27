package script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class Demo4 {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/manjunath/Desktop/SeleniumHTML/Demo123.html");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement act = driver.findElement(By.name("TB1"));
		Thread.sleep(1000);
		String actualval = act.getAttribute("Value");
		
		Thread.sleep(1000);
		driver.findElement(By.name("TB2")).sendKeys(actualval);
		
		String exp = driver.findElement(By.name("TB2")).getAttribute("value");
//	String expectedval = exp.getAttribute("Value");
		System.out.println(exp);
		
		Assert.assertEquals(exp, actualval);
		

	}

}
