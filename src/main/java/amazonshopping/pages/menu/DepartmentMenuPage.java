package amazonshopping.pages.menu;

import amazonshopping.pageobjects.menu.DepartmentMenuObjects;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;

public class DepartmentMenuPage {
	
	private DepartmentMenuObjects departmentMenuObjects;
	private MainMenuPage mainMenuPage;
	
	public DepartmentMenuPage(MobileDriver<MobileElement> driver)
	{
		mainMenuPage = new MainMenuPage(driver);
		departmentMenuObjects = new DepartmentMenuObjects(driver);
		
	}

	public void goToElectronicsDepartment()
	{
		mainMenuPage.tapDeparment();
		departmentMenuObjects.tapElectronics();
	}
}
