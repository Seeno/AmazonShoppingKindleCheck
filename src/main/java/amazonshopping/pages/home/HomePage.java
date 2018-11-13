package amazonshopping.pages.home;

import amazonshopping.pageobjects.home.HomePageObjects;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;

public class HomePage {
	private HomePageObjects homePageObjects;
	
	public HomePage(MobileDriver<MobileElement> driver)
	{
		homePageObjects = new HomePageObjects(driver);
	}
	
	public void clickMenu()
	{
		homePageObjects.clickOnMenu();
	}

}
