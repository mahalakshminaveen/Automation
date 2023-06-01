package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ScrollToBottom {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bbc.com/");
		RemoteWebDriver r=(RemoteWebDriver) driver;
		r.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		r.executeScript("window.scrollTo(0,0)");

	}

}
