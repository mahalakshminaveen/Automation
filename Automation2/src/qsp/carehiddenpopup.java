package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class carehiddenpopup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.id("policynumber")).sendKeys("123");
		driver.findElement(By.id("dob")).click();
		WebElement monthbox = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select s=new Select(monthbox);
		//Thread.sleep(3000);
		s.selectByVisibleText("Mar");
		WebElement yearbox = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select s1=new Select(yearbox);
		//Thread.sleep(3000);
		s1.selectByVisibleText("1976");
		driver.findElement(By.xpath("(//a[@class='ui-state-default'])[4]")).click();
		driver.findElement(By.id("alternative_number")).sendKeys("9845098450");
		driver.findElement(By.id("renew_policy_submit")).click();
		boolean display = driver.findElement(By.id("policynumberError")).isDisplayed();
		if(display==true)
			System.out.println("enter valid policy number text is displayed and pass");
		else
			System.out.println("enter valid policy number text is not displayed and fail");
		

	}

}
