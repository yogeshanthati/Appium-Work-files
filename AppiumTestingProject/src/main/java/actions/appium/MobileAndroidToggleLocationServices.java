package actions.appium;

import java.util.HashMap;

import org.openqa.selenium.ScreenOrientation;

import io.appium.java_client.MobileElement;

public class MobileAndroidToggleLocationServices {

	public void run(HashMap<String, String> params) {

		try {
			if ((Driver.driver) != null) {
				(Driver.driver).toggleLocationServices();
			}
		}

		catch (Exception e) {
			e.printStackTrace();
		}

	}
}