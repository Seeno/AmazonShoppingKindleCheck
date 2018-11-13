package amazonshopping.pages.menu;

import amazonshopping.pageobjects.menu.MainMenuObjects;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;

public class MainMenuPage {

	private MainMenuObjects mainMenuObjects;
	private MainMenuPage mainMenuPage;

	public MainMenuPage(MobileDriver<MobileElement> driver) {
		mainMenuObjects = new MainMenuObjects(driver);
	}

	// Taps on home
	public void tapHome() {
		mainMenuObjects.tapOnHome();
	}

	// Taps on department
	public void tapDeparment() {
		mainMenuObjects.tapOnDepartment();
	}

	// Taps on programs and features
	public void tapProgAndFea() {
		mainMenuObjects.tapOnProgAndFea();
	}

	// Taps on Daily Deals
	public void tapDeals() {
		mainMenuObjects.tapOnDeals();
	}

	// Taps on your orders
	public void tapYourOrders() {
		mainMenuObjects.tapOnYourOrders();
	}

	// Taps on wish list
	public void tapWishList() {
		mainMenuObjects.tapOnHome();
	}

	// Taps on your account
	public void tapYourAccount() {
		mainMenuObjects.tapOnYourAccount();
	}

	// Taps on gift cards
	public void tapGiftCards() {
		mainMenuObjects.tapOnGiftCards();
	}

	// Taps on try prime
	public void tapTryPrime() {
		mainMenuObjects.tapOnTryPrime();
	}

	// Taps on promo
	public void tapPromo() {
		mainMenuObjects.tapOnPromo();
	}

	// Taps on notifications
	public void tapNotify() {
		mainMenuObjects.tapOnNotify();
	}

	// Taps on settings
	public void tapSettings() {
		mainMenuObjects.tapOnSettings();
	}

	// Taps on customer service
	public void tapCustomerService() {
		mainMenuObjects.tapOnCustomerService();
	}
	
}
