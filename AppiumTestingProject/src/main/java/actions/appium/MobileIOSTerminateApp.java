package actions.appium;

import java.util.HashMap;
import io.appium.java_client.MobileElement;
import utils.Elements;

public class MobileIOSTerminateApp {
	public void run(HashMap<String, String> params) {
		try {
			String bundleID=params.get("bundleID");
			 boolean value=(Driver.driver).terminateApp(bundleID);
			
		} catch (Exception e) {

			e.printStackTrace();
		
		}
	}
}
