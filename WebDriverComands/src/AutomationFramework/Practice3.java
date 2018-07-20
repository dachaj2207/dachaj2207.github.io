package AutomationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice3 {

	public Practice3() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static void sleep(int seconds) {
		int miliseconds = seconds * 1000;
		try {
			Thread.sleep(miliseconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}

	public static void main(String[] args) {
		
		
		 WebDriver driver = new ChromeDriver();
		   
		   System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/chromedriver.exe");
		   
		   String url = "http://toolsqa.wpengine.com/automation-practice-form/";
			
		   driver.get(url);
		   
		   driver.findElement(By.xpath("//input[@value='Male']")).click();
		   
		   driver.findElement(By.id("exp-2")).click();
		   
		  driver.findElement(By.name("profession")).click();
		  
		  driver.findElement(By.cssSelector("#tool-2"));
		  
		  
		  sleep(6);
		  
		  driver.close();
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		

	}

}
