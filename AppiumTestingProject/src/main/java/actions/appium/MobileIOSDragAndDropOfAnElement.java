package actions.appium;

import java.util.HashMap;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSTouchAction;
import io.appium.java_client.touch.offset.ElementOption;
import utils.*;

public class MobileIOSDragAndDropOfAnElement {
	public void run(HashMap<String, String> params) {
		try {
			MobileElement element1 = Elements2.find1(params, Driver.driver);
			MobileElement element2 = Elements2.find2(params, Driver.driver);
			IOSTouchAction action = new IOSTouchAction(Driver.driver);
			action.longPress(ElementOption.element(element1)).moveTo(ElementOption.element(element2)).release()
					.perform();
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}
