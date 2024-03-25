package starter.user;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;

public class GetAllUser {
    private static String url = "https://reqres.in/api/";

    @Step("I set API endpoint for get all user")
    public String setApiEndpoint() {
        return url + "users?page=2";
    }

    @Step("I send a request to get all user")
    public void sendGetAllUserRequest() {
        SerenityRest.given()
                .get(setApiEndpoint());
    }

    @Step("I receive status code 200")
    public void receiveStatusCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid data for all user")
    public void receiveValidAllUserData() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.GET_ALL_USER_SCHEMA);

        restAssuredThat(response -> response.body("'page'", notNullValue()));
        restAssuredThat(response -> response.body("'per_page'", notNullValue()));
        restAssuredThat(response -> response.body("'total'", notNullValue()));
        restAssuredThat(response -> response.body("'total_pages'", notNullValue()));
        restAssuredThat(response -> response.body("'data'", notNullValue()));

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
}
