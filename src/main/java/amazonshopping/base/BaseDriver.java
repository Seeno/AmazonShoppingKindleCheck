package amazonshopping.base;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class BaseDriver {
	private WebDriverWait wait;
	static Dimension screenSize;
	static int startY;
	static int endY;
	static int startX;

	// Initialize the driver in a page object model
	public BaseDriver(MobileDriver<MobileElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		wait = new WebDriverWait(driver, 30);
	}

	//Grabs the APK from src folder and installs amazon shopping app if it is not installed
	public static MobileDriver<MobileElement> capabilities() throws MalformedURLException {
		File appDir = new File("src");
		File app = new File(appDir, "AmazonShopping.apk");
		DesiredCapabilities cap = new DesiredCapabilities();
		MobileDriver<MobileElement> driver;
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Name");
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.amazon.mShop.android.shopping");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.amazon.mShop.home.HomeActivity");
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		screenSize = driver.manage().window().getSize();
		return driver;
	}

	// click on the element specified
	public void clickElement(MobileElement element) {
		waitForElement(element).click();
	}

	// wait for the element to appear
	public MobileElement waitForElement(MobileElement element) {
		return waitForElement(element, wait);
	}

	// Returns the screen size.
	public Dimension getDeviceSize() {
		return screenSize;
	}

	// Return the Y co-ordinate at the position of 75% of the screen height
	public int getStartY() {
		startY = (int) (screenSize.height * 0.75);
		return startY;
	}

	// Return the Y co-ordinate at the position of 20% of the screen height
	public int getEndY() {
		endY = (int) (screenSize.height * 0.20);
		return endY;
	}

	// Return the X co-ordinate at the position of 1/2 of the screen width
	public int getStartX() {
		startX = screenSize.width / 2;
		return startX;
	}

	// An extension of waitForElement. Gives a timeout of 30 seconds.
	// Returns the element when the element is found to be clickable
	private MobileElement waitForElement(MobileElement element, WebDriverWait wait) {
		waitForElementToBeClickable(element, wait);
		return element;
	}

	// Waits for the element to become clickable
	private void waitForElementToBeClickable(MobileElement element, WebDriverWait wait) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

}
