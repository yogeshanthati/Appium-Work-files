package MobileAppTesting.Appium;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class MobileRotate {

	AndroidDriver<MobileElement> driver;

	@BeforeTest

	public void setUP() throws MalformedURLException, InterruptedException {
		
	
			DesiredCapabilities dc = new DesiredCapabilities();
			dc.setCapability("deviceName", "RedmiK20pro");
			dc.setCapability("platformName", "Android");
			dc.setCapability("platVersion", "10");
			dc.setCapability("noReset", true);
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
	public void RotateTest() {

		try {		
			/*
			 * TouchActions action = new TouchActions(driver); action.down(10, 10);
			 * action.up(20, 20); action.perform();
			 */
			
			
			  
			  // TouchActions touch= new  TouchActions(driver)    -----------> not working
			    //touch.doubleClick(element).perform(); 

			// driver.rotate(ScreenOrientation.LANDSCAPE);

		//	 driver.hideKeyboard();
			 
		//	 driver.getClipboardText();

			// driver.rotate(new DeviceRotation(10, 10, 10));   // throwing exception

			// driver.toggleAirplaneMode(); throwing exception.

//			driver.pressKey(AndroidKey.HOME);
			// driver.startActivity(new Activity("com.example", "ActivityName"));

			// driver.toggleData();// not working

			// driver.toggleAirplaneMode();

			// driver.toggleData();

			/*
			 * boolean value = driver.isAppInstalled("com.touchboarder.android.api.demos");
			 * driver.activateApp("com.touchboarder.android.api.demos");
			 * 
			 * ApplicationState
			 * Appstate=driver.queryAppState("com.touchboarder.android.api.demos"); String
			 * app=Appstate.toString(); System.out.println(app);
			 * 
			 * driver.launchApp();
			 * 
			 * driver.terminateApp("com.touchboarder.android.api.demos"); driver.closeApp();
			 * 
			 * driver.unlockDevice(); driver.toggleLocationServices(); driver.lockDevice();
			 * boolean isKeyboardShown = driver.isKeyboardShown(); driver.toggleWifi();
			 * boolean isdevicelocked = driver.isDeviceLocked(); driver.pressKey(new
			 * KeyEvent(AndroidKey.HOME));
			 * 
			 * driver.longPressKey(new KeyEvent(AndroidKey.HOME));
			 * 
			 * Thread.sleep(2000); System.out.println(" current Screen Orientation----->" +
			 * driver.getOrientation());
			 * 
			 * driver.rotate(ScreenOrientation.PORTRAIT);
			 */

			//driver.findElementsById("android:id/text1").get(1).click();// APIDemos
			
			/*
			 * String visibleString = "API Demos";
			 * 
			 * driver.findElementByAndroidUIAutomator(
			 * "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
			 * +visibleString+ "\").instance(0))") .click();
			 * 
			 * 
			 * 
			 * String visibleString1= "Views";
			 * 
			 * driver.findElementByAndroidUIAutomator(
			 * "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
			 * + visibleString1 + "\").instance(0))").click();
			 */
			  
			/*
			 * JavascriptExecutor js = (JavascriptExecutor) driver; HashMap<String,String>
			 * scrollObject = new HashMap<String,String>(); scrollObject.put("direction",
			 * "down"); js.executeScript("mobile: scroll", scrollObject);
			 */
			
			//driver.findElementsById("android:id/text1").get(11).click();// views
			
			
			/*
			 * String attribute = "text"; String oldvalue = "views";
			 * 
			 * String value = '\'' + oldvalue + '\''; String PredicateStringValue = "\"" +
			 * attribute + "\"" + "==" + "\"" + value + "\"";
			 * 
			 * 
			 * 
			 * System.out.println(PredicateStringValue);
			 */
			
			/*
			 * driver.pressKey(new KeyEvent(AndroidKey.HOME)); String context =
			 * driver.getContext();
			 * 
			 * 
			 * driver.findElementByAndroidUIAutomator(
			 * "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
			 * + visibleString + "\").instance(0))") .click();
			 * 
			 * 
			 * 
			 * driver.findElementByName(visibleString);
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
