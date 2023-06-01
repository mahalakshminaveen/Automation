package qsp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class mtrlistbox {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/FCI1692/Desktop/hotel.html");
		WebElement mtrlistbox = driver.findElement(By.id("mtr"));
		List ls=new ArrayList();
		Select s=new Select(mtrlistbox);
		List<WebElement> alloptions = s.getOptions();
		int count = alloptions.size();
		for(WebElement option:alloptions)
		{
			String text = option.getText();
			ls.add(option);
			System.out.println(ls);
		}
		List ls1=new ArrayList();
		ls1.addAll(ls);
		Collections.sort(ls1);
		System.out.println(ls1);
		
		
      
	}

}
