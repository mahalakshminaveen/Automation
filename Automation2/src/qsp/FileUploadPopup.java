package qsp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/FCI1692/Desktop/naukri.html");
		String relativepath = "./data/resume.docx";
		File f=new File(relativepath);
		String abspath = f.getAbsolutePath();
		driver.findElement(By.id("cv")).sendKeys(abspath);

	}

}
