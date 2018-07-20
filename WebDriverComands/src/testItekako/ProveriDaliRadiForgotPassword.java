package testItekako;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProveriDaliRadiForgotPassword {

	public ProveriDaliRadiForgotPassword() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		   
		   System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/chromedriver.exe");

		   
		   String url = "https://courses.ultimateqa.com/users/sign_in";

		   driver.get(url);
		   
		   
		   WebElement forgot = driver.findElement(By.cssSelector("#new_user > div:nth-child(5) > div > div.col-xs-4.col-sm-6.login__forgot-pass-link.text-right > a"));
		   
		   forgot.click();
		   
		   String Curr = driver.getCurrentUrl();
		   
		   if (Curr.contains("sign_in")) {
			   
			   System.out.println("Bug");
			   driver.close();
		   }
		   
		   else {
			   System.out.println("NijeBug");
			   driver.close();
		   }
		   
		   
		   
		
		
		
		
		
	}

}
