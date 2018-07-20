package AutomationFramework;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice4 {

	public Practice4() {
		
	}
	public static void sleep(int seconds) {
		int miliseconds = seconds * 1000;
		try {
			Thread.sleep(miliseconds);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}}
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		   
		   System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/chromedriver.exe");
		   
		   String url = "http://toolsqa.wpengine.com/automation-practice-form/";
			
		   driver.get(url);
		   sleep(3);
		   
		   Select Generalni = new Select(driver.findElement(By.id("continents")));
		   
		   sleep(3);
		   Generalni.selectByIndex(1);
		   sleep(3);
		   Generalni.selectByVisibleText("Africa");
		   
		   sleep(3);
		   
		   List<WebElement> Velicina = Generalni.getOptions();
		   
		   int VelicinaI = Velicina.size();
		   int i;
		     
		   
		   for ( i =0;i<VelicinaI;i++) {
		   
		   String Kontinent = Generalni.getOptions().get(i).getText();
		   
		   System.out.println(Kontinent);
		   
		   if (Kontinent.equals("Afrika")) {
			   Generalni.selectByIndex(i);
			   
			   break;
			   
		   }
		   
		   
		   sleep(10);
		   
		   driver.close();
		   
		   
		   

	}

}}
