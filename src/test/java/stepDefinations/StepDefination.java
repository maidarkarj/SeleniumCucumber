package stepDefinations;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import e_com.Greenkart.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.it.Data;
import pageObjects.CheckOutPage;


public class StepDefination  {
	
	//public static WebDriver driver;	
	//CheckOutPage cop;
	
	  @Given("^user is on netbanking landing page$") 
	  public void user_is_on_netbanking_landing_page()
	  {
	  System.out.println("navigate to login url"); 
	  }
	  
	  @When("user login into application with {string} and password {string}")
	  public void user_login_into_application_with_and_password(String string, String string2) {
		  System.out.println(string);
		  System.out.println(string2);
	      
	  }
	 
	  @When("^user login into application with username and password$") 
	  public void user_login_into_application_with_username_and_password()
	  {
	  System.out.println("Enter the username and password");
	  }
	  
	  @Then("^home page is populated$") 
	  public void home_page_is_populated() 
	  {
	  System.out.println("home page is populated");
	  }
	  
	  @Then("card are displayed {string}")
	  public void card_are_displayed(String string) {
		  System.out.println(string);
	  }

	  @When("^user sign up with following details$")
	    public void user_sign_up_with_following_details(DataTable data) {
		 List<List<String>> obj= data.asLists();
		System.out.println(obj.get(0).get(0));
		System.out.println(obj.get(0).get(1));
		System.out.println(obj.get(0).get(2));
		System.out.println(obj.get(0).get(3));
		System.out.println(obj.get(0).get(4));
	    }

	   @When("^user login in to application with (.+) and password (.+)$")
	    public void user_login_in_to_application_with_and_password(String username, String password) throws Throwable {
	      System.out.println(username);
	      System.out.println(password);
	    }
	   
	   // Myprofile 
	   
	
	  @Given("^user is My profile page$") public void user_is_my_profile_page()
	  throws Throwable { System.out.println("user is on My profile page "); }
	  
	  @When("^user clicks on personal details$") public void
	  user_clicks_on_personal_details() throws Throwable {
	  System.out.println("user click on personal details "); }
	  
	  @Given("^user validate the Browser$") public void user_validate_the_browser()
	  throws Throwable { System.out.println("alidate the Browser"); }
	  
	  @When("^Browser is Triggered$") public void browser_is_triggered() throws
	  Throwable { System.out.println("Browser is Triggered"); }
	  
	  @Then("^check if browser is Started$") public void
	  check_if_browser_is_started() throws Throwable {
	  System.out.println("Check if browser is started"); }
	  
	
	//@Then("^verify selected \"([^\"]*)\" items are displayed in check out page$")
		//public void verify_selected_something_items_are_displayed_in_check_out_page(String strArg1) throws Throwable {

		//	cop = new CheckOutPage(driver);
		//	Assert.assertTrue(cop.getProductName().getText().contains(strArg1));

//		}
	 

}
