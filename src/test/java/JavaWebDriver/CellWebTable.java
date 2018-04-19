package JavaWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CellWebTable {
	public static void main(String[] args) {
		int row=1;
		int col=6;
		System.setProperty("webdriver.chrome.driver", "C:\\Shruti\\Study\\Selenium\\SeleniumDownloads\\Driver\\chromedriver_win32\\chromedriver_win32_2.37\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-table/");
		//Here we are storing the value from the cell in to the string variable
		String text = driver.findElement(By.xpath("//div[@id=\'content']/table/tbody/tr[1]/td[2]")).getText();
		System.out.println("text is: "+ text);
		
		// Here we are clicking on the link of first row and the last column
		driver.findElement(By.xpath("//div[@id='content']/table/tbody/tr["+row+"]/td["+col+"]/a")).click();        
		System.out.println("Link has been clicked otherwise an exception would have thrown");
	}

}
