package actions.appium;

import java.util.HashMap;

import org.openqa.selenium.ScreenOrientation;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class MobileAndroidLongPressKeyCode {

	public void run(HashMap<String, String> params) {

		try {

			driver.longPressKey(new KeyEvent(AndroidKey.HOME));
		}

		catch (Exception e) {
			e.printStackTrace();
		}

	}
}