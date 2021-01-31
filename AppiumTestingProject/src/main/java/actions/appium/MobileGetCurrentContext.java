package actions.appium;

import java.util.HashMap;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.ElementOption;
import utils.Elements;

public class MobileGetCurrentContext {
	public String run(HashMap<String, String> params) {
		try {

			String contextName = (Driver.driver).getContext();

			return contextName;

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
