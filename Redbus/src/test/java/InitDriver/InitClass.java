package InitDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import PageObjects.HomePageObject;

public class InitClass {
	
	public WebDriver driver;
	public HomePageObject homepage;
	
	@BeforeClass
	public void BeforeClass() {
		System.out.println("Launch Webdriver");
		System.out.println("Done changes in file");
		ChromeOptions opt = new ChromeOptions(); 			
		opt.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver","src\\test\\resources\\chromedriver.exe");
		driver=new ChromeDriver(opt);
		homepage= new HomePageObject(driver);
		
	}
	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("Launching  url");
		driver.get("https://www.redbus.in/");
	}

}
