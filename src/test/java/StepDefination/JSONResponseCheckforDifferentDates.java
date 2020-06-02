package StepDefination;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.Map;

import org.apache.log4j.Logger;
import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class JSONResponseCheckforDifferentDates {

	Response response;

    public static Logger log = Logger.getLogger(JSONResponseCheckofLatestDateAPI.class);
	
	@Given("^Enter below \"([^\"]*)\" to check response$")
	public void enter_below_to_check_response(String url) throws Throwable {
		response = given().when().get(url);
	}

	@When("^Verify the response as (\\d+) for future date inputs$")
	public void verify_the_response_as_for_future_date_inputs(int arg1) throws Throwable {
		assertEquals("Incorrect status code", arg1, response.getStatusCode());
	}

	@Then("^Verify the response for future date inputs")
	public void verify_the_response_for_future_date_inputs() throws Throwable {
		// Get response body
		ResponseBody body = response.getBody();
		// Get response body as string
		String responseStringValue = body.asString();
		// Validate body if it has specific values
		log.info(responseStringValue);

		String base = response.jsonPath().getString("base");
		String date = response.jsonPath().getString("date");
		Map<String, String> rates = response.jsonPath().getMap("rates");
		log.info("base>" + base);

		log.info(rates.get("USD"));
		log.info(rates.get("GBP"));
		
		log.info("date >" + date);
		
		Assert.assertEquals("EUR", base);
		
		LocalDate todaydate = LocalDate.now();
		
		Assert.assertEquals("Response date is incorrect", todaydate, date);
		log.info("Today date >" + todaydate);
	}

	@Given("^Enter below \"([^\"]*)\" to check response for any Saturday date inputs$")
	public void enter_below_to_check_response_for_any_Saturday_date_inputs(String url) throws Throwable {
		response = given().when().get(url);
	}

	@When("^Verify the response as (\\d+) for any Saturday date inputs$")
	public void verify_the_response_as_for_any_Saturday_date_inputs(int arg1) throws Throwable {
		assertEquals("Incorrect status code", arg1, response.getStatusCode());
	}

	@Then("^Verify the response for any Saturday date inputs$")
	public void verify_the_response_for_any_Saturday_date_inputs() throws Throwable {
		// Get response body
		ResponseBody body = response.getBody();
		// Get response body as string
		String responseStringValue = body.asString();
		// Validate body if it has specific values
		log.info(responseStringValue);

		String base = response.jsonPath().getString("base");
		String date = response.jsonPath().getString("date");
		Map<String, String> rates = response.jsonPath().getMap("rates");
		log.info("base>" + base);

		log.info(rates.get("USD"));
		log.info(rates.get("GBP"));
		
		log.info("date >" + date);
		
		Assert.assertEquals("EUR", base);
		
		String FridayDate="2020-05-29";
		
		Assert.assertEquals("Response date is incorrect", FridayDate, date);
		log.info("Friday date >" + FridayDate);
}

	@Given("^Enter below \"([^\"]*)\" to check response for any Sunday date inputs$")
	public void enter_below_to_check_response_for_any_Sunday_date_inputs(String url) throws Throwable {
		response = given().when().get(url);
	}

	@When("^Verify the response as (\\d+) for any Sunday date inputs$")
	public void verify_the_response_as_for_any_Sunday_date_inputs(int arg1) throws Throwable {
		assertEquals("Incorrect status code", arg1, response.getStatusCode());
	}

	@Then("^Verify the response for any Sunday date inputs$")
	public void verify_the_response_for_any_Sunday_date_inputs() throws Throwable {
		// Get response body
		ResponseBody body = response.getBody();
		// Get response body as string
		String responseStringValue = body.asString();
		// Validate body if it has specific values
		log.info(responseStringValue);

		String base = response.jsonPath().getString("base");
		String date = response.jsonPath().getString("date");
		Map<String, String> rates = response.jsonPath().getMap("rates");
		log.info("base>" + base);

		log.info(rates.get("USD"));
		log.info(rates.get("GBP"));
		
		log.info("date >" + date);
		
		Assert.assertEquals("EUR", base);
		
		String FridayDate="2020-05-29";
		
		Assert.assertEquals("Response date is incorrect", FridayDate, date);
		log.info("Friday date >" + FridayDate);
}

}
