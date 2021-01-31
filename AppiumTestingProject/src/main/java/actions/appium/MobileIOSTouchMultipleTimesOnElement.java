package actions.appium;

import java.util.HashMap;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSTouchAction;
import io.appium.java_client.touch.offset.ElementOption;
import utils.Elements;

public class MobileIOSTouchMultipleTimesOnElement {
	public void run(HashMap<String, String> params) {
		try {
			MobileElement element = Elements.find(params, Driver.driver);
			IOSTouchAction touch = new IOSTouchAction(Driver.driver);
			int noOfTimes = Integer.parseInt(params.get("NumOftimes"));
			for (int i = 0; i < noOfTimes; i++) {
				touch.tap(ElementOption.element(element)).perform();
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}
