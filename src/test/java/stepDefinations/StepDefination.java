package stepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
public class StepDefination 
{
	@Given("^User is on Netbanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
       System.out.println("User is on Netbanking landing page");
    }

    @When("^User login into applicaion with username and password$")
    public void user_login_into_applicaion_with_username_and_password() throws Throwable {
        System.out.println("User login into applicaion with username and password");
    }
    
    @When("^User login into applicaion with \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_into_applicaion_with_something_and_password_something(String strArg1, String strArg2) throws Throwable {
        
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
        System.out.println("Home page is populated");
    }

    @And("^Cards are displayed$")
    public void cards_are_displayed() throws Throwable {
        System.out.println("Cards are displayed");
    }
	
}
