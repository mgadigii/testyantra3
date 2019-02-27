package script;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo6 {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.switchTo().activeElement().sendKeys("java");
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@value='Google Search']")).click();
		Thread.sleep(3000);
		List<WebElement> alllinks = driver.findElements(By.xpath("//h3"));
		
		 List<WebElement> sublinks = driver.findElements(By.xpath("//cite"));
		
		int count = alllinks.size();
		int scount = sublinks.size();
		for(int i =0;i<count;i++)
		{
			WebElement links = alllinks.get(i);
			System.out.println(links.getText());
			if(scount!=0)
			{
				WebElement slinks = sublinks.get(i);
				System.out.println(slinks);
				scount--;
				
			}
			
		}

		

	}

}
