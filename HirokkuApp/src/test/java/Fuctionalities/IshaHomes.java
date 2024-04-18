package Fuctionalities;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;

public class IshaHomes extends DriverSetUp{

	@Test
	public void count(){
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,750)");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> elem= driver.findElements(By.xpath("//span[@class='elementor-counter-number']"));
		
		for (WebElement element:elem) {
			 String count= element.getAttribute("data-to-value");
			 System.out.println(count);
		}
	}
	
	@Test
	public void topMenu() {
		
		driver.findElement(By.xpath("//a[text()='About us']")).click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		String text= driver.findElement(By.xpath("//h2[text()='ABOUT ISHA HOMES']")).getText();		
		Assert.assertEquals(text, "ABOUT ISHA HOMES");
		
	}
}
