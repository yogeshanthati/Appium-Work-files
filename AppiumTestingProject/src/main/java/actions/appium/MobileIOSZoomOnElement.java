package actions.appium;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileElement;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSTouchAction;
import io.appium.java_client.touch.offset.ElementOption;

public class MobileIOSZoomOnElement {
	
	public void run(HashMap<String, String> params) {
		
		try {
			MobileElement map = Elements.find(params, Driver.driver);

			Thread.sleep(4000);

			final int x1 = map.getLocation().getX();
			final int y1 = map.getLocation().getY();

		
			final int x = map.getLocation().getX() + map.getSize().getWidth() / 2;
			final int y = map.getLocation().getY() + map.getSize().getHeight() / 2;

			//Log.info("Now zooming");
			final IOSTouchAction finger1 = new IOSTouchAction(Driver.driver);
			finger1.press(ElementOption.element(map, x, y - 10)).moveTo(ElementOption.element(map, x, y - 100));

			final IOSTouchAction finger2 = new IOSTouchAction(Driver.driver);

			finger2.press(ElementOption.element(map, x, y + 10)).moveTo(ElementOption.element(map, x, y + 100));

			final MultiTouchAction action = new MultiTouchAction(Driver.driver);
			
			action.add(finger1).add(finger2).perform();

			//Log.info("Zoom Done");
			
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}
