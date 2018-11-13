package amazonshopping.pageobjects.home;

import amazonshopping.base.BaseDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomePageObjects extends BaseDriver{
	public HomePageObjects(MobileDriver<MobileElement> driver)
	{
		super(driver);
	}
	
	//Hamburger menu button
	@AndroidFindBy(id="com.amazon.mShop.android.shopping:id/action_bar_burger_icon")
	private MobileElement menuButton;
	
	//Shopping cart
	@AndroidFindBy(id="com.amazon.mShop.android.shopping:id/action_bar_cart_image")
	private MobileElement shoppingCart;
	
	//Search bar
	@AndroidFindBy(id="com.amazon.mShop.android.shopping:id/rs_search_src_text")
	private MobileElement searchBar;
	
	//Scan 
	@AndroidFindBy(id="com.amazon.mShop.android.shopping:id/search_right_cam_img")
	private MobileElement scanIt;
	
	//Advertisement bar
	@AndroidFindBy(id="ape_gateway_atf_AndroidmShopGateway_wrapper")
	private MobileElement advert;
	
	//Sign in button
	@AndroidFindBy(id="gwm-SignIn-button")
	private MobileElement signIn;
	
	//Create an account
	@AndroidFindBy(id="gw-sign-in-secondary")
	private MobileElement createAccount;
	
	//Clicks on the menu button
	public void clickOnMenu()
	{
		clickElement(menuButton);
	}
	
	
}
