package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Testbase;
import Pages.LoginPage;

public class LoginPageTest extends Testbase {
	
	LoginPage Login;
	
	    
	
	@BeforeMethod (alwaysRun = true)
	public void setup() throws Exception
	{
		intilization();
		Login = new LoginPage();
	}
		
	

	@Test ( enabled = false, groups = "Regression",   priority = 2)
	public void verifyTitleTest()
	{
		String ExpecTitle ="Swag Labs";
		String ActTitle  = Login.verifyTitle();
		Assert.assertEquals(ExpecTitle, ActTitle);
	}
	@Test (enabled = false, priority = 3)
	public void ProductInventryTest() throws Exception
	{
		String Expect = "Products";
		String Acttitle = Login.ProductInventry();
	}
		
		
		@Test (enabled = false , groups = "Smoke",    priority = 1)
		public void UrlVerifytest()
		{
			String ExpecTitle1 ="https://www.saucedemo.com/";
			String ActTitle1  =Login.UrlVerify();
			Assert.assertEquals(ExpecTitle1, ActTitle1);
		}
			
			@Test ( enabled = false,  priority = 0)
			public void  LoginLogoVerifyTest()
			{
			boolean result = Login.LoginLogoVerify();
			Assert.assertEquals(result, true);
			
			}
			
			@Test (enabled = false,  priority = -1)
			public void BotlogoTest()
			{
				boolean result1 = Login.Botlogo();
				Assert.assertEquals(result1, true);
				
			}
			
			@Test (enabled = false, priority = 5)
			public void LogintoAppTest() throws Exception 
			{
			   String Expected = "https://www.saucedemo.com/inventory.html";
				String Actual = Login.LogintoApp();
				Assert.assertEquals(Expected, Actual);
			}
			@Test(enabled = true)
			public void ProductLabelTest() throws Exception
			{
				String Expected ="PRODUCTS";
				String actual = Login.ProductInventry();
				Assert.assertEquals(Expected, actual);
			}
				
			
			@AfterMethod (alwaysRun = true)
	public void closeBrowser()
	{
	      driver.close();
	}
	

}
