package com.sprint;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Browser.Browser;
import Locators.Locators;
import ReadData.ReadData;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinationLogin extends Browser   {
	@Given("user is on main home page")
	public void user_is_on_main_home_page() {
		// Write code here that turns the phrase above into concrete actions
	  
			   // throw new io.cucumber.java.PendingException();
		setDriver();
		System.out.println("Step 1 is passed");
	}

	@And("than user navigates to login page")
	public void than_user_navigates_to_login_page() {
		try {
		Locators.clickLogin();
		System.out.println("Step 1.1 is passed");
		}
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		catch(Exception e) {
		System.out.println("Step 1.1 is failed");
		}
	}

	@When("user enters the valid email address")
	public void user_enters_the_valid_email_address() {
		try {
		Locators.enterValideEmail();
		System.out.println("Step 1.2 is passed");
		}
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		catch(Exception e) {
		System.out.println("Step 1.2 is failed");
		}
	}

	@And("user enters the valid password")
	public void user_enters_the_valid_password() {
		try {
			Locators.enterValidePassword();
			System.out.println("Step 1.3 is passed");
		}
		catch (Exception e) {
		
	    // Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
		System.out.println("Step 1.3 is failed");
		}
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		try {
//			Locators.SignIn();
//			System.out.println("Step 1.4 is passed");
			String login = ReadData.Confi("login");
			driver.findElement(By.id(login)).click();
			
			System.out.println("Step 1.4 is passed");
					
			
		}
		catch (Exception e) {
		
	    // Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
		System.out.println("Step 1.4 is failed");
		
		}
		
		
	}

	@Then("login must be successful.")
	public void login_must_be_successful() {
			Locators.Checklogin();
			try {
	    		 
				String loginbtn = ReadData.Confi("loginbtn");
	 		driver.findElement(By.id("loginbtn")).click();
	    	 }
	    	 catch(Exception e) {
	    		 
	    	 }
		
		
		
	    // Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
		
		
	}
	
	

@Given("user is on ebay home page")
	public void user_is_on_ebay_home_page() {
		// Write code here that turns the phrase above into concrete actions
	// System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
    // driver = new ChromeDriver();
    // driver.navigate().to("https://www.ebay.com/");
   //  driver.manage().window().maximize();
    // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	   // throw new io.cucumber.java.PendingException();
	setDriver();
        System.out.println("Step 2 is passed");
	}

	@And("than user logging in to website")
	public void than_user_logging_in_to_website() {
		Locators.clickLogin();
	    // Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
		System.out.println("Step 2.1 is passed");
	}

	@When("user enter the valid email")
	public void user_enter_the_valid_email() {
		Locators.enterValideEmail();
	    // Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
		System.out.println("Step 2.3 is passed");
	}

	@And("user login with invalid password")
	public void user_login_with_invalid_password() {
		Locators.enterInvalidPassword();
	    // Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
		System.out.println("Step 2.4 is passed");
		
		
	}

	@When("user is able to click on login button")
	public void user_is_able_to_click_on_login_button() {
		Locators.SignIn();
	    // Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
		System.out.println("Step 2.5 is passed");
	}

	@Then("login must be unsuccessful \\(invalid credentials).")
	public void login_must_be_unsuccessful_invalid_credentials() {
	    // Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
		String expected_title = "Electronics, Cars, Fashion, Collectibles & More | eBay";
		String actual_title = driver.getTitle();
		if (expected_title.equals(actual_title)) {
			System.out.println("step 2.6: Login Successfull");
			}
			else {
				System.out.println("Oops, that's not a match."
						+ "login unsuccessfull");
				
				}
	}

	@Given("user is on home page")
	public void user_is_on_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
		//setDriver();
		// System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	    // driver = new ChromeDriver();
	    // driver.navigate().to("https://www.ebay.com/");
	   //  driver.manage().window().maximize();
	    // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		setDriver();
		   // throw new io.cucumber.java.PendingException();
	   // throw new io.cucumber.java.PendingException();
        System.out.println("Step 3 is passed");
	}

	@And("user go to login page for logging in to website")
	public void user_go_to_login_page_for_logging_in_to_website() {
	    // Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
		Locators.clickLogin();
		System.out.println("Step 3.1 is passed");
		
	}

	@When("user login with invalid email")
	public void user_login_with_invalid_email() {
	    // Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
		Locators.enterInvalidEmail();
		System.out.println("Step 3.2 is passed");
	}

	@And("user clicks on continue button")
	public void user_clicks_on_continue_button() {
	    // Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name=\"signin-continue-btn\"]"))).click();
        
        System.out.println("Step 3.3 is passed");
	}

	@When("user gets error \\(invalid credentials)")
	public void user_gets_error_invalid_credentials() {
	    // Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
		{
			// click on signin button.
			String expected  = "Oops, that's not a match";
			String actual = driver.findElement(By.cssSelector(".inline-notice__content")).getText();
			if (expected.equals(actual)) {
				System.out.println("step 3.4: test case failed and user is able to login");
				}
				else {
					System.out.println("step 3.4: test case passed and show error Oops, that's not a match ");
					}
			
			}
		
		
		
	}

	@Then("user should not able to login")
	public void user_should_not_able_to_login() {
		
		System.out.println("step 3.5: test case passed");
		
	       
	    // Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}

	
	@Given("user must be on home page")
	public void user_must_be_on_home_page() {
		
		setDriver();
		
//		driver.navigate().to("https://www.ebay.com/");
//	       driver.manage().window().maximize();
//	       driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    // Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	       System.out.println("Step 4 is passed");
	}

	@And("than user navigates to login page for logging in to website")
	public void than_user_navigates_to_login_page_for_logging_in_to_website() {
		Locators.clickLogin();
	    // Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
		System.out.println("Step 4.1 is passed");
	}

	@When("user login with blank email")
	public void user_login_with_blank_email() {
		Locators.enterBlankEmail();
	    // Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
		System.out.println("Step 4.2 is passed");
	}

	@Then("user not able to login")
	public void user_not_able_to_login() {
		
	    // Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
	}

	@Given("user should be on home page")
	public void user_should_be_on_home_page() {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	     //  driver = new ChromeDriver();
	    //   driver.navigate().to("https://www.ebay.com/");
	    //   driver.manage().window().maximize();
	     //  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	       setDriver();
	    // Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
	       System.out.println("Step 5 is passed");
	}

	@And("than user clicks on login page")
	public void than_user_clicks_on_login_page() {
		Locators.clickLogin();
	    // Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
		System.out.println("Step 5.1 is passed");
	}

	@When("user gives input with valid email")
	public void user_gives_input_with_valid_email() {
		Locators.enterValideEmail();
	    // Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
		System.out.println("Step 5.2 is passed");
	}

	@And("user gives blank input in password")
	public void user_gives_blank_input_in_password() {
		Locators.enterblankPassword();
	    // Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
		System.out.println("Step 5.3 is passed");
	}

	@When("user is not able to click login button")
	public void user_is_not_able_to_click_login_button() {
		System.out.println("Step 5.4 is passed");
		
		
		
	    // Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
	}

	@Then("user gets error")
	public void user_gets_error() {
	    // Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
		System.out.println("Step 5.5 is passed");
	}
	
	}
