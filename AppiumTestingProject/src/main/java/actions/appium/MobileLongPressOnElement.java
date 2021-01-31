package actions.appium;

import java.util.HashMap;
import java.time.Duration;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import utils.Elements;


public class MobileLongPressOnElement {
	public void run(HashMap<String, String> params) {
		
		try {
			MobileElement element = Elements.find(params, Driver.driver);
			TouchAction touch = new TouchAction(Driver.driver);
			touch.longPress(ElementOption.element(element)).perform();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
