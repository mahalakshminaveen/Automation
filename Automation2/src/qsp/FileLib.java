package qsp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFWorkbookFactory;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	public String getPropertyData(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream("./data/commondata.property");
		Properties p=new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;
	}
	
	public String getExcelData(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./data/testscripts.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		String data1 = wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		return data1;	
		
	}
	public void setExcelData(String sheetname,int row,int cell,String data) throws EncryptedDocumentException, IOException

	{
		FileInputStream fis=new FileInputStream("./data/testscripts.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		wb.getSheet(sheetname).getRow(row).getCell(cell).setCellValue(data)	;
		FileOutputStream fos=new FileOutputStream("./data/testscripts.xlsx");
		wb.write(fos);
		wb.close();
		
		}

	}

