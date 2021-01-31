package actions.appium;

import java.util.HashMap;
import io.appium.java_client.MobileElement;
import utils.Elements;

public class MobileIOSIsAppInstalled {
	public boolean run(HashMap<String, String> params) {
		try {
			String appBundleId=params.get("bundleID");
			 boolean value=(Driver.driver).isAppInstalled(appBundleId);
			return value;
		} catch (Exception e) {

			e.printStackTrace();
			return (Boolean) null;
		}
	}
}
