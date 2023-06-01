package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class actiHeightAndwidth {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		Dimension username = driver.findElement(By.id("username")).getSize();
		int h1 = username.getHeight();
		int w1 = username.getWidth();
		Dimension password = driver.findElement(By.name("pwd")).getSize();
		int h2 = password.getHeight();
		int w2 = password.getWidth();
		if(h1==h2&&w1==w2)
			System.out.println("height and width of UN and PWD textbox is same and pass");
		else
			System.out.println("height and width of UN and PWD textbox is not same and fail");
		driver.close();

	}

	
}
