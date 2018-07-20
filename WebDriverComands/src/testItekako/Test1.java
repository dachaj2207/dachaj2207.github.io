package testItekako;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public Test1() {
		// TODO Auto-generated constructor stub
	}
public static void main(String args[]) {
	
	WebDriver driver = new ChromeDriver();
	   
	   System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/chromedriver.exe");

	   
	   String url = "https://courses.ultimateqa.com/users/sign_in";

	   driver.get(url);
	   
	   
String Curr = driver.getCurrentUrl();
	   
	   
	   if (Curr.contains("sign_in")) {
		   
		   System.out.println("NijeGreska");
		   driver.close();
	   }
	   
	   else {
		   System.out.println("Greska");
		   driver.close();
	   }
	   
	   
	 
	   
	   
	   
	   
	   
	  
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	
	
	
	
	
	
}
private static boolean url(String url) {
	// TODO Auto-generated method stub
	return false;
}
}
