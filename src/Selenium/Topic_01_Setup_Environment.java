package Selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Topic_01_Setup_Environment {
	WebDriver driver;
	
  @BeforeClass
  public void beforeClass() {
	  driver = new	FirefoxDriver();
	  driver.get("http://live.guru99.com/index.php/customer/account/login/");
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  }

	  
  
  @Test
  public void TC_01_Xpath_Example() {
	  driver.findElement(By.id("email")).sendKeys("");
	  
	
//	  <input id="email" class="input-text required-entry validate-email" 
//	  type="email" title="Email Address" value="" name="login[username]" spellcheck="false" 
//	  autocorrect="off" autocapitalize="off"/>
	  
//	driver.findElement(By.className("input-text required-entry validate-email"));
//	driver.findElement(By.id("email"));
//	driver.findElement(By.cssSelector("input[id='email']"));
//	driver.findElement(By.name("login[username]"));
//	driver.findElement(By.linkText(""));
//	driver.findElement(By.partialLinkText(""));
//	driver.findElement(By.xpath("//input[@id='email']"));
//	driver.findElement(By.tagName("input"));
//	
///*	<a title="Site Map" href="http://live.guru99.com/index.php/catalog/seo_sitemap/category/">Site Map</a>*/
//	
//	driver.findElement(By.linkText("Site Map"));
//	driver.findElement(By.partialLinkText("Site"));
//	driver.findElement(By.partialLinkText("Map"));
	
	
	  
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
	  
  }

}
