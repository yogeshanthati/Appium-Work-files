
package actions.jselenium;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import actions.jselenium.Elements;
import actions.reports.Log;


public class SelectFromSearchBar {

	public void run(HashMap<String, Object> params) {

		WebElement element = Elements.find(params, Browser.Driver);
		
		try {
			if(params.get("selectText") != null && params.get("searchText") != null	 ) {
				
				String searchText=params.get("searchText").toString();
				
				element.sendKeys(searchText);
				
				Thread.sleep(2000);
				
				String selectValue=params.get("selectText").toString();
				
				String selectText = '\'' + selectValue + '\'';
				
			List<WebElement> we = Browser.Driver.findElements(By.xpath("//*[text()="+selectText+"]"));
			
			if(we.size()>0) {
				
				we.get(0).click();
				Log.passed("Clicked on the select text  successfully");
				
			}
			else {
				Log.failed("Unable Clicked on the select text  (Element is not displayed), Expected text of element is->"+selectText);
			}
			
			}
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
}
