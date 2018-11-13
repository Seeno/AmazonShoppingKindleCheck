package amazonshopping.pageobjects.menu;

import amazonshopping.base.BaseDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class DepartmentMenuObjects extends BaseDriver {
	
	public DepartmentMenuObjects(MobileDriver<MobileElement> driver) {
		super(driver);
	}

	//Go back button
	@AndroidFindBy(id="com.amazon.mShop.android.shopping:id/gno_go_back_button")
	private MobileElement back;
	
	//Electronics option
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Electronics']")
	private MobileElement electronics;
	
	//Tap on electronics option
	public void tapElectronics()
	{
		clickElement(electronics);
	}
	

}
