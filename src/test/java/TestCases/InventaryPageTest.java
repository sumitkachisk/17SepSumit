package TestCases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Testbase;
import Pages.InventaryPage;
import Pages.LoginPage;

public class InventaryPageTest extends  Testbase {
	 LoginPage Login;
	 InventaryPage Invent;
	
	@BeforeMethod (alwaysRun = true)
	public void setup() throws Exception
	{
	intilization();
	Login = new LoginPage();
	 Invent = new InventaryPage();
	 
	Login.LogintoApp();
	}
	
	@Test (groups = {"Sanity", "Regression"})
public void	PeeklogoTest()
{
		boolean value = Invent.PeeklogoVerify();
		Assert.assertEquals(value, true);
		Reporter.log("Peek logo =" + value);
}
	@Test (invocationCount = 3  ,  groups = {"Sanity", "Regression"})
	public void SwagLabsVerifyTest()
	{
		 boolean value = Invent.SwagLabsVerify();
		 Assert.assertEquals(value, false);
		 Reporter.log("swaglabs =" + value);
	}
	@Test(groups = "Regression")
	
		public void ProductContainerCard() throws Exception
		{
		String value = Invent.AddProduct();
		Assert.assertEquals("4", value);
		Reporter.log("Product="+ value);
	}
	
	
	
	@AfterMethod (alwaysRun = true)
	public void closedBrowser()
	{
		driver.close();
	
}

}
