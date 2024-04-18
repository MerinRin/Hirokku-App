package Fuctionalities;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop extends DriverSetUp{

	@Test
	public void dd() {
		
		driver.findElement(By.linkText("Drag and Drop")).click();
		WebElement A= driver.findElement(By.id("column-a"));
		WebElement B= driver.findElement(By.id("column-b"));
		
		
		//actions class used for draganddrop, rightclick, clickandhold, movetoelement etc
		Actions ac= new Actions(driver);
		ac.dragAndDrop(B, A).perform();
	}
	
}
