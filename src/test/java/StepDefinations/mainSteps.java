package StepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class mainSteps {

	@Given("User should hit the url")
	public void backgroudkey() {

		System.out.println("first step before every scenario in feature file");
	}

	@When("When User is on netbanking page")
	public void backgroud() {
		System.out.println("When User is on netbanking page");
	}

	@Given("User is on netbanking page")
	public void user_is_on_login_Page() {
		System.out.println("User is on netbanking page");
	}

	@When("^User login to the application with (.+) and password (.+) combi$")
	public void user_login_to_the_application_with_abhijeet_and_password_combi(String name, String pass) {
		System.out.println(name + " " + pass);
	}

	@Then("HomePage is displayed")
	public void HomePage_is_displayed() {
		System.out.println("HomePage is displayed");
	}

	@And("cards are displayed")
	public void cards_are_displayed() {
		System.out.println("cards are displayed");
	}

	@When("User login to the application with {string} and password {string}")
	public void user_login_to_the_application_with_and_password(String string, String string2) {
		// Write code here that turns the phrase above into concrete actions

	}

}
