package Selenium;

import org.testng.annotations.Test;

import com.sun.org.apache.xerces.internal.impl.xpath.XPath;

import org.testng.annotations.BeforeClass;

import static org.junit.Assert.assertTrue;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;



public class Topic_01_Setup_Environment {
	WebDriver driver;
	
	
  @BeforeClass
  public void beforeClass() {
	  
//	  System.setProperty("webdriver.chrome.driver", ".\\lib\\chromedrive.exe");
//	  driver =new ChromeDriver();
	  
	  driver = new	FirefoxDriver();
	  
  
	  //driver.get("http://live.guru99.com/index.php/customer/account/create/");
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  }

	  
  
//  @Test
//  public void TC_01_Xpath_Example() throws Exception {
//	  //id
//	  driver.findElement(By.id("email")).sendKeys("automationid@gmail.com");
//	  Thread.sleep(2000);
//	  driver.findElement(By.id("email")).clear();
//	  
//	  //Xpath
//	  driver.findElement(By.xpath("//input[@id='email']")).sendKeys("automationxpath@gmail.com");
//	  Thread.sleep(2000);
//	  driver.findElement(By.xpath("//input[@id='email']")).clear();
//	
//	  //class
//	  driver.findElement(By.className("validate-email")).sendKeys("automationclass@gmail.com");
//	  Thread.sleep(2000);
//	  driver.findElement(By.className("validate-email")).clear();
//	  
//	  //Xpath
//	  driver.findElement(By.xpath("//input[@class='input-text required-entry validate-email']")).sendKeys("automationcxpath@gmail.com");
//	  Thread.sleep(2000);
//	  driver.findElement(By.xpath("//input[@class='input-text required-entry validate-email']")).clear();	
//	  
//	  //name
//	  driver.findElement(By.name("login[username]")).sendKeys("automationname@gmail.com");
//	  Thread.sleep(2000);
//	  driver.findElement(By.name("login[username]")).clear();
//	  
//	  //Xpath
//	  driver.findElement(By.xpath("//input[@name='login[username]']")).sendKeys("automationxpath@gmail.com");
//	  Thread.sleep(2000);
//	  driver.findElement(By.xpath("//input[@name='login[username]']")).clear();
//	  
//  }
  
//  @Test
//	public void TC_02_Selenium() throws Exception {
//	  driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Selenium Advanced Online");;
//	  Thread.sleep(3000);
//	
//	  driver.findElement(By.xpath("//input[@title='First Name']")).sendKeys("First name");;
//	  Thread.sleep(3000);
//	
//	  driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Tran Trung ");;
//	  Thread.sleep(3000);
//	
//}
//  @Test
//	public void TC_01_LoginEmpty() throws Exception {
//	  driver.get("http://live.guru99.com/");
//	  driver.findElement(By.xpath("//div[@class='footer']//a[text()='My Account']")).click();
//	  
//	  driver.findElement(By.id("email")).sendKeys("");
//	  driver.findElement(By.name("login[password]")).sendKeys("");
//	  driver.findElement(By.xpath("//button[@title='Login']")).click();
//	  Thread.sleep(3000);
//	  
//	  String EmailErrorMessage = driver.findElement(By.id("advice-required-entry-email")).getText();
//	  Assert.assertEquals(EmailErrorMessage, "This is a required field.");
//	  
//	  String PassWordErrorMessage = driver.findElement(By.id("advice-required-entry-pass")).getText();
//	  Assert.assertEquals(PassWordErrorMessage, "This is a required field.");
//	  
//  }
//  
//  @Test
//	public void TC_02_LoginWithEmailInvalid() throws Exception {
//	  driver.get("http://live.guru99.com/");
//	  driver.findElement(By.xpath("//div[@class='footer']//a[text()='My Account']")).click();
//	  
//	  driver.findElement(By.id("email")).sendKeys("123434234@12312.123123");
//	  driver.findElement(By.name("login[password]")).sendKeys("");
//	  driver.findElement(By.xpath("//button[@title='Login']")).click();
//	  
//	  Thread.sleep(3000);
//	  
//	  String emailErrorMessage = driver.findElement(By.id("advice-validate-email-email")).getText();
//	  Assert.assertEquals(emailErrorMessage, "Please enter a valid email address. For example johndoe@domain.com.");
//	  
//}
//  
//  @Test
//	public void TC_03_LoginWithPassWordLessSixCharacter() throws Exception {
//	  driver.get("http://live.guru99.com/");
//	  driver.findElement(By.xpath("//div[@class='footer']//a[text()='My Account']")).click();
//	  
//	  driver.findElement(By.id("email")).sendKeys("automation@gmail.com");
//	  driver.findElement(By.name("login[password]")).sendKeys("123");
//	  driver.findElement(By.xpath("//button[@title='Login']")).click();
//	  
//	  Thread.sleep(3000);
//	  
//	  String emailErrorMessage = driver.findElement(By.id("advice-validate-password-pass")).getText();
//	  Assert.assertEquals(emailErrorMessage, "Please enter 6 or more characters without leading or trailing spaces."); 
//	  
//}
//  
//  @Test
//	public void TC_04_LoginWithPassWordIncorrect() throws Exception {
//	  driver.get("http://live.guru99.com/");
//	  driver.findElement(By.xpath("//div[@class='footer']//a[text()='My Account']")).click();
//	  
//	  driver.findElement(By.id("email")).sendKeys("automation@gmail.com");
//	  driver.findElement(By.name("login[password]")).sendKeys("12345678900");
//	  driver.findElement(By.xpath("//button[@title='Login']")).click();
//	  
//	  Thread.sleep(3000);
//	  
//	  String emailErrorMessage = driver.findElement(By.xpath("//div[@class='account-login']//span[text()='Invalid login or password.']")).getText();
//	  Assert.assertEquals(emailErrorMessage, "Invalid login or password.");
//	  
//}
  
  @Test
	public void TC_05_CreatAnAccount() throws Exception {
	  
	  
	  driver.get("http://live.guru99.com/");
	  driver.findElement(By.xpath("//div[@class='footer']//a[text()='My Account']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//div[@class='main-container col1-layout']//a[@title='Create an Account']")).click();
	  
	  driver.findElement(By.id("firstname")).sendKeys("Tran");
	  Thread.sleep(2000);
	  driver.findElement(By.id("middlename")).sendKeys("Trung");
	  Thread.sleep(2000);
	  driver.findElement(By.id("lastname")).sendKeys("Kien");
	  Thread.sleep(2000);
	  driver.findElement(By.id("email_address")).sendKeys("TTK"+ randomNumber() +"@gmail.com");
	  Thread.sleep(2000);
	  driver.findElement(By.id("password")).sendKeys("12345678");
	  Thread.sleep(2000);
	  driver.findElement(By.id("confirmation")).sendKeys("12345678");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//div[@class='account-create']//input[@id='is_subscribed']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//div[@class='main-container col1-layout']//button[@title='Register']")).click();
	  Thread.sleep(2000);	  
	  
	  String emailErrorMessage = driver.findElement(By.xpath("//div[@class='main-container col2-left-layout']//span[text()='Thank you for registering with Main Website Store.']")).getText();
	  Assert.assertEquals(emailErrorMessage, "Thank you for registering with Main Website Store.");
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//div[@id='header-account']//a[@title='Log Out']")).click();
	  Thread.sleep(2000);	  
	  
}

  
	  
	  
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
	
	
	  
	  
  

  @AfterClass
  public void afterClass() {
	  driver.quit();
	  
  }

  public int randomNumber() {
	  Random rd = new Random();
	  return rd.nextInt(999999);
	  
  }
  
}
