package JavaWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.*;

public class switchWindows {
		
		@Test
		public void test1() {
			System.setProperty("webdriver.chrome.driver", "C:\\Shruti\\Study\\Selenium\\SeleniumDownloads\\Driver\\chromedriver_win32\\chromedriver_win32_2.36\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://toolsqa.com/automation-practice-switch-windows/");
			String str=driver.findElement(By.xpath("//div[@id='content']/h1")).getText();
			System.out.println(str);
			String winHandleBefore = driver.getWindowHandle();
			System.out.println(winHandleBefore);
			driver.findElement(By.xpath("//button[@id='button1']")).click();
			//Return a set of window handle
			for (String handles:driver.getWindowHandles()) {
				System.out.println(handles);
				driver.switchTo().window(handles);
			}
			//closes only current browser window
			driver.close();
			driver.quit();	
		}
}
