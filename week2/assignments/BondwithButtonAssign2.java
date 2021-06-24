package week2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BondwithButtonAssign2 {
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		
		// Step1: Click button to travel home page
		
		driver.findElement(By.xpath("//label[text()='Click button to travel home page']/following-sibling::button")).click();

		String url=driver.getCurrentUrl();
		System.out.println(url);
		if (url.contains("http://leafground.com/home.html"))
		{
			System.out.println("Current Browser URL is valid " + url);
		}
		else {
			System.out.println("It is not a valid Browser URL that is expected");
		}
		
		// Navigate back to page "http://leafground.com/pages/Button.html"
		
		driver.findElement(By.xpath("//h5[text()='Button']//following-sibling::img")).click();
		
		// Step 2: Find position of button (x,y)
		
		System.out.println(driver.findElement(By.xpath("//label[text()='Find position of button (x,y)']//following-sibling::button")).getLocation());
		
		// Step 3: Find button color
		
		System.out.println(driver.findElement(By.xpath("//label[text()='Find button color']//following-sibling::button")).getCssValue("background-color"));
		
		// Step 4: Find the height and width
		
		System.out.println(driver.findElement(By.xpath("//label[text()='Find the height and width']//following-sibling::button")).getSize());
		

	}	
}
