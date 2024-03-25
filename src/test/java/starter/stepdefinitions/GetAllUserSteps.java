package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.user.GetAllUser;

public class GetAllUserSteps {

    @Steps
    GetAllUser getAllUser;

    @Given("I set API endpoint for get all user")
    public void setApiEndpoint() {
        getAllUser.setApiEndpoint();
    }

    @When("I send a request to get all user")
    public void sendGetAllUserRequest() {
        getAllUser.sendGetAllUserRequest();
    }

    @Then("I receive status code 200")
    public void receiveStatusCode200() {
        getAllUser.receiveStatusCode200();
    }

    @And("I receive valid data for all user")
    public void receiveValidAllUserData() {
        getAllUser.receiveValidAllUserData();
    }

}
