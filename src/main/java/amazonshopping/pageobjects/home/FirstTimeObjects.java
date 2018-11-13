package amazonshopping.pageobjects.home;

import amazonshopping.base.BaseDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class FirstTimeObjects extends BaseDriver{

	public FirstTimeObjects(MobileDriver<MobileElement> driver) {
		super(driver);
	}

	// Already a customer button
	@AndroidFindBy(id = "com.amazon.mShop.android.shopping:id/sign_in_button")
	private MobileElement existingUser;

	// Hamburger menu button
	@AndroidFindBy(id = "com.amazon.mShop.android.shopping:id/new_user")
	private MobileElement newUser;

	// Hamburger menu button
	@AndroidFindBy(id = "com.amazon.mShop.android.shopping:id/skip_sign_in_button")
	private MobileElement skipSignIn;
	
	
	//Taps on the existing client button
	public void tapOnExisingUserSignIn()
	{
		clickElement(existingUser);
	}

	//Taps on the new client button
	public void tapOnNewUserSignIn()
	{
		clickElement(newUser);
	}
	
	//Taps on the skip sign in button
	public void tapOnSkipUserSignIn()
	{
		clickElement(skipSignIn);
	}

}
