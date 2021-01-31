package MobileAppTesting.Appium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SelectFromSearchBar1 {

	WebDriver driver;

	@BeforeTest

	public void setUp() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogesh\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// driver.get("https://www.google.com/");

		driver.get("http://practice.automationtesting.in/");
		Thread.sleep(2000);
	}

	@Test(enabled = false)
	public void SelectElementFromSearchBar() throws InterruptedException {

		String selectVal = "Yogesh";

		String selectValue = '\'' + selectVal + '\'';
		
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("yogesh");
		Thread.sleep(3000);
		List<WebElement> we = driver.findElements(By.xpath("//*[text()=" + selectValue + "]"));

		if (we.size() > 0) {
			we.get(0).click();
		}

	}

	@Test()
	public void ClikAndVerifyLinkText() throws InterruptedException {

		
		String linkTxt = "My Account";

		String linkText = '\'' + linkTxt + '\'';

		List<WebElement> we = driver.findElements(By.xpath("//*[text()=" + linkText + "]"));

		try {
			if (we.size() > 0) {
				if (we.get(0).isEnabled()) {
					we.get(0).click();
				} else {
					System.out.println("element  is not clickable");
				}
			} else {
				System.out.println("There is no element exist");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		String ExpectedLinkText="My Account";
		
		WebElement we =driver.findElement(By.xpath(""));
		
		String ActualLinkText=we.getText();
		
		we.click();
		
		if(ExpectedLinkText.equals(ActualLinkText)) {
			
		}
		else {
			
		}
		
		
	}

	@AfterTest

	public void tearDown() {

		driver.close();
	}

}
