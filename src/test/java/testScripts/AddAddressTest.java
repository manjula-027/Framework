package testScripts;

import java.util.Map;

import org.testng.Assert;

import genericLibraries.BaseClass;

public class AddAddressTest  extends BaseClass{
	
	public void addAddressTest() throws InterruptedException {
		Map<String, String> map=excel.getData("sheet1", "Add AAddress");
		welcome.clickloginButton();
		login.loginToApp(map.get("Email"), map.get("password"));
		Thread.sleep(2000);
		home.clickProfileButton();
		Thread.sleep(2000);
		home.selectMyProfile();
		Thread.sleep(2000);
		myProfile.clickMyAddresses();
		myAddress.clickAddress();
		address.addaddressDetails(webUtil, map);
		Thread.sleep(2000);
		Assert.assertEquals(myAddress.getSuccessMessage(), "successfully added");
		Thread.sleep(2000);
	}
	

}
