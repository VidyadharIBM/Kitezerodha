package Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public WebDriver driver;
	
	public void initalizeBrowser() {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\pradn\\Downloads\\chromedriver_win32\\chromedriver.exe");  
		    driver=new ChromeDriver();
		    
		    //open the application
			   driver.get("https://kite.zerodha.com/");
		    
		   //maximize
			   driver.manage().window().maximize();
			    
		   //global wait
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		System.out.println("Vidyadhar");
	}
}
