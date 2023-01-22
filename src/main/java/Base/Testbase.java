package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.ReadData;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Testbase {
	
	public static WebDriver driver;    //global declare
	
	public void intilization() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(ReadData.readProperty("Url"));
		//driver.get("https://www.saucedemo.com/");
		Thread.sleep(1000);
	}

}

////HEllo Sumit

                                    //MY Name is sumit

    //123

