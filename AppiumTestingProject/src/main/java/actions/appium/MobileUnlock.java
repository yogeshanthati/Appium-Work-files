package actions.appium;

import java.util.HashMap;

import org.openqa.selenium.ScreenOrientation;

import io.appium.java_client.MobileElement;

public class MobileUnlock {

	public void run(HashMap<String, String> params) {

		try {

			(Driver.driver).unlockDevice();
			}

		catch (Exception e) {
			e.printStackTrace();
		}

	}
}