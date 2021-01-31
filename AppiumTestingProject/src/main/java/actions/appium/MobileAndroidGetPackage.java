package actions.appium;
import java.util.HashMap;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.ElementOption;
import utils.Elements;

public class MobileAndroidGetPackage {
	public String run(HashMap<String, String> params) {
		try {

			String Packagename =  (Driver.driver).getCapabilities().getCapability("appPackage").toString();
			
			return Packagename;
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
