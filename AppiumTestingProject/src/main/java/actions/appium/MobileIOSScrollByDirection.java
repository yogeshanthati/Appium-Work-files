package actions.appium;

import java.util.HashMap;
import utils.Elements;
import org.openqa.selenium.remote.RemoteWebElement;

import io.appium.java_client.MobileElement;

public abstract class MobileIOSScrollByDirection {

	public void run(HashMap<String, String> params) {

		try {
			MobileElement element = Elements.find(params, Driver.driver);

			String elementID = element.getId();

			String dir = params.get("Direction");

			HashMap<String, String> scrollObject = new HashMap<String, String>();

			scrollObject.put("element", elementID);

			scrollObject.put("direction", dir);

			(Driver.driver).executeScript("mobile:scroll", scrollObject);
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
