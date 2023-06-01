package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class wiprojobs {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com/");
		driver.findElement(By.name("q")).sendKeys("wipro jobs"+Keys.ENTER);
		Thread.sleep(2000);
		List<WebElement> alllinks = driver.findElements(By.cssSelector("a"));
		int count=alllinks.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
		String links = alllinks.get(i).getAttribute("href");
		System.out.println(links);
		}
		driver.close();

	}

}
