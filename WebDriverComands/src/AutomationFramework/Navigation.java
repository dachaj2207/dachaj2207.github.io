package AutomationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public Navigation() {
		
	}

	public static void main(String[] args) {
		
		   WebDriver driver = new ChromeDriver();
		   
		   System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/chromedriver.exe");
		
		   driver.manage().window().maximize();
		
		
		
		
		   String url = "http://www.store.demoqa.com";
			
		   driver.get(url);
		   
		   driver.findElement(By.id("account")).click();
		   
		   driver.navigate().back();
		   
		   driver.navigate().forward();
		   
		   driver.navigate().to(url);
		   
		   driver.navigate().refresh();
		   
		   
		   driver.close();
		   

			 
		 

	}

}
