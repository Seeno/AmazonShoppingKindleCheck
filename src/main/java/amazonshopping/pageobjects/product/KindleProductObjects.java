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
	
	//Amazon logo on top
	@AndroidFindBy(id="com.amazon.mShop.android.shopping:id/action_bar_home_logo")
	private MobileElement amazonLogo;

	// Identifier to see if item is in stock using Add to Cart button. 
	@AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(resourceId(\"add-to-cart-button\"));")
	private MobileElement inStockAddToCart;

	// Identifier to see if item is not in stock
	@AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"We don't know when or if this item will be back in stock.\"));")
	private MobileElement outOfStockText;

	//Checks to see if there is a add to cart button
	public boolean isKindleInStock() {
			try
			{
				//found the add to cart button so it is in stock
			return inStockAddToCart.isDisplayed();
			}
			catch(Exception e)
			{
				//did not find the add to cart button so it is not in stock
				return false;
			}
	}
	
	public boolean isKindleOutOfStock() {
		try
		{
			//found the text to signify that it is out of stock
			return outOfStockText.isDisplayed();
		}
		catch(Exception e)
		{
			//did not find the text to signify it is out of stock. 
			return false;
		}
	}
	
	//Taps amazon logo
	public void tapLogo()
	{
		clickElement(amazonLogo);
	}


}
