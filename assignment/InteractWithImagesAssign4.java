package week2.assignment;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InteractWithImagesAssign4 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
		driver.manage().window().maximize();
		
		// Step1 :Click on this image to go home page
		
		driver.findElement(By.xpath("//label[text()='Click on this image to go home page']//following-sibling::img")).click();
		String url = driver.getCurrentUrl();
		if (url.contains("http://leafground.com/home.html"))
		{
			System.out.println("Step 1: Current page URL " + "http://leafground.com/home.html" + " is valid page");
		}
		else {
			System.out.println("Current page URL is not a valid page ");
		}
		
		//Step to navigate back to interact with the Image page
		driver.findElement(By.xpath("//h5[text()='Image']//following-sibling::img")).click();
		
		// Step 2: Verify the image is broken
		String source = driver.findElement(By.xpath("//label[text()=\"Am I Broken Image?\"]//following-sibling::img")).getAttribute("src");
		driver.get(source);
		String output = driver.getTitle();
		if (output.contains("404"))
		{
			System.out.println("Step 2: Broken image and link reference page");
		}
		else {
			System.out.println("Invalid output ");
		}
		
		//Step to navigate back to interact with the Image page
		driver.get("http://leafground.com/pages/Image.html");
		
		// Step 3:Click me using Keyboard or Mouse
		
		WebElement keyboard = driver.findElement(By.xpath("//label[text()='Click me using Keyboard or Mouse']//following-sibling::img"));
		
		Actions key = new Actions(driver);
		key.click(keyboard).build().perform();
		String output1 = driver.getTitle();
		System.out.println(output1);
		if (output1.contains("Selenium Playground"))
		{
			System.out.println("Locators and Selenium Interactions page displayed");
		}
		else
		{
			System.out.println("Locators and Selenium Interactions not displayed - Not the expected output");
		}

		}
	}
