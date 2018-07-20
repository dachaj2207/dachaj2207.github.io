package AutomationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public DragAndDrop() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		   
		   System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/chromedriver.exe");
	
		   
		   String url = "http://www.dhtmlx.com/docs/products/dhtmlxTree/index.shtml";
	
		   driver.get(url);
		   
		   driver.manage().window().maximize();
		   
		   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   
		   Actions builder = new Actions(driver);
		   WebElement folder = driver.findElement(By.xpath("//*[@id=\"treebox1\"]/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[4]/span"));
		   
		   WebElement toFolder = driver.findElement(By.xpath("//*[@id=\"treebox2\"]/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[3]/div"));

		   Action DragTo = builder
				   .moveToElement(folder)
				   .dragAndDrop(folder, toFolder)
				   .build();
		   
		   DragTo.perform();
		   
		   driver.close();
				   
				   
		   
		   
		   
	}

}
