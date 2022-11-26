package exercise3;


import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class info6105RegressionTest {
 
	WebDriver driver;
	
  @Test
  public void launchBrower() {
	  driver.get("http://localhost:8080/info6105-demo/");
	  assertEquals(driver.getTitle(), "Login Page");
  }
  
  @Test
  public void submit_form() {
	 /* driver.findElement(By.id("user")).sendKeys("shaldar");
	  driver.findElement(By.id("password")).sendKeys("test");
	  driver.findElement(By.xpath("//div[@type='submit']")).submit();
	  */
	  
	  driver.findElement(By.id("user")).sendKeys("shaldar");
	  driver.findElement(By.id("password")).sendKeys("test");
	  driver.findElement(By.xpath("//input[@type='submit']")).submit();
  }
  
  @BeforeTest
  public void beforeTest() {
	 // System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
  }
  

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
