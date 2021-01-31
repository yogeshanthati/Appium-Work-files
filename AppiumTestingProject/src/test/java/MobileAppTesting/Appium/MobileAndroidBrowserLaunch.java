package MobileAppTesting.Appium;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class MobileAndroidBrowserLaunch {

	 RemoteWebDriver driver;

	@Test

	public void setUP() throws MalformedURLException, InterruptedException {
		
	
			DesiredCapabilities dc = new DesiredCapabilities();
			dc.setCapability("deviceName", "RedmiK20pro");
			dc.setCapability("platformName", "Android");
			dc.setCapability("platVersion", "10");
		
			dc.setCapability("browserName", "chrome");
			
			dc.setCapability("chromedriverExecutable","C:\\Users\\Yogesh\\Desktop\\AppiumWorkfiles\\AppiumTestingProject\\chromedriver.exe" );
		
	
			
		  URL url = new URL("http://127.0.0.1:4723/wd/hub"); 
		  
		  driver = new RemoteWebDriver(url, dc); 
		  Thread.sleep(3000);
		  
		  driver.get("http://practice.automationtesting.in/");
		 
		System.out.println("Application  started");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//h2[contains(text(),'new arrivals')]")).click();
		
		Thread.sleep(3000);

	}
}