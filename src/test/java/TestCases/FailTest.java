package TestCases;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.internal.annotations.ITest;

import Base.Testbase;
import Pages.LoginPage;
import Utility.UtilityMethod;

public class FailTest extends Testbase {
LoginPage Login;
	
	    
	
	@BeforeMethod (alwaysRun = true)
	public void setup() throws Exception
	{
		intilization();
		Login = new LoginPage();
	}
		
	

	@Test
	public void verifyTitleTest()
	{
		String ExpecTitle ="Swag Labs";
		String ActTitle  = Login.verifyTitle();
		Assert.assertEquals(ExpecTitle, ActTitle);
	}
	@Test  (enabled = false)
	public void ProductInventryTest() throws Exception
	{
		String Expect = "Products";
		String Acttitle = Login.ProductInventry();
	}
		
		
		@Test (groups = "Regression") 
		public void UrlVerifytest()
		{
			String ExpecTitle1 ="https://www.saucedemo.com/";
			String ActTitle1  =Login.UrlVerify();
			Assert.assertEquals(ExpecTitle1, ActTitle1);
		}
			
			@Test (enabled = false)
			public void  LoginLogoVerifyTest()
			{
			boolean result = Login.LoginLogoVerify();
			Assert.assertEquals(result, true);
			
			}
			
			@Test (enabled = false)
			public void BotlogoTest()
			{
				boolean result1 = Login.Botlogo();
				Assert.assertEquals(result1, true);
				
			}
			
			@Test (groups = "Regression") 
			public void LogintoAppTest() throws Exception 
			{
			   String Expected = "https://www.saucedemo.com/inventory.html";
				String Actual = Login.LogintoApp();
				Assert.assertEquals(Expected, Actual);
			}
			@Test (groups = "Regression") 
			public void ProductLabelTest() throws Exception
			{
				String Expected ="1PRODUCTS";
				String actual = Login.ProductInventry();
				Assert.assertEquals(Expected, actual);
			}
				
			
			@AfterMethod (alwaysRun = true)
	public void closeBrowser(ITestResult a) throws Exception
	{
				if(ITestResult.FAILURE== a.getStatus())
				UtilityMethod.capturescreeshot(a.getName());
				
				
				
				
	      driver.close();
	}
	

}


