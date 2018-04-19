package JavaWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SearchTextWebPage {

	public static void main(String args[]) {
		int count=0;
		System.setProperty("webdriver.chrome.driver", "C:\\Shruti\\Study\\Selenium\\SeleniumDownloads\\Driver\\chromedriver_win32\\chromedriver_win32_2.37\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.talesofpanchatantra.com/short-stories-for-kids");
		//Option 1:
		/*String text ="Panchatantra8";
		boolean b=driver.getPageSource().contains(text);
		System.out.println(b);*/
		
		//Option 2:
		WebElement body=driver.findElement(By.tagName("body"));
		String bodyText=body.getText();
		while(bodyText.contains("Panchatantra")){
			count++;	
			 bodyText = bodyText.substring(bodyText.indexOf("Panchatantra") + "Panchatantra".length());
		}
		System.out.println(count);
		driver.close();
	}
}
