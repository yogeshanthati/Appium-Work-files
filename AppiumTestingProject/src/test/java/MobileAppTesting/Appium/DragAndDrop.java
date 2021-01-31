package MobileAppTesting.Appium;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.appium.java_client.*;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.ElementOption;

public class DragAndDrop {

	AppiumDriver<MobileElement> driver;

	@BeforeTest

	public void setUP() throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("deviceName", "RedmiK20pro");
		dc.setCapability("udid", "d015a208");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platVersion", "10");
		dc.setCapability("noReset", "true");

		dc.setCapability("appPackage", "com.mobeta.android.demodslv");
		dc.setCapability("appActivity", "com.mobeta.android.demodslv.Launcher");

		dc.setCapability("skipDeviceInitialization", true);
		dc.setCapability("skipServerInstallation", true);
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url, dc);
		Thread.sleep(3000);
		System.out.println("Application  started");
		Thread.sleep(3000);
	}

	@Test
	public void DragAndDropTest() {

		try {
			MobileElement element = driver.findElementById("com.mobeta.android.demodslv:id/activity_title");
			element.click();
			Thread.sleep(2000);
			

			MobileElement ele3 = driver.findElementsById("com.mobeta.android.demodslv:id/drag_handle").get(2);

			MobileElement ele5 = driver.findElementsById("com.mobeta.android.demodslv:id/drag_handle").get(4);

			TouchAction action = new TouchAction(driver);
			action.longPress(ElementOption.element(ele3)).moveTo(ElementOption.element(ele5)).release().perform();
			

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@AfterTest

	public void tearDown() {

		driver.quit();
	}

}
