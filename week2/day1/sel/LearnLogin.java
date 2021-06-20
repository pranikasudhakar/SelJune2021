package week2.day1.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnLogin {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		//Download the ChromeDriver exe and se1749t its path
		ChromeDriver driver = new ChromeDriver();
		
		// Load the URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		// maximize the browser (Best Practice)
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String text = driver.findElement(By.id("form")).getText();
		System.out.println(text);
		
		driver.findElement(By.id("label")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testing Inc");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sudhakar");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Karuppannan");
		driver.findElement(By.className("smallSubmit")).click();
		
	}

}
