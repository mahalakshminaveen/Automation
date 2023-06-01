package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ScrollToLastHorizantally {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bbc.com/");
		RemoteWebDriver r=(RemoteWebDriver) driver;
		r.executeScript("window.scrollBy(document.body.scrollWidth,0)");

	}

}
