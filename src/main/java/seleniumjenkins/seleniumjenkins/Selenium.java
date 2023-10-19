package seleniumjenkins.seleniumjenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium {
	
	
	
	@Test
	public void launchBrowser()
	{

System.setProperty("webdriver.chrome.driver", "D:\\seleniumjenkins\\drivers\\chromedriver.exe");

    	WebDriver driver=new ChromeDriver();
    	driver.get("https://www.facebook.com/login.php");
    	
        System.out.println( "hello joy" );
    
			
	}

}
