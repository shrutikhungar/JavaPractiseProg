package JavaWebDriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingPopup {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "C:\\Shruti\\Study\\Selenium\\SeleniumDownloads\\Driver\\chromedriver_win32\\chromedriver_win32_2.36\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		driver.findElement(By.xpath("//button[@id='alert']")).click();
		Alert alrObj=driver.switchTo().alert();
		alrObj.dismiss();
		driver.close();
	}
}
