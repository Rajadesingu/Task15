package day18;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		// load URL
		driver.get("https://www.google.co.in/");
		
		// maximize browser
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("Selenium Browser Driver", Keys.ENTER);
		
		
		// close the browser
		driver.close();
		
	}

}
