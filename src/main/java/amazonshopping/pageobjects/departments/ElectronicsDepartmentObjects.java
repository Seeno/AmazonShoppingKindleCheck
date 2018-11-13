package amazonshopping.pageobjects.departments;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.touch.TouchActions;

import amazonshopping.base.BaseDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

import static io.appium.java_client.touch.offset.ElementOption.element;

public class ElectronicsDepartmentObjects extends BaseDriver {

	TouchAction action;


	public ElectronicsDepartmentObjects(MobileDriver<MobileElement> driver) {
		super(driver);
		action = new TouchAction(driver);

	}

	@AndroidFindBy(xpath="//android.view.View[@text='Kindle']")
	private MobileElement kindleOption;


	@AndroidFindBy(xpath = "//android.view.View[@text='Electronics and Accessories']")
	private MobileElement departmentHeader;

	@AndroidFindBy(xpath = "//android.view.View[@text='Deals']")
	private MobileElement deals;

	
	/* For some reason on the department page, all views are visible even through they are not shown on the screen. 
	 * I had to make a workaround for this issue. 
	 * I noticed that the kindle co-ordinates was at maximum screen size and never changed until the kindle was viewable on the device.
	 * When the kindle was present on the screen, that's when the kindle co-ordinates changed.
	 * Based on this information, the device would have to scroll until the kindle y co-ordinates changed slightly.
	 */
	public void tapKindle()
	{
		waitForElement(kindleOption);
		int kindleThreshold = getDeviceSize().getHeight() - 20;
		
	    LongPressOptions longPressOptions = new LongPressOptions();
		PointOption start = new PointOption();
		PointOption end = new PointOption();
		start.withCoordinates(getStartX(), getStartY());
		end.withCoordinates(getStartX(), getEndY());
	    longPressOptions.withDuration(Duration.ofSeconds(0)).withPosition(start);
		
	    System.out.println("Before Move: " + kindleOption.getLocation().getY());

		while (kindleOption.getLocation().getY() > kindleThreshold)
		{
			action.longPress(longPressOptions).moveTo(end).release().perform();
			System.out.println("During Move: " + kindleOption.getLocation().getY());
//			action.press(start).moveTo(end).release().perform(); 

		}
		System.out.println("After Move: " + kindleOption.getLocation().getY());
		clickElement(kindleOption);
	}

}
