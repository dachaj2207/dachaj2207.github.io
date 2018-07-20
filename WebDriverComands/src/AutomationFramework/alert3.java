package AutomationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert3 {

	public alert3() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		   
		   System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/chromedriver.exe");
	
		   
		   String url = "http://toolsqa.wpengine.com/automation-practice-switch-windows/";
	
		   driver.get(url);
		   
		   driver.findElement(By.id("timingAlert")).click();
		   
		   System.out.println("Timer JavaScript Alert is triggered but it is not yet opened");
		   
		   
		   
	  	   driver.switchTo().alert().accept();
		  
		  
		   
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		   
		   System.out.println("Alert accepted");
		   
		   

	}

}
