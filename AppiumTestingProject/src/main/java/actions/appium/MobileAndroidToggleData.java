package actions.appium;

import java.util.HashMap;

import org.openqa.selenium.ScreenOrientation;

import io.appium.java_client.MobileElement;

public class MobileAndroidToggleData {

	public void run(HashMap<String, String> params) {

		try {
			if((Driver.driver)!=null) {
			(Driver.driver).toggleData();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}
}