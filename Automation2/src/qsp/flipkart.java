package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("i phone 14pro max"+Keys.ENTER);
		Thread.sleep(3000);
		List<WebElement> name = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 14 Pro Max ')]"));
		List<WebElement> prices = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 14 Pro Max ')]/.././../div[2]/div[1]/div[1]/div"));
		for(int i=0;i<name.size();i++)
		{
			String product = name.get(i).getText();
			String price = prices.get(i).getText();
			System.out.println(product+" "+"=====>"+ price);
		}
		
		
		
		

	}

}
