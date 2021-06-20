package week2.day1.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		// Step 1: Enter UserName and Password Using Id Locator
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		// Step 2: Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		// Step 3: Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
		
		// Step 4: Get the Title and verify it
		String title = driver.findElement(By.id("form")).getText();
		System.out.print(title);
		if (title == "Welcome" + "Demo Sales Manager" +"CRM/SFA");
		{
			System.out.print("Title validation Passed " + title);
		}
		
		// Step 4: Click on CRM/SFA Link
		driver.findElement(By.id("label")).click();
		
		// Step 5: Click on Leads Button
		driver.findElement(By.linkText("Leads")).click();
		
		//Step 6:  Click on Create Lead Button
		driver.findElement(By.linkText("Create Lead")).click();
		
		// Step 7: Fill all the fields Except Parent Account
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeafJunBatch");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("SudhakarTest1");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("KaruppannanTest1");
		
		WebElement webSource = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sourceDropDown = new Select(webSource);
		sourceDropDown.selectByValue("LEAD_COLDCALL");
		
		WebElement marketingCampaign = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select marketingDropDown = new Select(marketingCampaign);
		marketingDropDown.selectByValue("CATRQ_CARNDRIVER");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("SudhakarLocal");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("KaruppannanLocal");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr.");
		
		
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("06/3/97");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("QE Transformation");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Quality Engineering");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("10000.00");
		
		WebElement preferredCurrencyElement = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select preferredCurrencyDropDown = new Select(preferredCurrencyElement);
		preferredCurrencyDropDown.selectByValue("CAD");
		
		WebElement industryElement = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select industryDropDown = new Select(industryElement);
		industryDropDown.selectByValue("IND_FINANCE");
		
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("50");
		
		WebElement ownershipElement = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select ownershipDropDown = new Select(ownershipElement);
		ownershipDropDown.selectByValue("OWN_CCORP");
		
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("SICCode001");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("TickerSymbol");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Description text here. Please keep continuing");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Important Notes to be documented here. Please select 001");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("+1");
		
		
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("647");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("0011234");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("9876");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Rohit Bansal");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("test@test.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("http://www.test.com");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Richard Billard");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Richard Billard");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Unit 101");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("1908 Plackard Way");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Toronto");
		
		WebElement stateElement = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select stateDropDown = new Select(stateElement);
		stateDropDown.selectByValue("NY");
		
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("60009");
		
		WebElement countryElement = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select countryDropDown = new Select(countryElement);
		countryDropDown.selectByValue("USA");
		
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("1234");

		//Step 8: Click on create Lead Button 
		driver.findElement(By.className("smallSubmit")).click();
		
		// Step 9: Click on Duplicate Lead button
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
		
		// Step 10: Clear the Existing Company name And Enter the New Company name
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestInc2");
		
		// Step 11: Click on the Create Lead button		
		driver.findElement(By.className("smallSubmit")).click();
		
		// Step 12: Get The Duplicate Company name and Verify it.
		
//		String duplicateCmpName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
//		duplicateCmpName.replaceAll("\\D", "");
//		if (duplicateCmpName == "TestInc2")
//		{
//			System.out.println("Duplicate Company Name is " + "TestInc2");
//		}
		
		// Step 13: Close the Browser.
		driver.close();
	}

}
