package actions.appium;

import java.util.HashMap;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.ElementOption;
import utils.Elements;

public class MobileAndroidScrollToViewElement {
	public void run(HashMap<String, String> params) {
		try {

			String ScrollToElementText = params.get("ScrollToElementText");
			if(ScrollToElementText!=null && (Driver.driver)!=null) {
			(Driver.driver).findElementByAndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
							+ ScrollToElementText + "\").instance(0))");
			Thread.sleep(1000);
			
			
			}

		} catch (Exception e) {

			e.printStackTrace();

		}
	}
}
