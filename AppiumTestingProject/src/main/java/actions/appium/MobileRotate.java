package actions.appium;

import java.util.HashMap;
import reports.*;

import org.openqa.selenium.ScreenOrientation;

import io.appium.java_client.MobileElement;

public class MobileRotate {

	public void run(HashMap<String, String> params) {
		String Orientation = params.get("Orientation");

		try {

			switch (Orientation) {

			case "LANDSCAPE":
				(Driver.driver).rotate(ScreenOrientation.LANDSCAPE);

				break;
			case "PORTRAIT":

				(Driver.driver).rotate(ScreenOrientation.PORTRAIT);

				break;

			default:
				Log.info("Invalid input entered.");

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
