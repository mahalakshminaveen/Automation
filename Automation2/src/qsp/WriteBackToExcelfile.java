package qsp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteBackToExcelfile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/testscripts.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		wb.getSheet("createcustomer").getRow(1).getCell(1).setCellValue("ecommerce");
		FileOutputStream fos=new FileOutputStream("./data/testscripts.xlsx");
		wb.write(fos);
		wb.close();
		

	}

}
