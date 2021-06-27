package Week2.Day2;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Classroom {
	public static void main(String[] args) {

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
		
		// Step 7: Locate the Login button and click it
				driver.findElement(By.xpath("//input[@id='label']")).click();
		
		// text path
		driver.findElement(By.xpath("//input[text()='My Lead']")).click();
		
		// Merge from Lead icon
		
		//driver.findElement(By.xpath("//td[@class='titleCell']/following::a[1]")).click();
		
		//waiting time
		
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		// Merge To Lead icon
		
		//driver.findElement(By.xpath("//td[@class='titleCell']/following::a[2]")).click();
		
		
	}
}
