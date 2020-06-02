package StepDefination;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

import org.apache.log4j.Logger;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.response.Response;

public class StatusCodeCheckofPastDateAPI {
	
	public static Logger log=Logger.getLogger(StatusCodeCheckofPastDateAPI.class);
	Response response;

	 @Given("^Enter below past date endpoints \"([^\"]*)\"$")
	 public void enter_below_past_date_endpoints(String url) throws Throwable {
		 response = given().when().get(url);
	 }

	 @Then("^Verify the past date response as (.+)$")
	 public void verify_the_past_date_response_as(int arg) throws Throwable {
		 assertEquals("Incorrect status code",arg, response.getStatusCode());
		 log.info(response.getStatusCode());
	    }
	
}
