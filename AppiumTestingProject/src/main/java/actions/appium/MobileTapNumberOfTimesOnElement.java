package actions.appium;

import java.util.HashMap;
import utils.Constants;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.ElementOption;
import utils.Elements;

public class MobileTapNumberOfTimesOnElement {
	public void run(HashMap<String, String> params) {
		try {
			MobileElement element = Elements.find(params, Driver.driver);
			TouchAction touch = new TouchAction(Driver.driver);
			int noOfTimes = Integer.parseInt(params.get("NumOftimes"));
			for (int i = 0; i < noOfTimes; i++) {
				touch.tap(ElementOption.element(element)).perform();
			}
		} catch (NumberFormatException e) {

			e.printStackTrace();
		}
	}

}
