package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class attributeAndTagname {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String tag = driver.findElement(By.linkText("Forgotten password?")).getTagName();
		System.out.println("tagname="+tag);
		String attribute = driver.findElement(By.linkText("Forgotten password?")).getAttribute("href");
		System.out.println("attribute="+attribute);

	}

}
