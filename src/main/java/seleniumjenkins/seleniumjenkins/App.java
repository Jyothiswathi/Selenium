package seleniumjenkins.seleniumjenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.setProperty("webdriver.chrome.driver", "D:\\seleniumjenkins\\drivers\\chromedriver.exe");

    	
    	WebDriver driver=new ChromeDriver();
    	driver.get("https://www.facebook.com/login.php");
    	
        System.out.println( "hello hi" );
    }
}
