package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObject {
	WebDriver driver;
	
	public HomePageObject(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath = "//a[text()='Help']")
	public WebElement helpLink;
	
	@FindBy(id = "src")
	public WebElement fromTextbox;
	
	@FindBy(css = "input#dest")
	public WebElement toTextbox;
	
	public String getHomePageTitle() {
		return driver.getTitle();
	}
	
	public String getCurrentURL() {
		return driver.getCurrentUrl();
	}
	
	public void enterinFromField() {
		fromTextbox.sendKeys("Kashmiri Gate");
	}
	
}
