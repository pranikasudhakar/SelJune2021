package week2.assignment;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PlayWithHyperlinkAssign3 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Go to Home Page")).click();
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		if (url.contains("http://leafground.com/home.html"))
		{
			System.out.println("Step 1: Current Browser URL is valid " + url);
		}
		else {
			System.out.println("Step 1: Invalid Browser URL that is expected");
		}
		
		// Navigate back to page "http://leafground.com/pages/Button.html"
		
				driver.findElement(By.xpath("//h5[text()='HyperLink']//following-sibling::img")).click();
				
		// Step2: Find where am supposed to go without clicking me?
				
				String input = driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).getAttribute("href");
				driver.get(input);
				String title = driver.getTitle();
				if (title.contains("Buttons")) {
					System.out.println("Step 2: This link is directing to Button.html page");
				}
				else {
					System.out.println("Step 2: Invalid page");
				}
				
		// Navigate back to page "http://leafground.com/pages/Button.html"
				
				driver.findElement(By.id("home")).click();
				driver.findElement(By.xpath("//h5[text()='HyperLink']//following-sibling::img")).click();
				
		//Step 3: Verify am I broken?
				String broken = driver.findElement(By.linkText("Verify am I broken?")).getAttribute("href");
				driver.get(broken);
				String result = driver.getTitle();
				if (result.contains("404")) {
					System.out.println("Step 3: HTTP Status 404 – Not Found page");
				}
				else {
					System.out.println("Step3: Invalid page");
				}
					
		// Navigate to Hyperlink page 
		
				driver.get("http://leafground.com/pages/Link.html");
				
		// Step 4: Go to Home Page
				String same = driver.findElement(By.linkText("Go to Home Page")).getAttribute("href");
				driver.get(same);
				String title1 = driver.getTitle();
				if (title1.contains("Selenium Playground"))
				{
					System.out.println("Step 4: Locators and Selenium Interactions Home page displayed ");
				}
				else {
					System.out.println("Step 4: Invalid page");
				}
				
				driver.findElement(By.xpath("//h5[text()='HyperLink']//following-sibling::img")).click();
				
		// Step 5: How many links are available in this page?
				java.util.List<WebElement> allURLs = driver.findElements(By.tagName("a"));
				System.out.println("Total links on the Web Page: " + allURLs.size());
				
				for (int i=0; i < allURLs.size(); i++) 
				{
					WebElement E1 = allURLs.get(i);
					String output = E1.getAttribute("href");
					System.out.println(output);
				}
	}

}
