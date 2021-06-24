package week2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditPageAssign1 {

	public static void main(String[] args) {
		
		//initializing to load and setup the latest ChromeDriver
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		// Get the URL opened in the CHrome WebBrowser
		driver.get("http://leafground.com/pages/Edit.html");
		
		// Maximum the ChromeBrowser Window
		driver.manage().window().maximize();
		
		//Step 1: Enter your email address
		driver.findElement(By.id("email")).sendKeys("test@test.com");
		
		//Step 2: Append a text and press keyboard tab
		driver.findElement(By.xpath("//label[text()='Append a text and press keyboard tab']/following-sibling::input")).sendKeys("Sudhakar Appending text");
		
		
		//Step 3:Get default text entered
		String text = driver.findElement(By.name("username")).getAttribute("value");
		System.out.println("Step 3: Text Entere is " + text);
		
		//Step 4:Clear the text
		driver.findElement(By.xpath("//label[text()='Clear the text']/following-sibling::input")).clear();
		
		// Step 5: Confirm that edit field is disabled
		boolean validation = driver.findElement(By.xpath("//label[text()='Confirm that edit field is disabled']/following-sibling::input")).isEnabled();
		System.out.println(validation);
		if (validation==false)
		{
			System.out.println("Step 5: This is to confirm Edit Field is disabled");
		}
		else {
			System.out.println("Edit field is not disabled");
		}
		
		//driver.close();
	}

}
