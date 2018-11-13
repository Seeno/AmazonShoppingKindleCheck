package amazonshopping.pages.home;

import amazonshopping.pageobjects.home.FirstTimeObjects;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;

public class FirstTimePage {
	private FirstTimeObjects firstTimeObjects;
	
	public FirstTimePage(MobileDriver<MobileElement> driver)
	{
		firstTimeObjects = new FirstTimeObjects(driver);
	}
	
	public void skipSignIn()
	{
		firstTimeObjects.tapOnSkipUserSignIn();
	}

}
