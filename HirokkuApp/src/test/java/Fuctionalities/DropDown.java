package Fuctionalities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown extends DriverSetUp{

	@Test
	public void drop() {
		
		driver.findElement(By.linkText("Dropdown")).click();
		WebElement dropdown= driver.findElement(By.id("dropdown"));
		
		Select select = new Select(dropdown);
		select.selectByVisibleText("Option 2");
		
	}
	
}
