package MobileAppTesting.Appium;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.windows.PressesKeyCode;
import io.appium.java_client.windows.WindowsDriver;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;

public class InstallAppTest {
	
  @Test
  public void InstallApp() throws MalformedURLException, InterruptedException {
	  
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("deviceName", "RedmiK20pro");
		dc.setCapability("udid", "d015a208");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platVersion", "10");
		dc.setCapability("noReset", "true");
		dc.setCapability("app", "C:\\Users\\Yogesh\\Desktop\\AppiumTestingProject\\App\\apk\\selendroid-test-app.apk");
		dc.setCapability("skipDeviceInitialization", true);
		dc.setCapability("skipServerInstallation", true);
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		AppiumDriver<MobileElement> driver= new AndroidDriver<MobileElement>(url, dc);
		//Thread.sleep(3000);
		System.out.println("Application  installed");
		WindowsDriver driver1 = null; 
		
		((PressesKeyCode) driver).pressKeyCode(0);
    //   driver.close();
  }
 

}
