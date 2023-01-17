package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Testbase;
import Utility.ReadData;


public class LoginPage extends Testbase {
	
	@FindBy(xpath="//div[@Class='login_logo']") private WebElement LoginLogo;
	@FindBy(xpath="//div[@Class='bot_column']") private WebElement Botlogo;
	@FindBy(xpath= "//input[@name='user-name']") private WebElement Username;
	@FindBy(xpath = "//input[@name='password']") private WebElement Password;
	@FindBy(xpath = "//input[@name='login-button']") private WebElement LoginButton;
	@FindBy(xpath ="//span[@Class='title']") private WebElement ProductLabel;
	
	
	
	
	public LoginPage()
	{
	PageFactory.initElements(driver, this);	  //this keyword current classs object
	
	}
	
	public String verifyTitle()
	{
		return driver.getTitle();
	}
		
	
	public String UrlVerify()
	{
		return driver.getCurrentUrl();
	}
	
	public boolean LoginLogoVerify()
	{
		return LoginLogo.isDisplayed();
	}
	
	public boolean Botlogo()
	{
		return Botlogo.isDisplayed();
	}
	

	
	public String LogintoApp() throws Exception 
	{
		 Username.sendKeys(ReadData.readProperty("Username"));
		 Password.sendKeys(ReadData.readProperty("Password"));
		//Username.sendKeys(ReadData.ReadExcel(0, 0));     //readexcell method
		//Password.sendKeys(ReadData.ReadExcel(1, 0));        //readexcell method
		 LoginButton.click();
		 Thread.sleep(5000);
		  return driver.getCurrentUrl();
	}
	public String ProductInventry() throws Exception
	{
		LogintoApp();
		return ProductLabel.getText();
	
	}
	
	
	
	}
	
	
	
	
		
	
		
	
		
		
		
	
		
		
	
	


