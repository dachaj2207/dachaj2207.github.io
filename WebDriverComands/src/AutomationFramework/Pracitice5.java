package AutomationFramework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Pracitice5 {

	public Pracitice5() {
		
	}
	public static void sleep(int seconds) {
		int miliseconds = seconds * 1000;
		try {
			Thread.sleep(miliseconds);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}}
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		   
		   System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/chromedriver.exe");
		   driver.manage().window().maximize();
		   String url = "http://toolsqa.wpengine.com/automation-practice-form/";
			
		   driver.get(url);
		
		   
		   Select oSelect = new Select(driver.findElement(By.name("selenium_commands")));
		   
		   
		   
		   oSelect.selectByIndex(0);
		
		   oSelect.deselectByIndex(0);
		   
		   
		   oSelect.selectByVisibleText("Navigation commands");
		   
		   
		   
		   oSelect.deselectByVisibleText("Navigation commands");
		   
		   
		   
		   List<WebElement> oSize = oSelect.getOptions();
		   int iListSize = oSize.size();
		   
		   for(int i = 0;i<iListSize;i++) {
		   String sValue = oSelect.getOptions().get(i).getText();
		   
		  oSelect.selectByIndex(i);
		   
		   System.out.println(sValue);
		   
		   }
		   oSelect.deselectAll();
		   
		   driver.close();
		   
		   
		   
		   
		   
		   
		   
		   
		

	}

}
