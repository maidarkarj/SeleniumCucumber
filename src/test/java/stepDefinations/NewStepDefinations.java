package stepDefinations;

import java.sql.Driver;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import e_com.Greenkart.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CheckOutPage;
import pageObjects.HomePage;

public class NewStepDefinations {

	public static WebDriver driver;

	HomePage hp;
	CheckOutPage cop;

	@Given("^user is on greenkart landing page$")
	public void user_is_on_greenkart_landing_page() throws Throwable {

		driver = Base.getDriver();

	}

	@When("^user searched for \"([^\"]*)\" vegetable$")
	public void user_searched_for_something_vegetable(String strArg1) throws Throwable {

		hp = new HomePage(driver);
		hp.getSearch().sendKeys(strArg1);
		Thread.sleep(3000);

	}

	@Then("^\"([^\"]*)\" result is displayed$")
	public void something_result_is_displayed(String strArg1) throws Throwable {

		Assert.assertTrue(driver.findElement(By.cssSelector("h4.product-name")).getText().contains(strArg1));

	}

	/*
	 * @Then("^verify selected \"([^\"]*)\" items are displayed in check out page$")
	 * public void
	 * verify_selected_something_items_are_displayed_in_check_out_page(String
	 * strArg1) throws Throwable { cop = new CheckOutPage(driver);
	 * Assert.assertTrue(cop.getProductName().getText().contains(strArg1));
	 * 
	 * }
	 */

	@And("^added item to cart$")
	public void added_item_to_cart() throws Throwable {

		hp.getIncrement().click();
		hp.addToCart().click();

	}

	@And("^user proceeded to checkout page for checkout$")
	public void user_proceeded_to_checkout_page_for_checkout() throws Throwable {

		hp.viewTheItem().click();
		hp.proceedToCheckout().click();

	}
	
	 @When("^user searched for (.+)vegetables$")
	    public void user_searched_for_vegetables(String names) throws Throwable {
		 
		 hp = new HomePage(driver);
			hp.getSearch().sendKeys(names);
			Thread.sleep(3000);
	        
	    }

	    @Then("^verify selected (.+) items are displayed in check out page$")
	    public void verify_selected_items_are_displayed_in_check_out_page(String names) throws Throwable {
	    	 cop = new CheckOutPage(driver);
	    	 Assert.assertTrue(cop.getProductName().getText().contains(names));
	       
	    }
}
