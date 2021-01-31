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

public class MobileAlerts {

	AppiumDriver<MobileElement> driver;

	@BeforeTest

	public void setUP() throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("deviceName", "RedmiK20pro");
		dc.setCapability("udid", "d015a208");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platVersion", "10");
		dc.setCapability("noReset", "true");
		dc.setCapability("appPackage", "com.touchboarder.android.api.demos");
		dc.setCapability("appActivity", "com.touchboarder.androidapidemos.MainActivity");
		dc.setCapability("skipDeviceInitialization", true);
		dc.setCapability("skipServerInstallation", true);
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(url, dc);
		Thread.sleep(3000);
		System.out.println("Application  started");
		Thread.sleep(3000);

	}

	@Test
	public void AlertTest() {

		try {
			driver.findElementsById("android:id/text1").get(1).click();// APIDemos
			Thread.sleep(1000);

			driver.findElementsById("android:id/text1").get(2).click();// App
			Thread.sleep(1000);

			driver.findElementsById("android:id/text1").get(3).click(); // Alert dialogs

			Thread.sleep(1000);

			driver.findElementById("com.touchboarder.android.api.demos:id/two_buttons").click();

			String result = driver.findElementById("android:id/alertTitle").getText();
			System.out.println("Alert text Is -> " + result);

			driver.findElementById("android:id/button1").click();

			driver.findElementById("com.touchboarder.android.api.demos:id/two_buttons").click();

			driver.findElementById("android:id/button2").click();

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	@AfterTest

	public void tearDown() {

		driver.quit();
	}

}
