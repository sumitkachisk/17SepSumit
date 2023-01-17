package Utility;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData {
	
	public static String readProperty(String value) throws Exception
	{
		Properties Sk = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\FrameworkMaven\\TestData\\config.properties");
		Sk.load(file);
		return Sk.getProperty(value);
		
	}
	  public static String ReadExcel(int row , int col) throws Exception
	  {
		  
		FileInputStream file = new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\FrameworkMaven\\TestData\\FrameExcel.xlsx");
		Sheet excel = WorkbookFactory.create(file).getSheet("Sheet1");
		String value = excel.getRow(row).getCell(col).getStringCellValue();
		return value;
	}

}
