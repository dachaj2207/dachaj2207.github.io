package AutomationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {

	public Alert1() {
		
	}

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		   
		   System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/chromedriver.exe");
	
		   
		   String url = "http://toolsqa.wpengine.com/handling-alerts-using-selenium-webdriver/";
	
		   driver.get(url);
		   
		   driver.manage().window().maximize();
		   
		   driver.findElement(By.xpath("//*[@id='content']/p[4]/button")).click();
		   
		  String alert1 = driver.switchTo().alert().getText();
		  
		  System.out.println(alert1);
		  
		  
		  
		  
		
		  
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
