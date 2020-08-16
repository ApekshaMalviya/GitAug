package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest2 {

	public WebDriver driver;
	 
	  @Test (priority = 0)
	  public void openMyBlog() {
	 driver.get("https://www.softwaretestingmaterial.com/");
	  }
	  
	  @Test (priority =1)
	  public void Tutorial() {
		  Actions act = new Actions(driver);
		  WebElement ele = driver.findElement(By.xpath("//span[text()='Tutorials']"));
		  act.moveToElement(ele).build().perform();
		  driver.findElement(By.xpath("//li[@id='menu-item-4349']//span[contains(text(),'Manual Testing')]")).click();
	  }
	  
	  
	  @BeforeClass 
	  public void beforeClass() {
	   
		  System.setProperty("webdriver.chrome.driver", "H:\\Selenium\\chromedriver.exe");
	 driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  }
	 
	  @AfterClass
	  public void afterClass() {
	   driver.quit();
	  }

}
