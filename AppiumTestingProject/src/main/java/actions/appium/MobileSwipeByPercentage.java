package actions.appium;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;

import utils.Elements;

import java.util.HashMap;

import org.openqa.selenium.Dimension;



import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSTouchAction;

public class MobileSwipeByPercentage{

	public void run(HashMap<String,String> params) {
		try {
			double anchorPercentage=Double.parseDouble(Elements.find(params.get("anchorPercentage").toString(),Driver.driver));
			double startPercentage=Double.parseDouble(Elements.find(params.get("startPercentage").toString(),Driver.driver));
			double endPercentage=Double.parseDouble(Elements.find(params.get("endPercentage").toString(),Driver.driver));
			  Dimension size = Driver.driver.manage().window().getSize();
			  IOSTouchAction action = new IOSTouchAction(Driver.driver);
			    int anchor = (int) (size.height * anchorPercentage);
			    int startPoint = (int) (size.width * startPercentage);
			    int endPoint = (int) (size.width * endPercentage);
 
			    action.press(point(startPoint, anchor))
			            .waitAction(waitOptions(ofMillis(1000)))
			            .moveTo(point(endPoint, anchor))
			            .release().perform();
		} catch (NumberFormatException e) {
			
			e.printStackTrace();
		}
	        
	        
	}
}
