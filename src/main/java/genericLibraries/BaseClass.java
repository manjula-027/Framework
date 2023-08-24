package genericLibraries;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pompages.AddressformPage;
import pompages.HomePage;
import pompages.MyAddressPage;
import pompages.MyProfilePage;
import pompages.Shopperloginpage;
import pompages.SignUpPage;
import pompages.cartpage;
import pompages.headPhonesPage;
import pompages.welcomepage;

public class BaseClass {
	
	protected PropertiesUtility property;
	protected ExcelUtility excel;
	protected JavaUtility jutil;
	protected webdriverUtility webUtil;
	public WebDriver driver;
	public static WebDriver sdriver;
	
	protected welcomepage welcome;
	protected Shopperloginpage login;
	protected HomePage home;
	protected SignUpPage signUp;
	protected MyProfilePage myProfile;
	protected MyAddressPage myAddress;
	protected headPhonesPage headPhone;
	protected cartpage cart;
	protected AddressformPage address;
	
	//@BeforeSuite
	//@BeforeTest
	
	@BeforeClass
	public void classConfiguration() {
		property=new PropertiesUtility();
		excel=new ExcelUtility();
		jutil=new JavaUtility();
		webUtil=new webdriverUtility();
		
		property.propertiesInit(IConstantPath.PROPERRTIES_PATH);
		excel.excelInt(IConstantPath.EXCEL_PATH);
	}
	
	@BeforeMethod
	public void methodconfiguration() {
		driver=webUtil.navigateToApp(property.getData("browser"), property.getData("url"), Long.parseLong(proprty.getData("time")));
		sdriver=driver;
		
		welcome=new welcomepage(driver);
		login=new Shopperloginpage(driver);
		home=new HomePage(driver);
		signUp=new SignUpPage(driver);
		myProfile=new MyProfilePage(driver) ;
		myAddress=new MyAddressPage(driver);
		headPhone=new headPhonesPage(driver);
		cart=new cartpage(driver);
		address=new AddressformPage(driver);
		
	}
	@AfterMethod
	public void methodTeardown() {
		home.clickProfileButton();
		 home.clickLogout();
		webUtil.closeAlbrowsers();
	}
	@AfterClass
	public voi

}
