package actions.appium;

import java.util.HashMap;
import utils.Elements;
import org.openqa.selenium.remote.RemoteWebElement;

import io.appium.java_client.MobileElement;

public abstract class MobileIOSScrollToView {

	public void run(HashMap<String, String> params) {

		try {
			MobileElement element = Elements.find(params, Driver.driver);

			String elementID = element.getId();

			String attribute = params.get("attribute");
			String oldvalue = params.get("value");

			String value = '\'' + oldvalue + '\'';
			String PredicateStringValue = "\"" + attribute + "\"" + "==" + "\"" + value + "\"";

			HashMap<String, String> scrollObject = new HashMap<String, String>();

			scrollObject.put("element", elementID);

			scrollObject.put("predicateString", PredicateStringValue);

			(Driver.driver).executeScript("mobile:scroll", scrollObject); // scroll to the target element
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
