package AutomationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {

	public Practice2() {}
		
		
		public static void sleep(int seconds) {
			int miliseconds = seconds * 1000;
			try {
				Thread.sleep(miliseconds);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		// TODO Auto-generated constructor stub
	}
	public static void main(String args[]) {
		
		 WebDriver driver = new ChromeDriver();
		   
		   System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/chromedriver.exe");
		   
		   String url = "http://toolsqa.wpengine.com/automation-practice-form/";
			
		   driver.get(url);
		   
		   driver.findElement(By.linkText("Partial Link Test")).click();;
		   
		  String String =  driver.findElement(By.tagName("submit")).toString();
		   
		   System.out.println(String);
		   
		   
		  
		   
		 
		   
		   
		   
		   
		 
		  
		   
		   driver.findElement(By.linkText("Link Test")).click();;
		   
		   
		   
		   
		   
		   
		   
		sleep(7);
		
		driver.close();
		
		
		
		
		
		
		
	}

}
