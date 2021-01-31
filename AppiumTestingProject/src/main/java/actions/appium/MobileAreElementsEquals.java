package actions.appium;

import java.util.HashMap;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.ElementOption;
import utils.*;

public class MobileAreElementsEquals {
	public boolean run(HashMap<String, String> params) {
		try {
			
			MobileElement element1;
			MobileElement element2;
			if (element1!=null &&element2!=null) {
				element1 = Elements2.find1(params, Driver.driver);
				element2 = Elements2.find2(params, Driver.driver);
			}
			return element1.equals(element2);
		} catch (Exception e) {
         e.printStackTrace();
         return (Boolean) null;
		}
	}
}
