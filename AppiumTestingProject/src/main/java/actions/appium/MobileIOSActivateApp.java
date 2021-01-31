package actions.appium;

import java.util.HashMap;
import io.appium.java_client.MobileElement;
import utils.Elements;

public class MobileIOSActivateApp {
	public void run(HashMap<String, String> params) {
		try {
			String appPackage=params.get("bundleID");
			 (Driver.driver).activateApp(appPackage);
			
		} catch (Exception e) {

			e.printStackTrace();
		
		}
	}
}
