package actions.appium;

import java.util.HashMap;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.ElementOption;
import utils.Elements;

public class MobileSetCurrentContext {
	public void run(HashMap<String, String> params) {
		try {
			String contextName = params.get("ContextName");
			(Driver.driver).context(contextName);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
