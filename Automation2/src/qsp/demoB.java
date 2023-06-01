package qsp;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class demoB {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
		
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		demoA.testA(driver);
		WebDriver driver1=new EdgeDriver();
		demoA.testA(driver1);
	}

}
