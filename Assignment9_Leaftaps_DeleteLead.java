package Week2.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment9_Leaftaps_DeleteLead {

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
		
		//Enter phone number 99
		driver.findElementByXPath("//*[text()='Phone']").click();
		
		//driver.findElementByXPath("//*[@name='phoneCountryCode']").sendKeys("91");
		//driver.findElementByXPath("//*[@name='phoneAreaCode']").sendKeys("02");
		driver.findElementByXPath("//*[@name='phoneNumber']").sendKeys("99");
		
		Thread.sleep(1000);

		//Click Find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		//Capture lead ID of First Resulting lead
		//Click on first resulting lead
		//System.out.println("Lead ID:" + 
		
		driver.findElementByXPath("//a[contains(@href,'/crmsfa/control/viewLead?partyId=11911')]").click();
		
		
		//Click Delete
		driver.findElementByLinkText("Delete").click();
		
		// Step 10: click find leads
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		
		//driver.quit();
	}

}
