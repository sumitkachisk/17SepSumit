package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import Base.Testbase;

public class UtilityMethod extends Testbase {
	
	public static void SelectClass(WebElement ele , String Option)
	{
		Select s = new Select(ele);
		s.selectByVisibleText(Option);
	}
	
	public static void capturescreeshot(String name) throws Exception
	{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\DELL\\eclipse-workspace\\FrameworkMaven\\ScreenShots/"+ name +".jpg");
		FileHandler.copy(source, des);
	}

	
	
}
