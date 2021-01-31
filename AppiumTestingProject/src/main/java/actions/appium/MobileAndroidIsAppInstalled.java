package actions.appium;

import java.util.HashMap;
import io.appium.java_client.MobileElement;
import utils.Elements;

public class MobileAndroidIsAppInstalled {
	public boolean run(HashMap<String, String> params) {
		try {
			String appPackage=params.get("appPackage");
			 boolean value=driver.isAppInstalled(appPackage);
			return value;
		} catch (Exception e) {
			e.printStackTrace();
			return (Boolean) null;
		}
	}
}
