package StepDefination;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

import org.apache.log4j.Logger;
import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class InvalidResponseStatusforPastDateAPI {
	
	Response response;
	public static Logger log=Logger.getLogger(InvalidResponseStatusforPastDateAPI.class);
	
	@Given("^Enter below invalid endpoints \"([^\"]*)\" to check response for Past date Exchange API$")
	public void enter_below_invalid_endpoints_to_check_response_for_Past_date_Exchange_API(String url) throws Throwable {
		response = given().when().get(url);
	}

	@When("^Verify the error response for Past Date API as (\\d+)$")
	public void verify_the_error_response_for_Past_Date_API_as(int arg1) throws Throwable {
		assertEquals("Incorrect status code",arg1, response.getStatusCode());
		log.info("Got response with error code"+ response.getStatusCode());
	}

	@Then("^Verify the error messages for Past Date API for \"([^\"]*)\"$")
	public void verify_the_error_messages_for_Past_Date_API_for(String value) throws Throwable {
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
			Assert.assertEquals("{\"error\":\"Symbols 'USD,GBK' are invalid for date 2010-01-12.\"}", responseStringValue);
			log.info(responseStringValue);
		}
		else if(value.contentEquals("base"))
		{
			Assert.assertEquals("{\"error\":\"Base 'USZ' is not supported.\"}", responseStringValue);
			log.info(responseStringValue);
		}
		else 
		{
			Assert.assertEquals("{\"error\":\"Symbols 'GBO' are invalid for date 2010-01-12.\"}", responseStringValue);
			log.info(responseStringValue);
		}
	}
	
	@Given("^Enter endpoints in lowercase in below \"([^\"]*)\" for Past Date Exchange Rates API$")
	public void enter_endpoints_in_lowercase_in_below_for_Past_Date_Exchange_Rates_API(String url) throws Throwable {
		response = given().when().get(url);
	}

	@When("^Verify the error response for case sensitive input for Past Date API as (\\d+)$")
	public void verify_the_error_response_for_case_sensitive_input_for_Past_Date_API_as(int arg1) throws Throwable {
		assertEquals("Incorrect status code",arg1, response.getStatusCode());
		log.info("Got response with error code "+ response.getStatusCode());
	}

	@Then("^Verify the error message for case sensitive inputs$")
	public void verify_the_error_message_for_case_sensitive_inputs() throws Throwable {
		ResponseBody body = response.getBody();
		// Get response body as string
		String responseStringValue = body.asString();

		Assert.assertEquals("{\"error\":\"Symbols 'usd' are invalid for date 2010-01-12.\"}", responseStringValue);
		log.info(responseStringValue);
	}
	
	@Given("^Enter out of range date in Past Date API endpoints \"([^\"]*)\"$")
	public void enter_out_of_range_date_in_Past_Date_API_endpoints(String url) throws Throwable {
		response = given().when().get(url);
	}

	@When("^Verify the error response for out of range date in Past Date API as (\\d+)$")
	public void verify_the_error_response_for_out_of_range_date_in_Past_Date_API_as(int arg1) throws Throwable {
		assertEquals("Incorrect status code",arg1, response.getStatusCode());
		log.info("Got response with error code"+ response.getStatusCode());
	}

	@Then("^Verify the error message out of range date in Past Date API$")
	public void verify_the_error_message_out_of_range_date_in_Past_Date_API() throws Throwable {
		ResponseBody body = response.getBody();
		// Get response body as string
		String responseStringValue = body.asString();

		Assert.assertEquals("{\"error\":\"There is no data for dates older then 1999-01-04.\"}", responseStringValue);
		log.info(responseStringValue);
	}
	
	@Given("^Enter invalid date in Past Date API endpoints \"([^\"]*)\"$")
	public void enter_invalid_date_in_Past_Date_API_endpoints(String url) throws Throwable {
		response = given().when().get(url);
	}

	@When("^Verify the error response for invalid date in Past Date API as (\\d+)$")
	public void verify_the_error_response_for_invalid_date_in_Past_Date_API_as(int arg1) throws Throwable {
		assertEquals("Incorrect status code",arg1, response.getStatusCode());
		log.info("Got response with error code"+ response.getStatusCode());
	}

	@Then("^Verify the error message for invalid date in Past Date API$")
	public void verify_the_error_message_for_invalid_date_in_Past_Date_API() throws Throwable {
		ResponseBody body = response.getBody();
		// Get response body as string
		String responseStringValue = body.asString();

		Assert.assertEquals("{\"error\":\"time data '2010-30-04' does not match format '%Y-%m-%d'\"}", responseStringValue);
		log.info(responseStringValue);
	}

}
