package qsp;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class MultipleDataFromExcelfile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/testscripts.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		int count = wb.getSheet("invalidlogin").getLastRowNum();
		for(int i=1;i<=count;i++)
		{
		String un = wb.getSheet("invalidlogin").getRow(i).getCell(0).getStringCellValue();
		String pw = wb.getSheet("invalidlogin").getRow(i).getCell(1).getStringCellValue();
		System.out.println(un+"  "+pw);
		}
		
     
	}

}
