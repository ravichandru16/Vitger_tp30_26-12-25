package genericUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataFromExcel {
	/**This is  used to read specific data from excel
	 * @author ravi1
	 * @param sheet
	 * @param row
	 * @param cel
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String readSpecificDataFromExcel(String sheet,int row,int cel) throws EncryptedDocumentException, IOException {
		FileInputStream fisE= new FileInputStream(IPathStatics.excelPath);
		
		Workbook wb=WorkbookFactory.create(fisE);
		Sheet sh=wb.getSheet(sheet);
		String value=sh.getRow(row).getCell(cel).getStringCellValue();
		return value;
	}
	
	/**This is read all data from excel
	 * @author ravi1
	 * @param sheet
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public ArrayList<String> readAllDataFromExcel(String sheet) throws EncryptedDocumentException, IOException
	{
		FileInputStream fisE=new FileInputStream(IPathStatics.excelPath);
		
		Workbook wb=WorkbookFactory.create(fisE);
		Sheet sh=wb.getSheet(sheet);
		int lastrow=sh.getLastRowNum();
		int lastcel=sh.getRow(0).getLastCellNum();
		
		ArrayList<String > value= new ArrayList<String>();
		for(int i=0;i<=lastrow;i++)
		{
			for(int j=0;j<lastcel;j++)
			{
				String data=sh.getRow(i).getCell(j).getStringCellValue();
				value.add(data);
			}
		}
		return value;
	}
	
	/**This is getting row count from excel
	 * @author ravi1
	 * @param sheet
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public int getRowCount(String sheet) throws EncryptedDocumentException, IOException
	{
		FileInputStream fisE= new FileInputStream(IPathStatics.excelPath);
		
		Workbook wb=WorkbookFactory.create(fisE);
		Sheet sh=wb.getSheet(sheet);
		int rowcount=sh.getLastRowNum();
		
		return rowcount;
	}
	
	/**
	 * This is getting cell count from excel
	 * @author ravi1
	 * @param sheet
	 * @param row
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public int getCellCount(String sheet,int row) throws EncryptedDocumentException, IOException
	{
		FileInputStream fisE= new FileInputStream(IPathStatics.excelPath);
		
		Workbook wb=WorkbookFactory.create(fisE);
		Sheet sh=wb.getSheet(sheet);
		int celcount=sh.getRow(row).getLastCellNum();
		
		return celcount;
	}
	
	/**
	 * This is write date to excel
	 * @author ravi1
	 * @param sheet
	 * @param row
	 * @param cel
	 * @param value
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public void writeDatatoExcel(String sheet,int row,int cel,String value) throws EncryptedDocumentException, IOException
	{
		FileInputStream fisE= new FileInputStream(IPathStatics.excelPath);
		
		Workbook wb=WorkbookFactory.create(fisE);
		Sheet sh=wb.getSheet(sheet);
		sh.getRow(row).getCell(cel).setCellType(CellType.STRING);
		sh.getRow(row).getCell(cel).setCellValue(value);
		
		
		FileOutputStream fos= new FileOutputStream(IPathStatics.excelPath);
		wb.write(fos);
		wb.close();
		
	}
	
	public int getIntValueFromExcel(String sheet,int row,int cel) throws EncryptedDocumentException, IOException
	{
FileInputStream fisE= new FileInputStream(IPathStatics.excelPath);
		
		Workbook wb=WorkbookFactory.create(fisE);
		Sheet sh=wb.getSheet(sheet);
		int value=(int)sh.getRow(row).getCell(cel).getNumericCellValue();
		return value;
	}
	
	public Object[][] allDataFromExcelTestNG(String sheet) throws EncryptedDocumentException, IOException
	{
		FileInputStream fisE=new FileInputStream(IPathStatics.excelPath);
		
		Workbook wb=WorkbookFactory.create(fisE);
		Sheet sh=wb.getSheet(sheet);
		int lastrow=sh.getLastRowNum()+1;
		int lastcel=sh.getRow(0).getLastCellNum();
		Object[][]obj= new Object[lastrow][lastcel];
		
		ArrayList<String > value= new ArrayList<String>();
		for(int i=0;i<lastrow;i++)
		{
			for(int j=0;j<lastcel;j++)
			{
				 obj[i][j]=sh.getRow(i).getCell(j).getStringCellValue();
				
			}
		}
		return obj;
	}
}
