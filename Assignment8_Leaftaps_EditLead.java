package Week2.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment8_Leaftaps_EditLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		// Step 3: Load the URL
		driver.get("http://leaftaps.com/opentaps/control/login");

		// Step 4: Maximize the window
		driver.manage().window().maximize();

		// Step 5: Locate the username and type "demosalesmanager"
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");

		// Step 6: Locate the password and type ""
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");

		// Step 7: Locate the Login button and click it
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		//Step 8:  Click CRM/SFA
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		
		//Step 9: click Lead 
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		
		// Step 10: click find leads
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		
		
		// Enter first name as gopi
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Yamuna");
		
		Thread.sleep(1000);

		//Click Find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		//Click on first resulting lead
		driver.findElementByXPath("//a[contains(@href,'crmsfa/control/viewLead?partyId=11155')]").click();
		
		//Verify title of the page
		System.out.println("Title of Page: " +driver.getTitle());
		
		//Click Edit
		driver.findElementByLinkText("Edit").click();
		
		//Change the company name
		
		String CmpnyNameOrg = "TATA";
		WebElement Company = driver.findElement(By.id("updateLeadForm_companyName"));
		Company.clear();
		Company.sendKeys(CmpnyNameOrg);
		
		//Click Update
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		
		//Confirm the changed name appears
		System.out.println(CmpnyNameOrg.equals("TATA"));
		
		//Close the browser
		driver.quit();
		

	}

}
