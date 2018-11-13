package amazonshopping.pageobjects.menu;

import amazonshopping.base.BaseDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MainMenuObjects extends BaseDriver {

	public MainMenuObjects(MobileDriver<MobileElement> driver) {
		super(driver);
	}

	// Home button
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Home']")
	private MobileElement home;

	// Department button
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Shop by Department']")
	private MobileElement department;

	// Programs and features button
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Programs and Features']")
	private MobileElement progAndFea;

	// Deals button
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Today's Deals']")
	private MobileElement deals;

	// Orders button
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Your Orders']")
	private MobileElement yourOrders;

	// Wish list button
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Your Wish List']")
	private MobileElement wishList;

	// Account button
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Your Account']")
	private MobileElement yourAccount;

	// Gift cards button
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Gift Cards']")
	private MobileElement giftCards;

	// Prime button
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Try Prime']")
	private MobileElement tryPrime;

	// Promo button
	@AndroidFindBy(id = "com.amazon.mShop.android.shopping:id/drawer_item_promo")
	private MobileElement promo;

	// Notifications button
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Your Notifications']")
	private MobileElement notify;

	// Settings button
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Settings']")
	private MobileElement settings;

	// Settings button
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Customer Service']")
	private MobileElement customerService;

	// Taps on the home menu button
	public void tapOnHome() {
		clickElement(home);
	}

	// Taps on the department menu button
	public void tapOnDepartment() {
		clickElement(department);
	}

	// Taps on the programs and features menu button
	public void tapOnProgAndFea() {
		clickElement(progAndFea);
	}

	// Taps on the daily deals menu button
	public void tapOnDeals() {
		clickElement(deals);
	}

	// Taps on the orders menu button
	public void tapOnYourOrders() {
		clickElement(yourOrders);
	}

	// Taps on the wish list menu button
	public void tapOnWishList() {
		clickElement(home);
	}

	// Taps on the your account menu button
	public void tapOnYourAccount() {
		clickElement(yourAccount);
	}

	// Taps on the gift cards menu button
	public void tapOnGiftCards() {
		clickElement(giftCards);
	}

	// Taps on the try prime menu button
	public void tapOnTryPrime() {
		clickElement(tryPrime);
	}

	// Taps on the promo menu button
	public void tapOnPromo() {
		clickElement(promo);
	}

	// Taps on the notify menu button
	public void tapOnNotify() {
		clickElement(notify);
	}

	// Taps on the settings menu button
	public void tapOnSettings() {
		clickElement(settings);
	}
	
	// Taps on the customer service menu button
	public void tapOnCustomerService() {
		clickElement(customerService);
	}

}
