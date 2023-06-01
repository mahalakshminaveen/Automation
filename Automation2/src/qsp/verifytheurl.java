package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifytheurl {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.seleniumhq.org");
		String expectedurl="https://www.selenium.dev/";
		String actualurl= driver.getCurrentUrl();
		if(expectedurl.equals(actualurl))
			System.out.println("url is successfully naviagting and pass");
		else
			System.out.println("url is not successfully navigating and fail");
		driver.close();
	}

}
