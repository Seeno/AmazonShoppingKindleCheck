package amazonshopping.checkkindle;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

import java.net.MalformedURLException;

import amazonshopping.base.BaseDriver;
import amazonshopping.pages.departments.ElectronicsDepartmentPage;
import amazonshopping.pages.home.FirstTimePage;
import amazonshopping.pages.home.HomePage;
import amazonshopping.pages.menu.DepartmentMenuPage;
import amazonshopping.pages.menu.MainMenuPage;
import amazonshopping.pages.product.KindleProductPage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;

/**
 * Unit test for simple App.
 */
public class AppTest
{
	private MobileDriver<MobileElement> driver;
	private FirstTimePage firstTimePage;
	private HomePage homePage;
//	private MainMenuPage mainMenuPage;
	private DepartmentMenuPage departmentMenuPage;
	private ElectronicsDepartmentPage elecDepartPage;
	private KindleProductPage kindleProductPage;
	
	@BeforeMethod
	public void beforeTest() throws MalformedURLException
	{
		driver = BaseDriver.capabilities();
		firstTimePage = new FirstTimePage(driver);
		homePage = new HomePage(driver);
//		mainMenuPage = new MainMenuPage(driver);
		departmentMenuPage = new DepartmentMenuPage(driver);
		elecDepartPage = new ElectronicsDepartmentPage(driver);
		kindleProductPage = new KindleProductPage(driver);

	}
	
	/*
	 * Description: Checks to see if the kindle is in stock. 
	 * Requirement: "In Stock." text is displayed
	 */
	@Test
    public void checkIfKindleInStock() throws MalformedURLException
    {
    	firstTimePage.skipSignIn();
    	homePage.clickMenu();
    	departmentMenuPage.goToElectronicsDepartment();
    	elecDepartPage.tapOnKindle();
    	if (!kindleProductPage.isKindleInStock())
    	{
    		fail("Kindle is not in stock");
    	}
    }
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
}
