package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class handlinglistbox {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(4000);
		WebElement monthlistbox = driver.findElement(By.id("month"));
		Thread.sleep(3000);
		Select s=new Select(monthlistbox);
		s.selectByIndex(9);
		Thread.sleep(3000);
		s.selectByValue("2");
		Thread.sleep(3000);
		s.selectByVisibleText("Dec");
		Thread.sleep(3000);
		driver.close();
				
	}

}
