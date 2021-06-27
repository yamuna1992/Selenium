package Week2.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3_LeafGroundLink {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		// Step 3: Load the URL
		driver.get("http://leafground.com/pages/Link.html");

		// Step 4: Maximize the window
		driver.manage().window().maximize();

		driver.findElementByLinkText("Go to Home Page").click();
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[3]/a/img")).click();

		
		System.out.println("Find where am : " + driver.findElementByLinkText("Find where am supposed to go without clicking me?").getAttribute("href"));
		
		System.out.println("Verify Am I Broken : " + driver.findElementByLinkText("Verify am I broken?").getAttribute("href"));
		
		//System.out.println("Same Link Name :" + driver.findElementByXPath());
		
		
	}

}
