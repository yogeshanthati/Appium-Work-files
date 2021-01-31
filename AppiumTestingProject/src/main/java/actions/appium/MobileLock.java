package actions.appium;

import java.util.HashMap;

import io.appium.java_client.MobileElement;

public class MobileLock {

	public void run(HashMap<String, String> params) {

		try {

			(Driver.driver).lockDevice();
			}

		catch (Exception e) {
			e.printStackTrace();
		}

	}
}