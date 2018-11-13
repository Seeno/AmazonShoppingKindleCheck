package amazonshopping.pageobjects.product;

import static io.appium.java_client.touch.offset.ElementOption.element;

import java.time.Duration;

import org.openqa.selenium.Dimension;

import amazonshopping.base.BaseDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class KindleProductObjects extends BaseDriver {

	TouchAction action;


	public KindleProductObjects(MobileDriver<MobileElement> driver) {
		super(driver);
		action = new TouchAction(driver);
	}

	// Identifier to see if item is in stock
	@AndroidFindBy(id="title")
	private MobileElement title;
	
	// Identifier to see if item is in stock
	@AndroidFindBy(id="com.amazon.mShop.android.shopping:id/action_bar_home_logo")
	private MobileElement amazonLogo;
	
	// Identifier to see if item is in stock
	@AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"In Stock.\"));")
	private MobileElement inStockText;

	// Identifier to see if item is not in stock
	@AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"We don't know when or if this item will be back in stock.\"));")
	private MobileElement outOfStockText;


	public boolean isKindleInStock() {
		try {
			return inStockText.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean isKindleOutOfStock() {
		try {
			return outOfStockText.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}


}
