package MobileAppTesting.Appium;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.appium.java_client.MobileElement;
import io.appium.java_client.appmanagement.ApplicationState;
import io.appium.java_client.ios.IOSDriver;

public class MobileIOSTestSample {

	IOSDriver<MobileElement> driver;

	@BeforeTest

	public void setUP() throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("deviceName", "Lenovo K8 Plus");
		dc.setCapability("udid", "HNB4KX7E");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platVersion", "8.0.0");
		dc.setCapability("noReset", true);
		dc.setCapability("appPackage", "com.touchboarder.android.api.demos");
		dc.setCapability("appActivity", "com.touchboarder.androidapidemos.MainActivity");
		dc.setCapability("skipDeviceInitialization", true);
		dc.setCapability("skipServerInstallation", true);
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new IOSDriver<MobileElement>(url, dc);
		Thread.sleep(3000);
		System.out.println("Application  started");
		Thread.sleep(3000);

	}

	@Test
	public void RotateTest() {

		try {

			System.out.println(" current Screen Orientation----->" + driver.getOrientation());

			driver.rotate(ScreenOrientation.LANDSCAPE);

			driver.hideKeyboard();

			// driver.rotate(new DeviceRotation(10, 10, 10)); throwing exception

			// driver.toggleAirplaneMode(); throwing exception.

			// driver.pressKey(AndroidKey.HOME);
			
			// driver.startActivity(new Activity("com.example", "ActivityName"));

			// driver.toggleData();// not working

			// driver.toggleAirplaneMode();

			// driver.toggleData();

		
			boolean value = driver.isAppInstalled("com.touchboarder.android.api.demos");
			
			driver.activateApp("com.touchboarder.android.api.demos");
			
			ApplicationState Appstate=driver.queryAppState("com.touchboarder.android.api.demos");
			
			String app=Appstate.toString();
			
			System.out.println(app);
			
			driver.hideKeyboard();
			
			driver.launchApp();
			
			driver.getKeyboard();
			
			driver.terminateApp("com.touchboarder.android.api.demos");
			
			driver.rotate(new DeviceRotation(10, 10, 10));
			
			driver.closeApp();
			
			driver.unlockDevice();
		//	driver.toggleLocationServices();
			driver.lockDevice();
			boolean isKeyboardShown = driver.isKeyboardShown();
		//	driver.toggleWifi();
			boolean isdevicelocked = driver.isDeviceLocked();
		//	driver.pressKey(new KeyEvent(IosKey.HOME));
			
			Thread.sleep(2000);
			System.out.println(" current Screen Orientation----->" + driver.getOrientation());
			driver.rotate(ScreenOrientation.PORTRAIT);
        //WebElement element=driver.findElementsById("android:id/text1");// APIDemos

			driver.findElementsById("android:id/text1").get(11).click();// views
			
			String visibleString = "WebView";
			
			String context = driver.getContext();
			
			driver.findElementByIosNsPredicate("value CONTAINS 'Notes'").click();
			
			Thread.sleep(1000);
			
			driver.context("");
			//--------------------------------------------------------
			
			/*
			 * TouchAction touch = new TouchAction(driver);
			 * touch.tap(ElementOption.element(element)).tap(ElementOption.element(element))
			 * .perform(); touch.longPress(longPressOptions)
			 */

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	@AfterTest

	public void tearDown() {

		driver.quit();
	}

}
