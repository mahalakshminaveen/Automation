package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectAllOptions {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/FCI1692/Desktop/hotel.html");
		Thread.sleep(3000);
		WebElement slvlistbox = driver.findElement(By.id("slv"));
		Select s=new Select(slvlistbox);
		List<WebElement> alloptions = s.getOptions();
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
