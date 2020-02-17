package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePageObject {
	WebDriver driver;
	
	public HomePageObject(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	public String getHomePageTitle() {
		return driver.getTitle();
	}
	
	public String getCurrentURL() {
		return driver.getCurrentUrl();
	}
	
}
