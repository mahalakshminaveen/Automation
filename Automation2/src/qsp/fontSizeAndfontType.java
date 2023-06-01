package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fontSizeAndfontType {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement pwd = driver.findElement(By.linkText("Forgotten password?"));
		String font = pwd.getCssValue("font-family");
		String size = pwd.getCssValue("font-size");
		System.out.println("font="+font);
		System.out.println("size="+size);

	}

}
