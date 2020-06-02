package StepDefination;

import static org.junit.Assert.assertEquals;

import org.apache.log4j.Logger;
import org.junit.Assert;

import static io.restassured.RestAssured.given;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class InvalidResponseCheckforLatestDateAPI {

	Response response;
	public static Logger log=Logger.getLogger(InvalidResponseCheckforLatestDateAPI.class);
	
	@Given("^Enter below invalid endpoints \"([^\"]*)\" to check response$")
    public void enter_below_invalid_endpoints_to_check_response(String url) throws Throwable {
		response = given().when().get(url);
    }

	@When("^I get error response as (\\d+)$")
    public void i_get_error_response_as(int arg1) throws Throwable {
		assertEquals("Incorrect status code",arg1, response.getStatusCode());
		log.info("Got response with error code"+ response.getStatusCode());
    }

    @Then("^I am able to verify details \"([^\"]*)\"$")
    public void i_am_able_to_verify_details(String value) throws Throwable {    	
    	ResponseBody body = response.getBody();
		// Get response body as string
		String responseStringValue = body.asString();
		
		if(value.contentEquals("invalid api"))
		{
			Assert.assertEquals("{\"error\":\"time data 'ap' does not match format '%Y-%m-%d'\"}", responseStringValue);
			log.info(responseStringValue);
		}
		else if(value.contentEquals("Symbols"))
		{
			Assert.assertEquals("{\"error\":\"Symbols 'USD,GBK' are invalid for date 2020-06-02.\"}", responseStringValue);
			log.info(responseStringValue);
		}
		else if(value.contentEquals("base"))
		{
			Assert.assertEquals("{\"error\":\"Base 'USZ' is not supported.\"}", responseStringValue);
			log.info(responseStringValue);
		}
		else 
		{
			Assert.assertEquals("{\"error\":\"Base 'USI' is not supported.\"}", responseStringValue);
			log.info(responseStringValue);
		}
			
    }
    
    @Given("^Enter endpoints in lowercase in below \"([^\"]*)\"$")
    public void enter_endpoints_in_lowercase_in_below(String url) throws Throwable {
    	response = given().when().get(url);
    }

    @When("^I get the error response as (\\d+)$")
    public void i_get_the_error_response_as(int arg1) throws Throwable {
    	assertEquals("Incorrect status code",arg1, response.getStatusCode());
		log.info("Got response with error code"+ response.getStatusCode());
    }

    @Then("^Verify the error message$")
    public void verify_the_error_message() throws Throwable {
    	ResponseBody body = response.getBody();
		// Get response body as string
		String responseStringValue = body.asString();

		Assert.assertEquals("{\"error\":\"Symbols 'usd' are invalid for date 2020-06-02.\"}", responseStringValue);
		log.info(responseStringValue);

    }
	
}
