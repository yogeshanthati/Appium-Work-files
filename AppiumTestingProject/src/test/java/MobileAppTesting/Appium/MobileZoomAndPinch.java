package MobileAppTesting.Appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.touch.offset.ElementOption;

public class MobileZoomAndPinch {
	private static IOSDriver <MobileElement> driver;
	@Test
	public void zoomTest() throws MalformedURLException, InterruptedException {
		final DesiredCapabilities dcap = new DesiredCapabilities ();
		dcap.setCapability("deviceName", "Lenovo K8 Plus");
		dcap.setCapability("udid", "HNB4KX7E");
		dcap.setCapability("platformName", "Android");
		dcap.setCapability("platVersion", "8.0.0");
		dcap.setCapability("appPackage", "com.google.android.apps.maps");
		dcap.setCapability("appActivity", "com.google.android.maps.MapsActivity");

		driver = new IOSDriver <MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), dcap);
		
		

		final WebElement map = driver.findElement (By.id ("com.google.android.apps.maps:id/mainmap_container"));
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		final int x1= map.getLocation().getX();
		final int y1= map.getLocation().getY();

		System.out.println("x is "+x1 +"y1 is "+y1);

		final int x=map.getLocation().getX()+map.getSize().getWidth()/2;
		final int y= map.getLocation().getY()+map.getSize().getHeight()/2;

		//Zoom
		System.out.println ("Now zooming");
		final TouchAction finger1= new TouchAction(driver);
		finger1.press(ElementOption.element(map, x, y-10)).moveTo(ElementOption.element(map, x, y-100));
		

		final TouchAction finger2= new TouchAction(driver);
	
		finger2.press(ElementOption.element(map, x, y+10)).moveTo(ElementOption.element(map, x, y+100));

		final MultiTouchAction action= new MultiTouchAction(driver);
		action.add(finger1).add(finger2).perform();

		System.out.println ("Zoom Done");
		Thread.sleep(8000);

		//Pinch
		System.out.println ("Pinching");
		final TouchAction finger3= new TouchAction(driver);
		
		finger3.press(ElementOption.element(map, x, y-100)).moveTo(ElementOption.element(map, x, y-10));

		final TouchAction finger4= new TouchAction(driver);
		
		finger4.press(ElementOption.element(map, x, y+100)).moveTo(ElementOption.element(map, x, y+10));

		final MultiTouchAction action2= new MultiTouchAction(driver);
		action2.add(finger3).add(finger4).perform();
		Thread.sleep (5000);
		System.out.println ("Pinching Done");

		driver.quit ();

	}

}