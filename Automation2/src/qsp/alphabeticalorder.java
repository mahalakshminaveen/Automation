package qsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class alphabeticalorder {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/FCI1692/Desktop/hotel.html");
		WebElement mrlistbox = driver.findElement(By.id("mtr"));
		Select s=new Select(mrlistbox);
		List<WebElement> alloptions = s.getOptions();
		ArrayList<String> al=new ArrayList<>();
		for(int i=0;i<alloptions.size();i++)
		{
			String text = alloptions.get(i).getText();
			al.add(text);
			
		}
		//System.out.println(al);
		Collections.sort(al);
		for(String a:al)
		{
			System.out.println(a);
		}
		driver.close();

	}

}
