package testItekako;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UkucajSamoPassword {

	public UkucajSamoPassword() {
		// TODO Auto-generated constructor stub
	}
	
	public static void sleep(int seconds) {
		int miliseconds = seconds * 1000;
		try {
			Thread.sleep(miliseconds);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}}
	
public static void main(String args[]) {
	
	WebDriver driver = new ChromeDriver();
	   
	   System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/chromedriver.exe");

	   
	   String url = "https://courses.ultimateqa.com/users/sign_in";

	   driver.get(url);
	   

	   
	   
	 WebElement  Ppassword =  driver.findElement(By.id("user_password"));;
	   
	 Ppassword.sendKeys("testitekako6@gmail.com");
	   
	 Ppassword.sendKeys(Keys.ENTER);
	   
	   sleep(3);
	   
	   
	  String Curr = driver.getCurrentUrl();
	   
	   
	   if (Curr.contains("sign_in")) {
		   
		   System.out.println("NijeBug");
		   driver.close();
	   }
	   
	   else {
		   System.out.println("Bug");
	   }
	   
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

}
