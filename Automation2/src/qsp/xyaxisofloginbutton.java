package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xyaxisofloginbutton {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Point login = driver.findElement(By.name("login")).getLocation();
		int xaxis = login.getX();
		int yaxis = login.getY();
		System.out.println("x axis dimension is="+xaxis);
		System.out.println("y axis dimension is="+yaxis);
		
		

	}

}
