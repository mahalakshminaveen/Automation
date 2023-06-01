package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pageloadtimeout {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		try {
			driver.get("https://demo.actitime.com/login.do");
			System.out.println("page is loaded within 20 seconds and pass");
		}
		catch(Exception e)
		{
			System.out.println("page is not loaded within 20 sceond and fail");
			
		}
		driver.close();

	}

}
