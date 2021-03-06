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

public class Topic_02_Xpath_Css {
	WebDriver driver;
	
  @BeforeClass
  public void beforeClass() {
	  driver = new	FirefoxDriver();
	  driver.get("http://live.guru99.com/");
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  }
  @Test
  public void TC_01_CheckUrl() {
	  String homePageUrl= driver.getCurrentUrl();
	  Assert.assertEquals(homePageUrl, "http://live.guru99.com/");
	  
	  
  }
  @Test
  public void TC_02_CheckTitle() {
	  String homePageTitle= driver.getTitle();
	  Assert.assertEquals(homePageTitle, "Home page");
	  
	  
  }
  @Test
  public void TC_03_HomePageLogoDisplayer() {
	  WebElement homePageLogo = driver.findElement(By.xpath("//img[contains(@src, 'logo.png')]"));
	  Assert.assertTrue(homePageLogo.isDisplayed());
	  
	  
  }
  @Test
  public void TC_04_CheckSlackVsGithub() {
	  WebElement homePageLogo = driver.findElement(By.xpath("//img[contains(@src, 'logo.png')]"));
	  Assert.assertTrue(homePageLogo.isDisplayed());
	  
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
	  
  }

}
