package AutomationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert2 {

	public Alert2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		
		 WebDriver driver = new ChromeDriver();
		   
		   System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/chromedriver.exe");
	
		   
		   String url = "http://toolsqa.wpengine.com/handling-alerts-using-selenium-webdriver/";
	
		   driver.get(url);
		   
		   
		   
		   driver.findElement(By.xpath("//*[@id='content']/p[8]/button")).click();
		   
		   String alert2 = driver.switchTo().alert().getText();
		   
		   System.out.println(alert2);
		   
		   driver.switchTo().alert().dismiss();
		   
		 WebElement confirm =  driver.findElement(By.id("ConfirmOption"));
		 
		 
		 
		 
		 System.out.println(confirm);
		   
		   
		

	}

}
