package qsp;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class actitimeFromExcel {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/testscripts.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		  String un = wb.getSheet("actitime").getRow(1).getCell(0).getStringCellValue();
		  String pw = wb.getSheet("actitime").getRow(1).getCell(1).getStringCellValue();
		   String url = wb.getSheet("actitime").getRow(1).getCell(2).getStringCellValue();
		   WebDriver driver=new ChromeDriver();
		   driver.get(url);
		   driver.findElement(By.id("username")).sendKeys(un);
		   driver.findElement(By.name("pwd")).sendKeys(pw);
		   driver.findElement(By.id("loginButton")).click();
		

	}

}
