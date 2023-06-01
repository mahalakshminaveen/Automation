package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class printallselectedoptions {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("C:\\Users\\FCI1692\\Desktop\\hotel.html");
		WebElement slvlistbox = driver.findElement(By.id("slv"));
		Select s=new Select(slvlistbox);
		Thread.sleep(3000);
		List<WebElement> alloptions = s.getAllSelectedOptions();
		int count = alloptions.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			String text = alloptions.get(i).getText();
			System.out.println(text);
			
			
		}
		driver.close();


	}

}
