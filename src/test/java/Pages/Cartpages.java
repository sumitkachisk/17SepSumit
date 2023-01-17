package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Base.Testbase;

public class Cartpages  extends Testbase {
	
	
	@FindBy(xpath = "//a[@Class='shopping_cart_link']") private WebElement ShoppingCartlink;
	@FindBy(xpath = "//Span[@Class='title']") private WebElement YouCartLabel;  //
	@FindBy(xpath="//div[@Class='app_logo']") private WebElement Swaglogo1;  //
	//@FindBy (xpath = "//button[@name='checkout']") private WebElement Checkoutbutton1;   
	@FindBy(xpath = "//button[@name='continue-shopping']") private WebElement continueshoping;
	@FindBy(xpath = "//img[@Class='footer_robot']") private WebElement FooterRobot;  //
	
	public Cartpages()
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean YouCartLabelVerify()
	{
		return YouCartLabel.isDisplayed();
	}
	
	public boolean Swaglogo1verify()
	{
		return Swaglogo1.isDisplayed();
	}
	public boolean FooterRobot() throws Exception
	{
		Thread.sleep(5000);
		return FooterRobot.isDisplayed();
		
	}

	
//	public String ShoppingCartlinkVerify() throws Exception
//	{
//		ShoppingCartlink.click();
//		Thread.sleep(15000);
//		Checkoutbutton1.click();
//		Thread.sleep(1000);
//		return driver.getTitle();
//		
	}
	
	


