package tests;

import io.cucumber.java.*;
import io.cucumber.java.en.*;

public class Login {

	@Before(order=0)
	public void setup_0(Scenario scenario) {
		System.out.println("Execution started,Setup_0 "+scenario.getName());
		
	}
	@Before(order=1)
	public void setup_1() {
		System.out.println("Execution started,Setup_1");
		
	}
	@Before(order=2)
	public void setup_2() {
		System.out.println("Execution started,Setup_2");
		
	}
	@BeforeStep
	public void before_tc() {
		System.out.println("TC execution started");
	}
	@Given("User navigates to Login page")
	public void user_navigates_to_login_page() {
		System.out.println("User navigates to Login page");
	}
	
	@When("^User enters valid email address (.+)$")
	public void user_enters_valid_email_address(String email) {
		
		System.out.println("User enters valid email address "+email);
	}
	
	@And("^Enter valid password (.+)$")
	public void enter_valid_password(String password) {
		System.out.println("Enter valid password "+password);
	}
	
	@And("Clicks on Login button")
	public void clicks_on_login_button() {
		System.out.println("Clicks on Login button");
	}
	
	@Then("User should login successfully")
	public void user_should_login_successfully() {
		System.out.println("User should login successfully");
	}
	
	@When("User enters invalid email address {string}")
	public void user_enters_invalid_email_address(String invalidEmail) {
		System.out.println("User enters invalid email address "+invalidEmail);
	}
	
	@And("Enter invalid password {string}")
	public void enter_invalid_password(String invalidPassword) {
		System.out.println("Enter invalid password "+invalidPassword);
	}
	
	@Then("User should get a proper warning message")
	public void user_should_get_a_proper_warning_message() {
		System.out.println("User should get a proper warning message");
	}
	
	@AfterStep
	public void after_tc() {
		System.out.println("TC execution completed");
	}
	
	@After(order=2)
	public void tearDown_2() {

		System.out.println("Execution completed,teardown_2");
	}
	
	@After(order=1)
	public void tearDown_1() {

		System.out.println("Execution completed,teardown_1");
	}	
	
	@After(order=0)
	public void tearDown_0(Scenario scenario) {

		System.out.println("Execution completed,teardown_0 "+scenario.getName());
	}	
	
}
