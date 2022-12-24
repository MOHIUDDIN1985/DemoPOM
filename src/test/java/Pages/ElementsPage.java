package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ElementsPage extends BasePage {
	
	
	ElementsPage(WebDriver driver){
		this.driver = driver;
		
	}
	public void clickOnElements() {
		driver.findElement(By.xpath("//h5[text()='Elements']")).click();
	}
	public void clickonTextBox() {
	driver.findElement(By.xpath("//span[text()='Text Box']")).click();
	}
	public void creatAccount(String uname,String email,String address,String Paddress) throws InterruptedException {
		driver.findElement(By.id("userName")).sendKeys(uname);
		Thread.sleep(3000);
		driver.findElement(By.id("userEmail")).sendKeys(email);
		Thread.sleep(3000);
		driver.findElement(By.id("currentAddress")).sendKeys(address);
		Thread.sleep(3000);
		((JavascriptExecutor) driver).executeScript("scroll(0,300)");
		driver.findElement(By.id("permanentAddress")).sendKeys(Paddress);
		Thread.sleep(2000);
		driver.findElement(By.id("submit")).click();
		Thread.sleep(3000);
}
	public void clickCheckbox() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='Check Box']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='rct-checkbox']")).click();
		Thread.sleep(5000);

	}
	public void clickOnRadioButton() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='Radio Button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@for='yesRadio']")).click();
		Thread.sleep(3000);
        driver.findElement(By.xpath("//label[@for='impressiveRadio']")).click();
		Thread.sleep(3000);
        driver.findElement(By.xpath("//label[@for='noRadio']")).click();
		Thread.sleep(3000);
    }
	public void clickonWebTablet(String fname,String Lname,String email,String ag,String Sal,String Dep) throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='Web Tables']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("addNewRecordButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("firstName")).sendKeys(fname);
		Thread.sleep(2000);
		driver.findElement(By.id("lastName")).sendKeys(Lname);
		Thread.sleep(2000);
		driver.findElement(By.id("userEmail")).sendKeys(email);
		Thread.sleep(2000);
		driver.findElement(By.id("age")).sendKeys(ag);
		Thread.sleep(2000);
		driver.findElement(By.id("salary")).sendKeys(Sal);
		Thread.sleep(2000);
		driver.findElement(By.id("department")).sendKeys(Dep);
		Thread.sleep(2000);
		driver.findElement(By.id("submit")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@id='delete-record-4']")).click();
		Thread.sleep(3000);
	}
	
	

}
