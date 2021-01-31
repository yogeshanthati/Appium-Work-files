package actions.appium;

import java.util.HashMap;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.ElementOption;
import utils.Elements;

public class MobileAndroidGetActivity {
	public String run(HashMap<String, String> params) {
		try {

			String Activityname = (Driver.driver).getCapabilities().getCapability("appActivity").toString();

			return Activityname;

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
