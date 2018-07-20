package AutomationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice6 {

	public Practice6() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		   
		   System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/chromedriver.exe");
		   driver.manage().window().maximize();
		   String url = "http://toolsqa.wpengine.com/automation-practice-table/";
			
		   driver.get(url);
		   
		   String element  = driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr[1]/td[2]")).getText();
		   
		   System.out.println(element);

		   driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr[1]/td[6]/a")).click();;
		   
		   System.out.println("Kliknuto");
		   driver.close();
	}

}
