package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class enabled {
	

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://facebook.com/");
		boolean enable = driver.findElement(By.name("login")).isEnabled();
		if(enable==true)
				System.out.println("login button is enabled");
		else
			System.out.println("login button is not enabled");
	}


}
