package Locators;

import Browser.Browser;
import ReadData.ReadData;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Locators extends Browser {
	
	
	public static void clickLogin() {
		driver.navigate().to("https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&ru=https%3A%2F%2Fwww.ebay.com%2F");
	     
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     driver.manage().window().maximize();
	     
	     
	}
	
	public static void enterValideEmail() {
 		// checking for valid user user name.
        driver.findElement(By.name("userid")).sendKeys("Rugrbtec@gmail.com");
        
        WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name=\"signin-continue-btn\"]"))).click();
        
        WebElement m=driver.findElement(By.name("signin-continue-btn"));
        m.click();
	}
	
	
	public static void enterValidePassword() {
		// checking for valid pswd.
		WebDriverWait wait1 = new WebDriverWait(driver, 25);
        WebElement element1 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='pass']")));
        element1.click();
        
        element1.sendKeys("Rajendra@1");
        
        WebDriverWait wait11 = new WebDriverWait(driver, 25);
		
	}
 	
     public static void SignIn() {
 		// click on signing button.
    	 
 		driver.findElement(By.id("sgnBt")).click();
 	
 	}
 
     
	public static void enterBlankEmail() {
		// checking for valid user user name.
        driver.findElement(By.name("userid")).sendKeys("");
        
        WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name=\"signin-continue-btn\"]"))).click();
        
        WebElement m=driver.findElement(By.name("signin-continue-btn"));
        m.click();
	}
	
	public static void enterInvalidEmail() {
		// checking for valid user user name.
        driver.findElement(By.name("userid")).sendKeys("Brijesh@gmail.com");
        WebDriverWait wait = new WebDriverWait(driver, 30);
        
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name=\"signin-continue-btn\"]"))).click();
		WebElement m=driver.findElement(By.name("signin-continue-btn"));
        m.click();
        
	}
	
		
	
	public static void enterblankPassword() {
		// checking for valid pswd.
		WebDriverWait wait1 = new WebDriverWait(driver, 25);
        WebElement element1 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='pass']")));
        element1.click();
        
        element1.sendKeys(" ");
        
        WebDriverWait wait11 = new WebDriverWait(driver, 25);
		
	}
	
	public static void enterInvalidPassword() {
		// checking for valid pswd.
		WebDriverWait wait1 = new WebDriverWait(driver, 25);
        WebElement element1 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='pass']")));
        element1.click();
        
        element1.sendKeys("BRIjrdh");
        
        WebDriverWait wait11 = new WebDriverWait(driver, 25);
		
	}
	
	
	
	public static void Checklogin() {
		// click on signin button.
		String expected_title = "Electronics, Cars, Fashion, Collectibles & More | eBay";
		String actual_title = driver.getTitle();
		if (expected_title.equals(actual_title)) {
			System.out.println("Login Successfull");
			}
			else {
				System.out.println("Login failed");
				}
		
		}
	
	}



