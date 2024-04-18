package Fuctionalities;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class Windows extends DriverSetUp{

	@Test
	public void multipleWindow() throws InterruptedException {
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,3500)");
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.linkText("Click Here")).click();
		
		String mainwindowhandle= driver.getWindowHandle();
		
		for(String handle :driver.getWindowHandles()) {
			if(!handle.equals(mainwindowhandle)) {
				driver.switchTo().window(handle);
				break;
			}
		}
		
		String text= driver.findElement(By.xpath("//div[@class='example']")).getText();
		System.out.println(text);
		
		Thread.sleep(3000);
		
	}
	
}
