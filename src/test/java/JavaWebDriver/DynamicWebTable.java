package JavaWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {
	public static void main(String[] args) {
	String sColValue = "Clock Tower Hotel";
	System.setProperty("webdriver.chrome.driver", "C:\\Shruti\\Study\\Selenium\\SeleniumDownloads\\Driver\\chromedriver_win32\\chromedriver_win32_2.37\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://toolsqa.com/automation-practice-table/");
	for (int i=1;i<=3;i++){
		String cellHeaderValue=driver.findElement(By.xpath("//div[@id='content']/table/tbody/tr["+i+"]/th")).getText();
		if (cellHeaderValue.equals(sColValue)) {
			for (int j=1;j<=5;j++) {
				String cellDataValue=driver.findElement(By.xpath("//div[@id='content']/table/tbody/tr["+i+"]/td["+j+"]")).getText();
						System.out.println("table data for" +cellHeaderValue+ " is: "+cellDataValue);
					
				}
			}
		}
	}
	}
