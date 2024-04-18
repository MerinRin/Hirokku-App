package Fuctionalities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AddAndRemove extends DriverSetUp{

	@Test
	public void add() throws InterruptedException {

		driver.findElement(By.linkText("Add/Remove Elements")).click();
		
		Thread.sleep(5000);
		for(int i=0; i<5; i++) {
			driver.findElement(By.xpath("//button[contains(text(),'Add Element')]")).click();
		}
		
	}
	
	@Test
	public void delete() throws InterruptedException{
		/*
		List<WebElement> elements= driver.findElements(By.className("added-manually")); 
		for(int j=0; j<2; j++) {
		WebElement elem= elements.get(j);
		elem.click();}
		Thread.sleep(5000);*/
		for(int j=0; j<5; j++) {
		driver.findElement(By.xpath("//button[contains(text(),'Delete')]")).click();
		}
		Thread.sleep(5000);
	}
	
	
}
