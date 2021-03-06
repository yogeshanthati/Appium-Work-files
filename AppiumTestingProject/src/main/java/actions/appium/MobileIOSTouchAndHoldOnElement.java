package actions.appium;


import java.util.HashMap;
import java.time.Duration;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSTouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import utils.Elements;


public class MobileIOSTouchAndHoldOnElement {
	public void run(HashMap<String, String> params) {
		try {
			MobileElement element = Elements.find(params, Driver.driver);
			String durationString = params.get("Duration");
			Integer duration = Integer.parseInt(durationString);
			IOSTouchAction touch = new IOSTouchAction(Driver.driver);
			touch.press(ElementOption.element(element))
					.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(duration))).perform();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
}
