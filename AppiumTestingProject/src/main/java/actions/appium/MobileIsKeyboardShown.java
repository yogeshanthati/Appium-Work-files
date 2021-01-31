package actions.appium;

import java.util.HashMap;
import io.appium.java_client.MobileElement;
import utils.Elements;

public class MobileIsKeyboardShown {
	public boolean run(HashMap<String, String> params) {
		try {

			boolean value = (Driver.driver).isKeyboardShown();
			return value;
		} catch (Exception e) {

			e.printStackTrace();
			return (Boolean) null;
		}
	}
}
