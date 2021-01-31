package actions.appium;

import java.util.HashMap;
import utils.Constants;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.ElementOption;
import utils.Elements;

public class MobileGetTagName {
	public String run(HashMap<String, String> params) {
		try {
			MobileElement element = Elements.find(params, Driver.driver);
			return element.getTagName();
		} catch (Exception e) {

			e.printStackTrace();
			return null;
		}
	}
}
