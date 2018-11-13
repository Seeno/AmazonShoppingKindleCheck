package amazonshopping.pages.departments;

import amazonshopping.pageobjects.departments.ElectronicsDepartmentObjects;
import amazonshopping.pages.menu.MainMenuPage;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;

public class ElectronicsDepartmentPage {
	private ElectronicsDepartmentObjects elecDepartObjects;
	
	public ElectronicsDepartmentPage(MobileDriver<MobileElement> driver)
	{
		elecDepartObjects = new ElectronicsDepartmentObjects(driver);
	}
	
	public void tapOnKindle()
	{
		elecDepartObjects.tapKindle();
	}

}
