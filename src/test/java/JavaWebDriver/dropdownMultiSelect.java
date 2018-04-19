package JavaWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownMultiSelect {
	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Shruti\\Study\\Selenium\\SeleniumDownloads\\Driver\\chromedriver_win32\\chromedriver_win32_2.37\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://toolsqa.wpengine.com/automation-practice-form");
		//dropdown
		WebElement selectContinent=driver.findElement(By.xpath("//select[@id='continents']"));
		Select selectObj=new Select(selectContinent);
		selectObj.selectByIndex(3);
		//selectObj.selectByValue("South America");
		List<WebElement> listObj=selectObj.getOptions();
		int iListSize=listObj.size();
		for (int i=0;i<iListSize;i++) {
			String  sValue=listObj.get(i).getText();
			System.out.println(sValue);
		}
		
		//MultiSelect
		WebElement multiSelectSelCom=driver.findElement(By.xpath("//select[@id='selenium_commands']"));
		Select multiSelectObj=new Select(multiSelectSelCom);
		multiSelectObj.selectByIndex(1);
		multiSelectObj.selectByIndex(4);
		List<WebElement> allSelectedObj=multiSelectObj.getAllSelectedOptions();
		int mulSelsize=allSelectedObj.size();
		System.out.println(mulSelsize);
		multiSelectObj.deselectByIndex(1);
		multiSelectObj.deselectAll();
		System.out.println("end");
		
	}
}
