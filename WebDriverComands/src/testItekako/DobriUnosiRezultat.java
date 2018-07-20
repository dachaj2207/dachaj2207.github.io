package testItekako;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DobriUnosiRezultat {

	public DobriUnosiRezultat() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		   
		   System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/chromedriver.exe");

		   
		   String url = "https://courses.ultimateqa.com/users/sign_in";

		   driver.get(url);
		   

		   
		   
		 WebElement  Ppassword =  driver.findElement(By.id("user_password"));;
		   
		 Ppassword.sendKeys("kiki0637644972");
		 
		 WebElement  PUser =  driver.findElement(By.id("user_email"));;
		   
		   PUser.sendKeys("testitekako6@gmail.com");
		 
		   
		 Ppassword.sendKeys(Keys.ENTER);
		   
		   
		   
		   
		  String Curr = driver.getCurrentUrl();
		   
		   
		   if (Curr.contains("sign_in")) {
			   
			   System.out.println("Bug");
			   
		   }
		   
		   else {
			   Curr.contains("collections");
			   System.out.println("NijeBug");
			   driver.close();
		   }
		// TODO Auto-generated method stub

	}

}
