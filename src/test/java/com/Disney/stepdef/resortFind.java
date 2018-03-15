package com.Disney.stepdef;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.internal.Utils;

import com.Disney.PageObjectFactory.findResort;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class resortFind {

	WebDriver driver;

	@Given("^navigate to the Disney Website$")
	public void navigate_to_the_Disney_Website() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\ChromeWebdriver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://disneyworld.disney.go.com/");

	}

	@And("^Pick a check in$")
	public void pick_a_check_in() throws Throwable {
		// Creating object of the class
		findResort Resort = new findResort(driver);
		Resort.checkInDate().click();

		// This will Click on the date 20th Of March
		List<WebElement> dates = driver.findElements(By.className("ng-binding"));

		int count = driver.findElements(By.className("ng-binding")).size();

		for (int i = 0; i < count; i++) {
			String text = driver.findElements(By.className("ng-binding")).get(i).getText();
			// This will select the date 20 of March in Check in.
			if (text.equalsIgnoreCase("20")) {
				driver.findElements(By.className("ng-binding")).get(i).click();
				break;
			}
		}

	}

	@And("^check out date$")
	public void check_out_date() throws Throwable {
		findResort Resort = new findResort(driver);
		Resort.CheckoutDate().click();

		// This will Click on the date 25th Of March
		List<WebElement> dates = driver.findElements(By.className("ng-binding"));

		int count = driver.findElements(By.className("ng-binding")).size();

		for (int i = 0; i < count; i++) {
			String text = driver.findElements(By.className("ng-binding")).get(i).getText();
			// This will select the date 20 of March in Check in.
			if (text.equalsIgnoreCase("25")) {
				driver.findElements(By.className("ng-binding")).get(i).click();
				break;
			}
		}

	}

	@And("^Pick two adults$")
	public void pick_two_adults() throws Throwable {
		/*findResort Resort = new findResort(driver);
		Resort.AdultPick().click();*/
	}

	@And("^two children$")
	public void two_children() throws Throwable {
		/*findResort Resort = new findResort(driver);
		Resort.Child().click();
		*/

	}

	@And("^Set the ages of the children to Twelve$")
	public void set_the_ages_of_the_children_to_Twelve() throws Throwable {
		/*findResort Resort = new findResort(driver);
		Resort.childAge().click();
		Resort.selectAge("12");*/

	}

	@And("^Setting the children age to Five$")
	public void setting_the_children_age_to_Five() throws Throwable {
		/*findResort Resort = new findResort(driver);
		Resort.childAge().click();
		
		Resort.selectAge("5");*/
	}

	@And("^Make sure All Resort Hotels is selected$")
	public void make_sure_All_Resort_Hotels_is_selected() throws Throwable {
		
	}

	@Then("^Click Find Resort$")
	public void click_Find_Resort() throws Throwable {
		findResort Resort = new findResort(driver);
		
		Resort.clickFindButton().click();
		
	}
	

@When("^Select any resort by name$")
public void select_any_resort_by_name() throws Throwable {
	findResort Resort = new findResort(driver);
	Resort.clickDropName().click();
	Resort.selectName("Name");
}

@When("^Select any available room in the resort$")
public void select_any_available_room_in_the_resort() throws Throwable {
	findResort Resort = new findResort(driver);
	Resort.clickHotel().click();
}

@When("^Select ticket option$")
public void select_ticket_option() throws Throwable {
	findResort Resort = new findResort(driver);
	Actions ticket = new Actions(driver);
	ticket.moveToElement(Resort.ticketHover()).moveToElement(Resort.MagicClick()).click().build().perform();
	
	
}

@When("^Upgrade the tickets to Park Hopper$")
public void upgrade_the_tickets_to_Park_Hopper() throws Throwable {
	findResort Resort = new findResort(driver);
	Resort.clickBlue().click();
}

@When("^On the cart page add ground transportation$")
public void on_the_cart_page_add_ground_transportation() throws Throwable {
	findResort Resort = new findResort(driver);
	
}

@When("^Select Disney?s Magical Express$")
public void select_Disney_s_Magical_Express() throws Throwable {
	findResort Resort = new findResort(driver);
}

@When("^just click done$")
public void just_click_done() throws Throwable {
	findResort Resort = new findResort(driver);
}

@When("^Back on the cart page verify it says Complimentary next to the Ground Transportation line$")
public void back_on_the_cart_page_verify_it_says_Complimentary_next_to_the_Ground_Transportation_line() throws Throwable {
	findResort Resort = new findResort(driver);
}

@When("^Take a screenshot of the cart page$")
public void take_a_screenshot_of_the_cart_page() throws Throwable {
	findResort Resort = new findResort(driver);
	
	//TakesScreenshot - interFace and type cast it so that you can create an object, You cant create object of an interface
	
			TakesScreenshot screenShot = (TakesScreenshot)driver;
			
			//give the Output as in FIle or any other extension
			
			File source = screenShot.getScreenshotAs(OutputType.FILE);
			
			
			//this step will do 2 things one getting the screenShot and saving the file in the specified folder
			
			
			Utils.copyFile(source, new File("./ScreenShot/Os.png"));
}

@When("^Remove all items from the cart$")
public void remove_all_items_from_the_cart() throws Throwable {
	findResort Resort = new findResort(driver);
}

@When("^Take another screenshot$")
public void take_another_screenshot() throws Throwable {
	findResort Resort = new findResort(driver);
}

@Then("^close$")
public void close() throws Throwable {
   
}
	

}
