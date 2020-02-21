package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import InitDriver.InitClass;

public class Homepagetest extends InitClass {
	
	@Test
	public void CheckTitle() {
		System.out.println("Title of page is "+homepage.getHomePageTitle());
		Assert.assertEquals(homepage.getHomePageTitle(),"Book Bus Travels, AC Volvo Bus, Hotels & Bus Hire - redBus");
	}
	
	@Test
	public void GetCurrentUrl() {
		System.out.println("Verify url of page");
		Assert.assertEquals(homepage.getCurrentURL(),"https://www.redbus.in/");
	}
	
	@Test
	public void BookTicket() {
		homepage.enterinFromField();
		
	}
	

}
