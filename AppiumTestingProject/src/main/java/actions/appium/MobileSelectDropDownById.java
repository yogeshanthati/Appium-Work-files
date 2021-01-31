package actions.appium;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class MobileSelectDropDownById {
	public void run(HashMap<String, String> params) {
		try {
			
			MobileElement DropdownElement = Elements.find(params, Driver.driver);
			
			String DropdownelementId=params.get("DropDownelementID");
			String elementText=params.get("elementText");

			DropdownElement.click();
		       
	        List options=(Driver.driver).findElementsById(DropdownelementId);
	       
	        System.out.println("Total number of options available in dropdown:"+options.size());
	       
	       
	       
	        for(MobileElement e:options)
	        {
	            String val=e.getText();
	           
	            if(val.equalsIgnoreCase(elementText))
	            {
	                e.click();
	                break;
	            }
	        }

		} catch (Exception e) {

			e.printStackTrace();

		}
	}


	
	
}
