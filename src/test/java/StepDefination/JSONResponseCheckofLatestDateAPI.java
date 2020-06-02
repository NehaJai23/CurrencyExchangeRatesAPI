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

public class JSONResponseCheckofLatestDateAPI {
    Response response;

    public static Logger log = Logger.getLogger(JSONResponseCheckofLatestDateAPI.class);
    
    @Given("^Enter below url with valid symbol endpoint \"([^\"]*)\"$")
    public void enter_below_url_with_valid_symbol_enpoint(String url) throws Throwable {
		response = given().when().get(url);
    }

	@When("^I get Symbol API response as (\\d+)$")
	public void i_get_symbol_api_response_as(int arg1) throws Throwable {
		assertEquals("Incorrect status code", arg1, response.getStatusCode());

	}
	
	@Then("^Verify the Symbol JSON response$")
	public void verify_the_symbol_json_response() {

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
		
		log.info("date > " + date);
		Assert.assertEquals("EUR", base);
		Assert.assertNotNull(rates.get("USD"));
		Assert.assertNotNull(rates.get("GBP"));
		
		LocalDate todaydate = LocalDate.now();
		Assert.assertEquals("Response date is incorrect", todaydate, date);
	}
	
	 @Given("^Enter below url with valid Base endpoint \"([^\"]*)\"$")
	    public void enter_below_url_with_valid_base_enpoint(String url) throws Throwable {
			response = given().when().get(url);
	    }

		@When("^I get Base API response as (\\d+)$")
		public void i_get_base_api_response_as(int arg1) throws Throwable {
			assertEquals("Incorrect status code", arg1, response.getStatusCode());

		}
		
		@Then("^Verify the Base JSON response$")
		public void verify_the_base_json_response() {

			// Get response body
			ResponseBody body = response.getBody();
			// Get response body as string
			String responseStringValue = body.asString();
			// Validate body if it has specific values
			log.info(responseStringValue);

			String base = response.jsonPath().getString("base");
			String date = response.jsonPath().getString("date");
			Map<String, String> rates = response.jsonPath().getMap("rates");
			log.info("base >" + base);

			
			log.info(rates.get("GBP"));
			log.info(rates.get("HKD"));
			log.info(rates.get("IDR"));
			log.info(rates.get("ILS"));
			log.info(rates.get("DKK"));
			log.info(rates.get("INR"));
			log.info(rates.get("CHF"));
			log.info(rates.get("MXN"));
			log.info(rates.get("CZK"));
			log.info(rates.get("SGD"));
			log.info(rates.get("THB"));
			log.info(rates.get("HRK"));
			log.info(rates.get("EUR"));
			log.info(rates.get("MYR"));
			log.info(rates.get("NOK"));
			log.info(rates.get("CNY"));
			log.info(rates.get("BGN"));
			log.info(rates.get("PHP"));
			log.info(rates.get("PLN"));
			log.info(rates.get("ZAR"));
			log.info(rates.get("CAD"));
			log.info(rates.get("ISK"));
			log.info(rates.get("BRL"));
			log.info(rates.get("RON"));
			log.info(rates.get("NZD"));
			log.info(rates.get("TRY"));
			log.info(rates.get("JPY"));
			log.info(rates.get("RUB"));
			log.info(rates.get("KRW"));
			log.info(rates.get("USD"));
			log.info(rates.get("HUF"));
			log.info(rates.get("AUD"));
			log.info(rates.get("SEK"));
			
			log.info("date >" + date);
			
			Assert.assertEquals("USD", base);
			
			Assert.assertNotNull(rates.get("GBP"));
			Assert.assertNotNull(rates.get("HKD"));
			Assert.assertNotNull(rates.get("IDR"));
			Assert.assertNotNull(rates.get("ILS"));
			Assert.assertNotNull(rates.get("DKK"));
			Assert.assertNotNull(rates.get("INR"));
			Assert.assertNotNull(rates.get("CHF"));
			Assert.assertNotNull(rates.get("MXN"));
			Assert.assertNotNull(rates.get("CZK"));
			Assert.assertNotNull(rates.get("SGD"));
			Assert.assertNotNull(rates.get("THB"));
			Assert.assertNotNull(rates.get("HRK"));
			Assert.assertNotNull(rates.get("EUR"));
			Assert.assertNotNull(rates.get("MYR"));
			Assert.assertNotNull(rates.get("NOK"));
			Assert.assertNotNull(rates.get("CNY"));
			Assert.assertNotNull(rates.get("BGN"));
			Assert.assertNotNull(rates.get("PHP"));
			Assert.assertNotNull(rates.get("SEK"));
			Assert.assertNotNull(rates.get("PLN"));
			Assert.assertNotNull(rates.get("ZAR"));
			Assert.assertNotNull(rates.get("CAD"));
			Assert.assertNotNull(rates.get("ISK"));
			Assert.assertNotNull(rates.get("BRL"));
			Assert.assertNotNull(rates.get("RON"));
			Assert.assertNotNull(rates.get("NZD"));
			Assert.assertNotNull(rates.get("TRY"));
			Assert.assertNotNull(rates.get("JPY"));
			Assert.assertNotNull(rates.get("RUB"));
			Assert.assertNotNull(rates.get("KRW"));
			Assert.assertNotNull(rates.get("USD"));
			Assert.assertNotNull(rates.get("HUF"));
			Assert.assertNotNull(rates.get("AUD"));

			LocalDate todaydate = LocalDate.now();
			Assert.assertEquals("Response date is incorrect", todaydate, date);
		}
		
	    @Given("^Enter below url with valid Symbol and Base endpoint \"([^\"]*)\"$")
	    public void enter_below_url_with_valid_symbol_and_base_enpoint(String url) throws Throwable {
			response = given().when().get(url);
	    }

		@When("^I get Symbol and Base API response as (\\d+)$")
		public void i_get_symbol_and_base_api_response_as(int arg1) throws Throwable {
			assertEquals("Incorrect status code", arg1, response.getStatusCode());

		}
		
		@Then("^Verify the Symbol and Base API JSON response$")
		public void verify_the_symbol_and_base_api_json_response() {


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

			
			//log.info(rates.get("USD"));
			log.info(rates.get("GBP"));
			
			log.info("date >" + date);
			Assert.assertEquals("USD", base);
			//Assert.assertNotNull(rates.get("USD"));
			Assert.assertNotNull(rates.get("GBP"));

			LocalDate todaydate = LocalDate.now();
			Assert.assertEquals("Response date is incorrect", todaydate, date);
		}
	
}
