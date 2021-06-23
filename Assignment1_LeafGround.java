package Week2.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1_LeafGround {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		// Step 3: Load the URL
		driver.get("http://leafground.com/pages/Edit.html");

		// Step 4: Maximize the window
		driver.manage().window().maximize();
		
		// Edit Page
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abcdefg@gmail.com");
		
		// Edit Page
		//driver.findElement(By.xpath("//input[contains(@value='Append']"));
		//driver.findElement(By.xpath("//input[@value='Append']"));

		
		driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/input")).sendKeys("content",Keys.TAB);
		
		System.out.println(driver.findElement(By.xpath("//input[@value='TestLeaf']")).getAttribute("value")); 
		
		driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
		
		System.out.println(driver.findElement(By.xpath("//*[@id='contentblock']/section/div[5]/div/div/input")).isEnabled());		
	}

}
