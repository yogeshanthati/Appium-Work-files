package actions.appium;
import java.util.HashMap;

import org.openqa.selenium.Point;

import utils.Constants;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.ElementOption;
import utils.Elements;

public class MobileGetElementLocation {
	public Point run(HashMap<String, String> params) {
		try {
			MobileElement element = Elements.find(params, Driver.driver);
			
			Point location=element.getLocation();
			
			return location;
		
		} catch (Exception e) {

			e.printStackTrace();
			return null;
		}
	}
}
