package actions.appium;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileElement;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.ElementOption;

public class MobilePinch {
	public void run(HashMap<String, String> params) {
		try {
			MobileElement map = Elements.find(params, Driver.driver);

			Thread.sleep(40000);

			final int x1 = map.getLocation().getX();
			final int y1 = map.getLocation().getY();

			System.out.println("x is " + x1 + "y1 is " + y1);

			final int x = map.getLocation().getX() + map.getSize().getWidth() / 2;
			final int y = map.getLocation().getY() + map.getSize().getHeight() / 2;

			System.out.println ("Pinching");
			final TouchAction finger1= new TouchAction(driver);
			
			finger1.press(ElementOption.element(map, x, y-100)).moveTo(ElementOption.element(map, x, y-10));

			final TouchAction finger2= new TouchAction(driver);
			
			finger2.press(ElementOption.element(map, x, y+100)).moveTo(ElementOption.element(map, x, y+10));

			final MultiTouchAction action2= new MultiTouchAction(driver);
			action2.add(finger1).add(finger2).perform();
			Thread.sleep (5000);
			System.out.println ("Pinching Done");
			Thread.sleep(8000);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}
