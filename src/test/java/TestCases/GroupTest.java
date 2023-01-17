package TestCases;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.testng.Assert;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Base.Testbase;
	import Pages.LoginPage;

	public class GroupTest extends Testbase {
		
		LoginPage Login;
		
		    
		
		@BeforeMethod (alwaysRun = true)
		public void setup() throws Exception
		{
			intilization();
			Login = new LoginPage();
		}
			
		

		@Test (groups = "Smoke", enabled = false)
		public void verifyTitleTest()
		{
			String ExpecTitle ="Swag Labs";
			String ActTitle  = Login.verifyTitle();
			Assert.assertEquals(ExpecTitle, ActTitle, "this case is fail");
			
		}
		@Test (groups = "Regression", enabled = false)
		public void ProductInventryTest() throws Exception
		{
			String Expect = "1Products";
			String Acttitle = Login.ProductInventry();
		}
			
			
			@Test (groups = "Sanity",enabled = false)
			public void UrlVerifytest()
			{
				String ExpecTitle1 ="https://www.saucedemo.com/";
				String ActTitle1  =Login.UrlVerify();
				Assert.assertEquals(ExpecTitle1, ActTitle1);
			}
				
				@Test (timeOut = 1000, enabled = false)
				public void  LoginLogoVerifyTest()
				{
					System.out.println("execution started");
					SoftAssert Soft = new SoftAssert();
				boolean result = Login.LoginLogoVerify();
				Soft.assertEquals(result, true);
				System.out.println("execution ended");
				//Soft.assertAll();
				
				}
				
				@Test (invocationCount = 2 , enabled = false)
				public void BotlogoTest()
				{
					boolean result1 = Login.Botlogo();
					Assert.assertEquals(result1, true);
					
				}
				
				@Test (groups = {"Smoke", "Regression"}, enabled = true)
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
					
				
				@AfterMethod  (alwaysRun = true)
		public void closeBrowser()
		{
		      driver.close();
		}

}
