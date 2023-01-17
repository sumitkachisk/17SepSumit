package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Testbase;
import Pages.Cartpages;
import Pages.InventaryPage;
import Pages.LoginPage;

  
public class CartPageTest  extends Testbase{
	  LoginPage Login;
	   Cartpages Cart ;
	   InventaryPage Invent;
	   
	   
	@BeforeMethod (alwaysRun = true)
	public void Cartsetup() throws Exception
	{
		intilization();
		Login = new LoginPage();
		Invent = new InventaryPage();
		Cart = new Cartpages();
		
		Login.LogintoApp();
		Invent.AddProduct();
		
	}
	
	@Test (groups = "Regression", enabled =true)
	
	public void YouCartLabelTest()
	{
		boolean value = Cart.YouCartLabelVerify();
		Assert.assertEquals(value, true);
	}
	@Test (enabled =true)
	
	 public void Swaglogo1verifyTest()
	{
		  boolean value = Cart.Swaglogo1verify();
		  Assert.assertEquals(value, true);
	}
	
	@Test (enabled =true)
	
	public void FooterRobotTest() throws Exception
	{
		boolean value = Cart.FooterRobot();
		Assert.assertEquals(value, true);
	}
	
	
	@AfterMethod (alwaysRun = true)
	public void closedbrowser()
	{
		driver.close();
	}
	

}
