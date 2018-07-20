package AutomationFramework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Booking {

	public Booking() {
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
		   
		   driver.findElement(By.xpath("//*[@id='collapse']/ul[1]/li[3]/a")).click();
		   
		   
		   driver.findElement(By.cssSelector("#body-section > div.listingbg > div > div.col-md-3 > div > div.panel-body > div:nth-child(8) > div > div > ins")).click();
		   
		   driver.findElement(By.id("bookbtn")).click();;
		   
		   
		   driver.findElement(By.name("firstname")).sendKeys("Danijel");
		   //Ime
		   driver.findElement(By.name("lastname")).sendKeys("Jovanovic");
		   //Prezime
		   driver.findElement(By.name("email")).sendKeys("dacha2207@hotmail.com");
		   //mail
		   driver.findElement(By.name("confirmemail")).sendKeys("dacha2207@hotmail.com");
		   //checkmail
		   
		   driver.findElement(By.name("phone")).sendKeys("069780332");
		   //telefon
		   
		   driver.findElement(By.name("address")).sendKeys("Kosmajska 20");
		   //Adresa
		   sleep(5);
		   driver.findElement(By.xpath("//*[@id='s2id_autogen1']/a/span[1]")).click();
		   
		   driver.findElement(By.name("guest")).click();
		   
		   System.out.println("Dobro je");
		   
		   sleep(5);
		   
  String Curr = driver.getCurrentUrl();
		   
		   if (Curr.contains("sessid")) {
			   
			   System.out.println("Nijebug");
			   driver.close();
		   }
		   
		   else {
			   System.out.println("Bug");
			   driver.close();
		   }
		   
		   
		   
		   
		   
		   
		   
		  
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
