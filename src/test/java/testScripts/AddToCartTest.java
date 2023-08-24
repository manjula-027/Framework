package testScripts;

import java.util.Map;

import org.testng.Assert;

import genericLibraries.BaseClass;

public class AddToCartTest extends BaseClass {
	
	public void addToCartTest() throws InterruptedException {
		Map<String, String>map=excel.getData("sheet1", "Add to cart");
		welcome.clickloginButton();
		login.loginToApp(map.get("Email"), map.get("password"));
		Thread.sleep(2000);
		home.mouseHoverElectronic(webUtil);
		Thread.sleep(2000);
		home.clickHeadPhoneLink();
		headPhone.clickAddToCart();
		Thread.sleep(2000);
		Assert.assertEquals(headPhone.getAddToCartText(), "ADDED");
		String itemName=headPhone.getItemName();
		headPhone.clickCartIcon();
		Assert.assertTrue(cart.getcartitem().equalsIgnoreCase(itemName));
	}
	
	

}
