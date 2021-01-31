package actions.appium;

import java.time.Duration;
import java.util.HashMap;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class MobileLongTap {

	public void run(HashMap<String, String> params) {
		try {
			MobileElement element = Elements.find(params, Driver.driver);
			String durationString = params.get("Duration");
			Integer duration = Integer.parseInt(durationString);
                        TouchAction touch = new TouchAction(Driver.driver);
			  touch.press(ElementOption.element(element)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(duration))).release().perform();
			 

		} catch (NumberFormatException e) {
			
			e.printStackTrace();
		}
	}

}
