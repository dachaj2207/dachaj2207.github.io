package AutomationFramework;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Practice1 {

	public Practice1() {
		
	}

	public static void main(String args[]) {
		
		 WebDriver driver = new ChromeDriver();
		   
		   System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/chromedriver.exe");
		   
		   String url = "http://toolsqa.wpengine.com/automation-practice-form/";
			
		   driver.get(url);
		
		   driver.findElement(By.name("firstname")).sendKeys("Danijel");;
		   
		   driver.findElement(By.name("lastname")).sendKeys("Jovanovic");;
		   
		   driver.findElement(By.id("submit")).click();;
		   
		   driver.close();
		
		
		
		
		
		
	}
}
