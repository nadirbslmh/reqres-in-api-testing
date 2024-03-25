package starter.user;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteUser {
    private static String url  = "https://reqres.in/api/";

    @Step("I set API endpoint for delete user")
    public String setApiEndpoint() {
        return url + "users/2";
    }

    @Step("I send a request to delete a user")
    public void sendDeleteUserRequest() {
        SerenityRest.given()
                .delete(setApiEndpoint());
    }

    @Step("I receive status code 204")
    public void receiveStatusCode204() {
        restAssuredThat(response -> response.statusCode(204));
    }
}
