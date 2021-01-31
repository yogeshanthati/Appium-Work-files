package actions.appium;

import java.util.HashMap;
import io.appium.java_client.MobileElement;
import utils.Elements;

public class MobileAndroidTerminateApp {
	public void run(HashMap<String, String> params) {
		try {
			String appPackage=params.get("appPackage");
			if(appPackage!=null) {
			 boolean value=(Driver.driver).terminateApp(appPackage);
			}
			
		} catch (Exception e) {

			e.printStackTrace();
		
		}
	}
}
