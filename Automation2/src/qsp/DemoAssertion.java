package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class DemoAssertion {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String etitle = "soogle";
		String atitle = driver.getTitle();
		SoftAssert s=new SoftAssert();
		s.assertEquals(etitle, atitle);
		driver.close();
		s.assertAll();
		

	}

}
