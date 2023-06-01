package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class printfirstselectedoption {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("C:\\Users\\FCI1692\\Desktop\\hotel.html");
		WebElement slvlistbox = driver.findElement(By.id("slv"));
		Select s=new Select(slvlistbox);
		Thread.sleep(3000);
		String fsoption = s.getFirstSelectedOption().getText();
		Thread.sleep(3000);
		System.out.println(fsoption);
		driver.close();

	}

}
