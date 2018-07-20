package testItekako;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SamoKlikNaLoginBezPodataka {

	public SamoKlikNaLoginBezPodataka() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		   
		   System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/chromedriver.exe");

		   
		   String url = "https://courses.ultimateqa.com/users/sign_in";

		   driver.get(url);
		   
		   driver.findElement(By.id("btn-signin")).click();
		   
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
