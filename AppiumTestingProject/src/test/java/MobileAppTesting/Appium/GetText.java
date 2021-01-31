package actions.jselenium;

import java.util.HashMap;

import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

import actions.reports.Log;

public class GetText {
	public String run(HashMap<String, Object> params) {
		String text = null;
		WebElement element = Elements.find(params, Browser.Driver);
		int iTimeout = 20;
		while (iTimeout > 0)
			try {
				text = element.getText();
				Log.passed("Retrieved the text from the element : "+text);
				break;
			} catch (WebDriverException err) {
				iTimeout--;
				if (err.getMessage().contains(
						"Element is not clickable at point")) {
					if (iTimeout == 0) {
						throw err;
					}
				} else {
					throw err;
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					Log.failed(e.getMessage());
				}

			}
		return text;
	}
}
