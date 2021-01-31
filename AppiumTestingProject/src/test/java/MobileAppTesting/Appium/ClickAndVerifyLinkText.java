package actions.jselenium;

import java.util.HashMap;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import actions.jselenium.Elements;
import actions.reports.Log;

public class ClickAndVerifyLinkText {

	public void run(HashMap<String, Object> params) {

		WebElement element = Elements.find(params, Browser.Driver);
		
		try {
			
			String ExpectedLinkText=params.get("linkText").toString();
			
			if(isElementPresent(element) ) {
				
				String ActualLinkText=element.getText();
				
				element.click();
				
				Thread.sleep(2000);
				
				if(ExpectedLinkText.equals(ActualLinkText)) {
					
					Log.passed("Clicked on the expected link  successfully");
					
				}
				else {
					Log.failed("Unable Clicked on the expected  link   (Element is not displayed), Expected text of element is->"+ExpectedLinkText);
				}
				
				
			}
			else {
				
				Log.failed("Element is not displayed");
					
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		
			
		
		
		
	}
		
		public boolean isElementPresent(WebElement we) {
			try {
				Thread.sleep(1000);
				we.isDisplayed();
				return true;
			}catch(Exception ex){
				
				return false;
			}	
		}

}
