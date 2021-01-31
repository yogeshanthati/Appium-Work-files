package actions.appium;

import java.util.HashMap;
import io.appium.java_client.MobileElement;
import utils.Elements;

public class MobileAndroidQueryAppState {
	public String run(HashMap<String, String> params) {
		try {
			String appPackage = params.get("appPackage");
			String AppState = (Driver.driver).queryAppState(appPackage).toString();

			return AppState;

		} catch (Exception e) {
			e.printStackTrace();
			return null;

		}
	}
}
