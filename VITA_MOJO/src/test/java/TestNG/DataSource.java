package TestNG;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

import Utility.ExcelUtility;
import Utility.ReadWriteProperties;

public class DataSource {
		
	@DataProvider (name = "data-provider")
    public Object[][] dpMethod(Method m) throws FileNotFoundException, IOException, Exception{
		ReadWriteProperties rwprop = new ReadWriteProperties();
		//Object[][] tabArray = ExcelUtility.getTableArray(System.getProperty ("user.dir") + rwprop.getProperties("DataSheetPath"), rwprop.getProperties("SheetName"));
		Object[][] tabArray = null;
		
		switch (m.getName()) {
		case "SignUpTest": 
			System.out.println("Test Data Reading for SignUpTest");
			tabArray = ExcelUtility.getTableArray(System.getProperty ("user.dir") + rwprop.getProperties("DataSheetPath"), rwprop.getProperties("SheetName"),1,"SignUpTest");
			return tabArray;
		case "SignInTest": 
			System.out.println("Test Data Reading for SignInTest");
			tabArray = ExcelUtility.getTableArray(System.getProperty ("user.dir") + rwprop.getProperties("DataSheetPath"), rwprop.getProperties("SheetName"),1,"SignInTest");
			return tabArray;
		default : 
			return tabArray;
		}
		
		
    } 

}
