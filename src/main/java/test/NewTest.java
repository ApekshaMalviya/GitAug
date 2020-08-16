package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest {

	public WebDriver driver;
	 
	  @Test (priority = 0)
	  public void openMyBlog() {
	 driver.get("https://www.softwaretestingmaterial.com/");
	  }
	  
	  @Test (priority =1)
	  public void blog() {
		  driver.findElement(By.xpath("//a[@href=\"https://www.softwaretestingmaterial.com/blog/\"]//span[@itemprop=\"name\"]")).click();
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
