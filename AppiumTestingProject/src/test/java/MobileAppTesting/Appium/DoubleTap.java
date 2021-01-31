package MobileAppTesting.Appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.offset.ElementOption;

public class DoubleTap{

	AppiumDriver<MobileElement> driver;

	@BeforeTest

	public void setUP() throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("deviceName", "RedmiK20pro");
		dc.setCapability("udid", "d015a208");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platVersion", "10");
		dc.setCapability("noReset", "true");
		dc.setCapability("appPackage", "io.selendroid.testapp");
		dc.setCapability("appActivity", "io.selendroid.testapp.HomeScreenActivity");
		dc.setCapability("skipDeviceInitialization", true);
		dc.setCapability("skipServerInstallation", true);
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(url, dc);
		Thread.sleep(3000);
		System.out.println("Application  started");
		Thread.sleep(3000);
	}

	@Test
	public void DoubleTapTest() {

		try {
			
		
			MobileElement element = driver.findElementById("io.selendroid.testapp:id/visibleButtonTest");
	
		    AndroidTouchAction touch = new AndroidTouchAction(driver);
		    
		  // TouchActions touch= new  TouchActions(driver)    -----------> not working
		    //touch.doubleClick(element).perform();   
		    
		    
			touch.tap(ElementOption.element(element)).tap(ElementOption.element(element)).perform();
			
			
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	@AfterTest

	public void tearDown() {

		driver.quit();
	}

}
