package script;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.Seleniumhq.com");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		// for opening in new Tab
		r.keyPress(KeyEvent.VK_T);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_T);
		/*
		 r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_N);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_N);
		
		for opening new window
		 */		 
		
		Set<String> allwhs = driver.getWindowHandles();
		
		ArrayList <String> ls = new ArrayList<String>(allwhs);
		driver.switchTo().window(ls.get(1));
		Thread.sleep(3000);
		
		driver.get("http://www.urbanlatter.com");
		
		driver.switchTo().window(ls.get(0));
		Thread.sleep(3000);
		driver.get("http://www.google.com");
		
		
		
		
		
		
		
		

	}

}
