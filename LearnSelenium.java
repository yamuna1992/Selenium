package Week2.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSelenium {

	public static void main(String[] args) {
		
		// Step 1: Download and set the path 
		// Step 2: Launch the chromebrowser
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		// Step 3: Load the URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		// Step 4: Maximize the window
		driver.manage().window().maximize();
		
		// Step 5: Locate the username and type "demosalesmanager"
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		// Step 6: Locate the password and type "crmsfa"
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		// Step 7: Locate the Login button and click it
		driver.findElement(By.className("decorativeSubmit")).click();

		
		// Step 8: Verify if the login process is successful
		
		String title = driver.findElement(By.tagName("h2")).getText();
		
		if(title.contains("Demo Sales Manager"))
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
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");

		// Step13: Enter FirstName
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Yamuna");

		// Step14: Enter LastName
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Dinesh");

		// Step15: Click CreateLead button
		driver.findElement(By.className("smallSubmit")).click();
		
	}


}
