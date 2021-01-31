package actions.appium;
import java.util.HashMap;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSTouchAction;
import io.appium.java_client.touch.offset.ElementOption;
import utils.Elements;


public class MobileIOSDoubleTapOnElement {
	
	public void run(HashMap<String, String> params) {
		try {
			MobileElement element = Elements.find(params, Driver.driver);
			IOSTouchAction touch = new IOSTouchAction(Driver.driver);
			touch.tap(ElementOption.element(element)).tap(ElementOption.element(element)).perform();
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}
