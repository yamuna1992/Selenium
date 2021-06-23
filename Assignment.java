package Week2.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		// Step 3: Load the URL
		driver.get("http://leaftaps.com/opentaps/control/login");

		// Step 4: Maximize the window
		driver.manage().window().maximize();

		// Step 5: Locate the username and type "demosalesmanager"
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");

		// Step 6: Locate the password and type "crmsfa"
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// Step 7: Locate the Login button and click it
		driver.findElement(By.className("decorativeSubmit")).click();

		// get title
		String title1 = driver.getTitle();
		System.out.println("title : " + title1);

		// Step 8: Verify if the login process is successful

		String title = driver.findElement(By.tagName("h2")).getText();

		if (title.contains("Demo Sales Manager"))
			System.out.println("We are in web page");
		else
			System.out.println("Not in web page");

		// Step 9: Click CRM/SFA link
		driver.findElementByLinkText("CRM/SFA").click();

		// Step10: Click Leads tab
		driver.findElementByLinkText("Leads").click();

		// Step11: Click CreateLead
		driver.findElementByLinkText("Create Lead").click();

		// Step12: Enter Company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Megatrends");

		// Step12: Fill all the field(username)
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Yamuna");

		// Step12: Fill all the field (surename)
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Dinesh");

		// Step12: Fill all the field (source)
		WebElement Webelesource = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select drpDown = new Select(Webelesource);
		drpDown.selectByValue("LEAD_CONFERENCE");

		// Step12: Fill all the field (Marketing Campaign)
		WebElement Webelesource0 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select drpDown0 = new Select(Webelesource0);
		drpDown0.selectByValue("CATRQ_AUTOMOBILE");

		// Step12: Fill all the field (First Name)
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Yamuna");

		// Step12: Fill all the field (Last Name)
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("S");

		// Step12: Fill all the field (Salutation)
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mrs");

		// *********** Step12: Fill all the field (DateofBirth)**********
		driver.findElement(By.id("createLeadForm_birthDate-button")).click();

		// Step12: Fill all the field (Title)
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Testing");

		// Step12: Fill all the field (Department)
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("OA");

		// Step12: Fill all the field (AnnualRevenue)
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("200000000");

		// Step12: Fill all the field (Preferred Currency)
		WebElement Webelesource1 = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select drpDown1 = new Select(Webelesource1);
		drpDown1.selectByValue("INR");

		// Step12: Fill all the field (Industry Type)
		WebElement Webelesource2 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select drpDown2 = new Select(Webelesource2);
		drpDown2.selectByValue("IND_SOFTWARE");

		// Step12: Fill all the field (Number of employees)
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("500");

		// Step12: Fill all the field (Ownership)
		WebElement Webelesource3 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select drpDown3 = new Select(Webelesource3);
		drpDown3.selectByValue("OWN_CCORP");

		// Step12: Fill all the field (SID Code)
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("60");

		// Step12: Fill all the field (Ticket Sysmbol)
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("&&");

		// Step12: Fill all the field (Description)
		driver.findElement(By.id("createLeadForm_description"))
				.sendKeys("Lead should check all the Employees information correctly and maintain the database");

		// Step12: Fill all the field (Important Note)
		driver.findElement(By.id("createLeadForm_importantNote"))
				.sendKeys("Employees Information should be verified every week");

		// Step12: Fill all the field (Country Code)
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("1");

		// Step12: Fill all the field (Area Code)
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("600 077");

		// Step12: Fill all the field (Phone Number)
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("1234567890");

		// Step12: Fill all the field (Extension)
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("044");

		// Step12: Fill all the field (Person to Ask For)
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Yamuna");

		// Step12: Fill all the field (Email)
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abcdefghij@gmail.com");

		// Step12: Fill all the field (Web URL)
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("https://www.linkedin.com");

		// Step12: Fill all the field (To Name)
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("XYZ");

		// Step12: Fill all the field (Attention Name)
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("ASDF");

		// Step12: Fill all the field (Address Line1)
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("No.1 ABC Street,");

		// Step12: Fill all the field (Address Line2)
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("MRG Nagar,Kancheepuram Dist");

		// Step12: Fill all the field (City)
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");

		// Step12: Fill all the field (State/Province)
		WebElement Webelesource4 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select drpDown4 = new Select(Webelesource4);
		drpDown4.selectByValue("IN");

		// Step12: Fill all the field (Postal Code)
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600077");

		// Step12: Fill all the field (Country)
		WebElement Webelesource5 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select drpDown5 = new Select(Webelesource5);
		drpDown5.selectByValue("IND");

		// Step12: Fill all the field (Postal Code EXT)
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("044");

		// Step13: Click CreateLead button
		driver.findElement(By.className("smallSubmit")).click();

		// Step14: Click Duplicate
		driver.findElementByLinkText("Duplicate Lead").click();

		// Clear the Existing Company name And Enter the New Company name
		String CmpnyNameOrg = "TestLeaf";
		WebElement Company = driver.findElement(By.id("createLeadForm_companyName"));
		Company.clear();
		Company.sendKeys(CmpnyNameOrg);

		// Click CreateLeadButton
		driver.findElement(By.className("smallSubmit")).click();

		// Step 17: Get the Company Name
		String cmpnyName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(" cmpnyName:" + cmpnyName);

		// Close the Browser
		driver.quit();

	}

}
