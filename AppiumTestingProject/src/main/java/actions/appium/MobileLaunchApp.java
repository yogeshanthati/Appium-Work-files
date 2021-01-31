package actions.appium;

import java.util.HashMap;

import io.appium.java_client.MobileElement;

public class MobileLaunchApp {

	public void run(HashMap<String, String> params) {

		try {

			(Driver.driver).launchApp();
		}

		catch (Exception e) {
			e.printStackTrace();
		}

	}
}