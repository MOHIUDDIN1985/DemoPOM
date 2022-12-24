package Pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class AlertFrameWindows extends BasePage {
	String Alart = "//h5[text()='Alerts, Frame & Windows']";
	String windowButton ="//span[text()='Browser Windows']";
	String tabButton = "tabButton";
	
	AlertFrameWindows(WebDriver driver){
		this.driver = driver;
	}
	
	public void clickOnAlertFrame() throws InterruptedException {
		driver.findElement(By.xpath(Alart)).click();
		Thread.sleep(2000);
        scroll();	
        }
	public void clickonwindow() throws InterruptedException {
		driver.findElement(By.xpath(windowButton)).click();
		Thread.sleep(3000);
		driver.findElement(By.id("tabButton")).click();
		ArrayList<String> windows = new ArrayList(driver.getWindowHandles());
		driver.switchTo().window(windows.get(1));
		System.out.println(driver.findElement(By.id("sampleHeading")).getText());
		Thread.sleep(3000);


	}

}
