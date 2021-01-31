package actions.appium;

import java.util.HashMap;

import javax.swing.event.DocumentEvent.ElementChange;

import utils.Constants;
import java.time.Duration;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import utils.Elements;
import utils.SwipeElement;

public class MobileIOSSelectPickerWheel {
	public void run(HashMap<String, String> params) {
		try {
			MobileElement element = Elements.find(params, Driver.driver);
			String direction=params.get("direction");
			HashMap<String, Object> PickerWheelparams = new HashMap<String, Object>();
			PickerWheelparams.put("order", direction);
			PickerWheelparams.put("offset", 0.15);
			PickerWheelparams.put("element", element.getId());
			(Driver.driver).executeScript("mobile: selectPickerWheelValue", PickerWheelparams);
	
		} catch (NumberFormatException e) {
			
			e.printStackTrace();
		}
	}
}
