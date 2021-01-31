package actions.appium;
import java.util.HashMap;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.ElementOption;
import utils.Elements;

public class MobileGetAlertText {
	public String run(HashMap<String, String> params) {
		try {
			MobileElement AlertElement = Elements.find(params, Driver.driver);
			return AlertElement.getText();
		} catch (Exception e) {

			e.printStackTrace();
			return null;
		}
	}
}
