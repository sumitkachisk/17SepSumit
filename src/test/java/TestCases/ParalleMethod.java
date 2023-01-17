package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParalleMethod {
	
	@Test
	public void test()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googinhydr1-21&ref=pd_sl_98xjxt98l7_b&adgrpid=60639568242&hvpone=&hvptwo=&hvadid=617721280315&hvpos=&hvnetw=g&hvrand=5845323740018367820&hvqmt=b&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062106&hvtargid=kwd-299123108802&hydadcr=5841_2362028&gclid=Cj0KCQiAzeSdBhC4ARIsACj36uH-zmPed5qTKoj_cOXNB_zf8DTef3Zsw-S9w9qpJkpSmolndndUPKkaAloQEALw_wcB");
		driver.manage().window().maximize();
		driver.close();
	}

	@Test
	public void test2()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.close();
	}
	@Test
	public void test3()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.close();
	}
	@Test
	public void test4()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/channel/UCXAztXzLrwJs1_Gi9hDtQkA/videos");
		driver.manage().window().maximize();
		driver.close();
	}
}




