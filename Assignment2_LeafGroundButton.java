package Week2.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2_LeafGroundButton {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		// Step 3: Load the URL
		driver.get("http://leafground.com/pages/Button.html");

		// Step 4: Maximize the window
		driver.manage().window().maximize();

		// Go to home Page
		System.out.println("Current URL : " + driver.getCurrentUrl());
		driver.findElement(By.xpath("//button[@id ='home']")).click();
		System.out.println("After Pressing Button URL : " + driver.getCurrentUrl());
		
		driver.findElement(By.xpath("//*[@id='post-153']/div[2]/div/ul/li[2]/a/img")).click();

		//driver.get("http://leafground.com/pages/Button.html");

		// Get Position
		System.out.println(
				"X Position: " + driver.findElement(By.xpath("//button[@id ='position']")).getLocation().getX());
		System.out.println(
				"y Position: " + driver.findElement(By.xpath("//button[@id ='position']")).getLocation().getY());
		
		System.out.println("Button Color: "+ driver.findElement(By.xpath("//button[@id='color']")).getCssValue("background-color"));

		System.out.println("Size : "+ driver.findElement(By.xpath("//button[@id='size']")).getSize().getHeight());

	}

}
