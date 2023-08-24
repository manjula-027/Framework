package testScripts;

import java.util.Map;

import dev.failsafe.internal.util.Assert;
import genericLibraries.BaseClass;

public class RegisterShopperStack extends BaseClass {
	 
		
		public void creatAccountTest()  {
			welcome.clickloginButton();
			login.clickreateAccountButton();
				
				Map<String,String>map=excel.getData("sheet1", "Shopper Registration");
				int randomNum=jutil.generateRandomNum(100);
				String email=randomNum+map.get("Email Address");
				String pwd=map.get("password")+randomNum;
				
				
				signUp.createUserAccount(map.get("First Name"),map.get("LastName"),map.get("Gender"),map.get("Phone Number"),email,pwd);
				
				Thread.sleep(2000);
				welcome.clickloginButton();
				login.loginToApp(email, pwd);
				
				Thread.sleep(2000);
				Assert.assertTrue(driver.getTitle().contains("Home"));
				
						
				
			}
		}
		

	}


}
