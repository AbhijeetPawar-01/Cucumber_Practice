package StepDefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before(" @SmokeTest")
	public void User_should_hit_the_url() {

		System.out.println("**************");
	}

	@After
	public void tearDown() {
		System.out.println("cleat or quit");
	}
}
