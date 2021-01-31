package actions.appium;

import java.util.HashMap;

import org.openqa.selenium.interactions.touch.TouchActions;

import io.appium.java_client.MobileElement;
import utils.Elements;

public class MobileScrollByAxis{

	public void run(HashMap<String, String> params) {

		try {
			MobileElement element= Elements.find(params, Driver.driver);
			TouchActions actions = new TouchActions(Driver.driver);
			int xOffset=Integer.parseInt(params.get("xOffset").toString());
			int yOffset=Integer.parseInt(params.get("yOffset").toString());
			actions.scroll(element, xOffset, yOffset);
			}

		catch (Exception e) {
			e.printStackTrace();
		}

	}
}