package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleclick {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.vtiger.com/");
		WebElement target = driver.findElement(By.partialLinkText("Resource"));
		Actions a=new Actions(driver);
		a.moveToElement(target).perform();
		driver.findElement(By.xpath("(//a[@href='https://www.vtiger.com/customers/'])[1]")).click();
		WebElement login = driver.findElement(By.id("loginspan"));
		Actions a1=new Actions(driver);
		a1.doubleClick(login).perform();
		boolean loginpage = driver.findElement(By.xpath("//div[@class='auth-well text-center']")).isDisplayed();
		if(loginpage==true)
			System.out.println("login page is displayed and pass");
		else
			System.out.println("login page is not displayed and fail");
		driver.quit();
	}

}
