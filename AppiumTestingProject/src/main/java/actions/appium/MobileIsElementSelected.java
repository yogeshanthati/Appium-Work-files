package actions.appium;

import java.util.HashMap;
import utils.Constants;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.ElementOption;
import utils.Elements;

public class MobileIsElementSelected {
	public boolean run(HashMap<String, String> params) {
		try {
			MobileElement element = Elements.find(params, Driver.driver);
			return element.isSelected();
		} catch (Exception e) {

			e.printStackTrace();
			return (Boolean) null;
		}
	}
}
