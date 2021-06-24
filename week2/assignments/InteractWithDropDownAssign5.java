package week2.assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InteractWithDropDownAssign5 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		
		//Step 1: Select training program using index
		
		WebElement drop1 = driver.findElement(By.xpath("(//div[@class='example']//following-sibling::select)[1]"));
		Select dropdown1 = new Select(drop1);
		dropdown1.selectByIndex(1);
		
		//Step 2: Select training program using text
		
		WebElement drop2 = driver.findElement(By.xpath("(//div[@class='example']//following-sibling::select)[2]"));
		Select dropdown2 = new Select(drop2);
		dropdown2.selectByVisibleText("Selenium");
		
		//Step 3: Select training program using value
		
				WebElement drop3 = driver.findElement(By.xpath("(//div[@class='example']//following-sibling::select)[3]"));
				Select dropdown3 = new Select(drop3);
				dropdown3.selectByValue("1");
		
		//Step 4: Select training program using value
				WebElement drop4 = driver.findElement(By.xpath("(//div[@class='example']//following-sibling::select)[4]"));
				Select dropdown4 = new Select(drop4);
				List<WebElement> options = dropdown4.getOptions();
				System.out.println(options.size());
				
				
		//Step 5: Select training program using value
				WebElement drop5 = driver.findElement(By.xpath("(//div[@class='example']//following-sibling::select)[5]"));
				drop5.sendKeys("Appium");
				
		//Step 6: Select your programs
		WebElement drop6 = driver.findElement(By.xpath("(//div[@class='example']//following-sibling::select)[6]"));
		Select dropdown6 = new Select(drop6);
		dropdown6.selectByIndex(3);
	}

}