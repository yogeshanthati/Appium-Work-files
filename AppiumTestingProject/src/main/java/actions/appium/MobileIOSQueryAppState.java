package actions.appium;

import java.util.HashMap;
import io.appium.java_client.MobileElement;
import utils.Elements;

public class MobileIOSQueryAppState {
	public String run(HashMap<String, String> params) {
		try {
			String appBundleId=params.get("bundleID");
			String AppState = (Driver.driver).queryAppState(appBundleId).toString();

			return AppState;

		} catch (Exception e) {
			e.printStackTrace();
			return null;

		}
	}
}
