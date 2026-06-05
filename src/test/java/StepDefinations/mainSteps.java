package StepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class mainSteps {

	@Given("User is on netbanking page")
	public void user_is_on_login_Page() {
		System.out.println("User is on netbanking page");

	}

	@When("User login to the application")
	public void User_login_to_the_application() {
		System.out.println("User login to the application");

	}

	@Then("HomePage is displayed")
	public void HomePage_is_displayed() {
		System.out.println("HomePage is displayed");

	}

	@And("cards are displayed")
	public void cards_are_displayed() {
		System.out.println("cards are displayed");

	}
}
