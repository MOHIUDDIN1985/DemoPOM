package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
	WebDriver driver;
    public ElementsPage el;
    public AlertFrameWindows afw;
    
    public void setup() {
    	System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");  	
		driver=new ChromeDriver(); 
		el = new ElementsPage(driver);
		afw =new AlertFrameWindows(driver);
    }
    public void openUrl(String uurl) {
    	driver.get(uurl);
		driver.manage().window().maximize();
		((JavascriptExecutor) driver).executeScript("scroll(0,300)");


    }
    public void scroll(){
        ((JavascriptExecutor) driver).executeScript("scroll(0,300)");

    }
    public void closeBrowser() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
	}

}
