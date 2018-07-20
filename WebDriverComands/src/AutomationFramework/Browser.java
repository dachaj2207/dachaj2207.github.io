package AutomationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
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
		
			   
			   String url = "http://www.store.demoqa.com";
		
			   driver.get(url);
			   
			   String title = driver.getTitle();
			   
			   int titlelenght = title.length();
			   
			   System.out.println("Title is:" + title);
               System.out.println("Title lenght is:" + titlelenght);
               
               
               String ActualUrl= driver.getCurrentUrl();
               
               
            	   if (ActualUrl.equals(url)) {
            		   System.out.println("Correct page is opened");
            	   }
              
            	   else {
            		   System.out.println("Wrong page is opened");
            		   System.out.println("Actual url is :" + ActualUrl);
            		   System.out.println("Expected url is :" + url);
            		   
            		   
            	String HTMLPageSource = driver.getPageSource();
            	
            	
            	
            	
            	int PageSourceLenght = HTMLPageSource.length();
            	
            	System.out.println("Page source lenght is:" + PageSourceLenght);
            	
            	sleep(15);
            	
            	driver.close();
               
               
               
               
               }
               
               
               
               
			   
			   
			   
			   
			   
			   
			   
			   

	}

}
