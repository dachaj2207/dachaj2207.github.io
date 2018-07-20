package AutomationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HotelCheckIn {

	public HotelCheckIn() {
		// TODO Auto-generated constructor stub
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

		   
		   String url = "https://www.phptravels.net/";

		   driver.get(url);
		   
		   driver.manage().window().maximize();
		   
		   driver.findElement(By.xpath("//*[@id='collapse']/ul[1]/li[2]/a")).click();
		   
		   driver.findElement(By.className("hotelsearch")).click();
		   
		   driver.findElement(By.xpath("//*[@id=\'select2-drop\']/div/input")).sendKeys("Hyatt");
		   sleep(3);
		   //driver.findElement(By.className("select2-result-label")).click();
		   
		 driver.findElement(By.xpath("//*[@id=\'select2-drop\']/div/input")).sendKeys(Keys.ENTER);
		   
		   sleep(3);
		   driver.findElement(By.name("checkin")).click();
		   
		   driver.findElement(By.xpath("/html/body/div[8]/div[1]/table/tbody/tr[4]/td[6]")).click();
		   
		   driver.findElement(By.name("checkout")).clear();
		   
		   sleep(5);
		   
		   driver.findElement(By.name("checkout")).sendKeys("31/7/2018");
		   
		   driver.findElement(By.name("travellers")).click();
		   
		   driver.findElement(By.id("adultPlusBtn")).click();;
		   
		   driver.findElement(By.id("childPlusBtn")).click();;
		   
		   driver.findElement(By.className("btn-lg")).click();
		   
		   
		   
		   
		   sleep(5);
		   
		   
		
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
