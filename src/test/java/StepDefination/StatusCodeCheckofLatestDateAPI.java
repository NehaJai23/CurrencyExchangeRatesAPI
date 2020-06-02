package StepDefination;

import static org.junit.Assert.assertEquals;

import org.apache.log4j.Logger;
import static io.restassured.RestAssured.given;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;

public class StatusCodeCheckofLatestDateAPI {

	public static Logger log=Logger.getLogger(StatusCodeCheckofLatestDateAPI.class);
	Response response;
	
	@Given("^Enter below enpoints \"([^\"]*)\"$")
    public void enter_below_enpoints(String url) throws Throwable {
		response = given().when().get(url);
    }

    @Then("^I get the success response as (\\d+)$")
    public void i_get_the_success_response_as(int arg1) throws Throwable {
    	assertEquals("Incorrect status code",arg1, response.getStatusCode());
    }
	
}
