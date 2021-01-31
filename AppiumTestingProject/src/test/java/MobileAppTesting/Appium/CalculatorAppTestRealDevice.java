package MobileAppTesting.Appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class CalculatorAppTestRealDevice {

	AppiumDriver<MobileElement> driver;

	@BeforeTest

	public void setUP() throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability("deviceName", "RedmiK20pro");
		
	//	dc.setCapability("udid", "d015a208");
		dc.setCapability("platformName", "Android");
		
	//	dc.setCapability("platVersion", "10");
		dc.setCapability("noReset", "true");
		
		dc.setCapability("appPackage", "com.google.android.calculator");
		
		dc.setCapability("appActivity", "com.android.calculator2.Calculator");
		
		dc.setCapability("skipDeviceInitialization", true);
		
		dc.setCapability("skipServerInstallation", true);
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		driver = new AndroidDriver<MobileElement>(url, dc);
		
		Thread.sleep(3000);
		
		System.out.println("Application  started");
		
		Thread.sleep(3000);
	}

	@Test
	public void calulatorTest() {

		try {
			MobileElement dig2 = driver.findElementById("com.google.android.calculator:id/digit_2");
			
			dig2.click();
			
			MobileElement mul = driver.findElementById("com.google.android.calculator:id/op_mul");
			
			mul.click();

			MobileElement dig3 = driver.findElementById("com.google.android.calculator:id/digit_3");
			
			dig3.click();

			driver.findElementById("com.google.android.calculator:id/eq").click();
			
			Thread.sleep(3000);
			
			String result = driver.findElementById("com.google.android.calculator:id/result_final").getText();
			
			if (Integer.parseInt(result) == 6) {
				
				System.out.println("pass");

				String packagename =  driver.getCapabilities().getCapability("appPackage").toString();

				String Activityname = driver.getCapabilities().getCapability("appActivity").toString();

				System.out.println(packagename +" "+Activityname);
				
			} else {
				
				System.out.println("Fail");
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	@AfterTest

	public void tearDown() {

		driver.quit();
	}

}
