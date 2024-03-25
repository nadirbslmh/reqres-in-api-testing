package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.user.CreateUser;

public class CreateUserSteps {

    @Steps
    CreateUser createUser;

    @Given("I set API endpoint for create a user")
    public void setApiEndpoint() {
        createUser.setApiEndpoint();
    }

    @When("I send a request to create a user")
    public void sendCreateUserRequest() {
        createUser.sendCreateUserRequest();
    }

    @Then("I receive status code 201")
    public void receiveStatusCode201() {
        createUser.receiveStatusCode201();
    }

    @And("I receive valid data for created user")
    public void receiveValidCreatedUser() {
        createUser.receiveCreatedUserData();
    }

}
