package actions.appium;

import java.util.HashMap;

import io.appium.java_client.MobileElement;

public class MobileHideKeyboard {

	public void run(HashMap<String, String> params) {
		MobileElement element = Elements.find(params, Driver.driver);
		try {
			(Driver.driver).hideKeyboard();
		
		} catch (Exception e) {			
			e.printStackTrace();
		}

}
	
}
