package actions.appium;
import java.util.HashMap;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.ElementOption;
import utils.Elements;

public class MobileGetElementAttribute {
	public String run(HashMap<String, String> params) {
		try {
			MobileElement element = Elements.find(params, Driver.driver);
			String attributeName=params.get("AttributeName");
			return element.getAttribute(attributeName);
		} catch (Exception e) {

			e.printStackTrace();
			return null;
		}
	}
}
