package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	
	private static XSSFSheet ExcelWSheet;
	private static XSSFWorkbook ExcelWBook;
	private static XSSFCell Cell;
	private static XSSFRow Row;

	public static Object[][] getTableArray(String FilePath, String SheetName,int nFilteredColNo,String sDataToBeFilterBy) throws IOException
	{
		String[][] tabArray = null;
		
		FileInputStream ExcelFile = new FileInputStream(FilePath);
		// Access the required test data sheet
		ExcelWBook = new XSSFWorkbook(ExcelFile);
		ExcelWSheet = ExcelWBook.getSheet(SheetName);
		int startRow = 1; //Removing Header
		int startCol = 0;
		int ci,cj;
		int totalRows = ExcelWSheet.getLastRowNum();
		int totalCols = 0;
		if (totalRows > 0)
		{
			Row = ExcelWSheet.getRow(totalRows);
			totalCols = Row.getLastCellNum();
		}

		
		
		int rowIndex = 1; //IGNORING HEADER
		
		ArrayList<ArrayList<String>> RowData = new ArrayList<ArrayList<String>>();
		
		
		for(;rowIndex <= totalRows;rowIndex++)
		{
			ArrayList<String> ColData = new ArrayList<String>();

			if(getCellValue(rowIndex,nFilteredColNo-1).equals(sDataToBeFilterBy)) //CHECKING FOR DESIRED ROW
			{
				for(int colIndex = 0;colIndex<totalCols;colIndex++)
				{ 
					if (colIndex != nFilteredColNo - 1) //IGNORING FILTERED COLUMN
					ColData.add(getCellValue(rowIndex,colIndex));
				}
				RowData.add(ColData);
			}
		}

		int alLength = RowData.size();
		tabArray=new String[alLength][totalCols-1];
		
		for (rowIndex = 0;rowIndex < alLength; rowIndex++)
		{
			for (int colIndex = 0;colIndex < totalCols-1; colIndex++ )
			{
				tabArray[rowIndex][colIndex] = RowData.get(rowIndex).get(colIndex);
			}
		}
		
		return tabArray;
	}
	
	public static String getCellValue(int rowNum, int colmNum)
	{
		XSSFCell cellValue = ExcelWSheet.getRow(rowNum).getCell(colmNum);
			
			String retruntValue = "";
			if (cellValue == null)
			{
				retruntValue = "";
			}
			else
			{
				retruntValue = cellValue.getStringCellValue();
			}
		
		return retruntValue;
	}
	
	public static Object[][] getTableArray(String FilePath, String SheetName) throws Exception 
	{   

		String[][] tabArray = null;

		try 
		{

			FileInputStream ExcelFile = new FileInputStream(FilePath);
			// Access the required test data sheet
			ExcelWBook = new XSSFWorkbook(ExcelFile);
			ExcelWSheet = ExcelWBook.getSheet(SheetName);
			int startRow = 1; //Removing Header
			int startCol = 0;
			int ci,cj;
			int totalRows = ExcelWSheet.getLastRowNum();
			int totalCols = 0;
			if (totalRows > 0)
			{
				Row = ExcelWSheet.getRow(totalRows);
				totalCols = Row.getLastCellNum();
			}

			tabArray=new String[totalRows][totalCols];

			ci=0;

			for (int i=startRow;i<=totalRows;i++, ci++) 
			{           	   

				cj=0;

				for (int j=startCol;j<totalCols;j++, cj++)
				{

					tabArray[ci][cj]=getCellData(i,j);

					//System.out.println(tabArray[ci][cj]);  

				}

			}

		}

	catch (FileNotFoundException e)
	{

		System.out.println("Could not read the Excel sheet");
		e.printStackTrace();

	}
	catch (IOException e)
	{
		System.out.println("Could not read the Excel sheet");
		e.printStackTrace();
	}

	return(tabArray);

}

@SuppressWarnings("deprecation")
public static String getCellData(int RowNum, int ColNum) throws Exception {

	try{

		Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);

		CellType dataType = Cell.getCellType();

		if  (dataType.getCode() == 3) {

			return "";

		}else{

			String CellData = Cell.getStringCellValue();

			return CellData;

		}
	}
	catch (Exception e){

		System.out.println(e.getMessage());

		throw (e);

		}

	}

}
