package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.html5.GetLocalStorageItem;

public class genderButtons {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);
		int b1 = driver.findElement(By.xpath("(//input[@type='radio'])[1]")).getLocation().getY();
		int b2 = driver.findElement(By.xpath("(//input[@type='radio'])[2]")).getLocation().getY();
		int b3 = driver.findElement(By.xpath("(//input[@type='radio'])[3]")).getLocation().getY();
		if(b1==b2||b2==b3)
			System.out.println("properly aligned");
		else
			System.out.println("not properly aligned");
		driver.close();
			

	}

}
