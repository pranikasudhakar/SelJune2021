package week2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PlaywithRadioButtonsAssign6 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/radio.html");
		
		driver.manage().window().maximize();
		
		//Step1: Are you enjoying the classes?
		WebElement radio1 = driver.findElement(By.xpath("//input[@id='yes']"));
		radio1.click();
		
		
		//Step2: Find default selected radio button
		//driver.
	}

}
