package amazonshopping.pages.product;

import amazonshopping.pageobjects.product.KindleProductObjects;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;

public class KindleProductPage {
	private KindleProductObjects kindleProductObjects;
	
	public KindleProductPage(MobileDriver<MobileElement> driver)
	{
		kindleProductObjects = new KindleProductObjects(driver);
	}
	
	public boolean isKindleInStock()
	{
		return kindleProductObjects.isKindleInStock();
	}

	public boolean isKindleOutOfStock() {
		// TODO Auto-generated method stub
		return kindleProductObjects.isKindleOutOfStock();
	}

}
