package Fuctionalities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class DriverSetUp {

WebDriver driver;
	
	@BeforeTest
	public void setup() {
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ishahomes.com/");

	}
	
	@AfterClass
	public void TearDown() {
		
		driver.quit();
	}
}
