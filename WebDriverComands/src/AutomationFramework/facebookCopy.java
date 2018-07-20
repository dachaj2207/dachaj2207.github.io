package AutomationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class facebookCopy {

	public facebookCopy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		 WebDriver driver = new ChromeDriver();
		   
		   System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/chromedriver.exe");
	
		   
		   String url = "https://sr-rs.facebook.com/";
	
		   driver.get(url);
		   
		   driver.manage().window().maximize();
		   Actions builder = new Actions(driver);
		   
		   
		WebElement email =   driver.findElement(By.id("email"));
		WebElement pass = driver.findElement(By.id("pass"));
		
		
		
		
		Action DragTo = builder
				.moveToElement(email)
				.click()
				.keyDown(Keys.LEFT_SHIFT).sendKeys("hello")
				
				.keyUp(Keys.LEFT_SHIFT)
				.keyDown(Keys.LEFT_CONTROL).sendKeys("a")
				.keyUp(Keys.LEFT_CONTROL)
		
				.keyDown(Keys.LEFT_CONTROL).sendKeys("c")
				.keyUp(Keys.LEFT_CONTROL)
				.moveToElement(pass)
				.click()
				.keyDown(Keys.LEFT_CONTROL).sendKeys("v")
				.build();
				DragTo.perform();
		
				
		
		
		

	}

}
