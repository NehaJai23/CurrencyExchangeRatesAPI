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

public class JSONResponseCheckforPastDateAPI {
	
	Response response;

    public static Logger log = Logger.getLogger(JSONResponseCheckforPastDateAPI.class);

	@Given("^Enter below url with valid symbol endpoint \"([^\"]*)\" for Date API$")
    public void enter_below_url_with_valid_symbol_endpoint_for_date_api(String url) throws Throwable {
		response = given().when().get(url);
    }

	@When("^Verify the status response for Symbol endpoint for Past Date API as (\\d+)$")
    public void verify_the_status_response_for_symbol_endpoint_for_past_date_api_as(int arg1) throws Throwable {
    	assertEquals("Incorrect status code", arg1, response.getStatusCode());
    }

	@Then("^Verify the JSON response for Symbol endpoint for Past Date API for \"([^\"]*)\"$")
    public void verify_the_json_response_for_symbol_endpoint_for_past_date_api_for(String urldate) throws Throwable {
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
    			
    			Assert.assertEquals("Response date is incorrect", date, urldate);
    }
	
	@Given("^Enter below url with valid base endpoint \"([^\"]*)\" for Date API$")
    public void enter_below_url_with_valid_base_endpoint_for_date_api(String url) throws Throwable {
		response = given().when().get(url);
    }

    @When("^Verify the status response for Base endpoint for Past Date API as (\\d+)$")
    public void verify_the_status_response_for_base_endpoint_for_past_date_api_as(int arg1) throws Throwable {
    	assertEquals("Incorrect status code", arg1, response.getStatusCode());
    }

    @Then("^Verify the JSON response for Base endpoint for Past Date API for \"([^\"]*)\"$")
    public void verify_the_json_response_for_base_endpoint_for_past_date_api_for(String urldate) throws Throwable {
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
    	        
    			log.info(rates.get("EUR"));
    			log.info(rates.get("USD"));
    			log.info(rates.get("GBP"));
    			log.info(rates.get("HKD"));
    			log.info(rates.get("LVL"));
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
    			log.info(rates.get("MYR"));
    			log.info(rates.get("NOK"));
    			log.info(rates.get("CNY"));
    			log.info(rates.get("BGN"));
    			log.info(rates.get("PHP"));
    			log.info(rates.get("SEK"));
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
    			log.info(rates.get("LTL"));
    			log.info(rates.get("EEK"));
    			
    			log.info("responsedate >" + date);
    			
    			Assert.assertEquals("USD", base);
    			
    			Assert.assertNotNull(rates.get("USD"));
    			Assert.assertNotNull(rates.get("EUR"));
    			Assert.assertNotNull(rates.get("GBP"));
    			Assert.assertNotNull(rates.get("HKD"));
    			Assert.assertNotNull(rates.get("LVL"));
    			Assert.assertNotNull(rates.get("IDR"));
    			Assert.assertNotNull(rates.get("DKK"));
    			Assert.assertNotNull(rates.get("INR"));
    			Assert.assertNotNull(rates.get("CHF"));
    			Assert.assertNotNull(rates.get("MXN"));
    			Assert.assertNotNull(rates.get("CZK"));
    			Assert.assertNotNull(rates.get("SGD"));
    			Assert.assertNotNull(rates.get("THB"));
    			Assert.assertNotNull(rates.get("HRK"));
    			Assert.assertNotNull(rates.get("MYR"));
    			Assert.assertNotNull(rates.get("NOK"));
    			Assert.assertNotNull(rates.get("CNY"));
    			Assert.assertNotNull(rates.get("BGN"));
    			Assert.assertNotNull(rates.get("PHP"));
    			Assert.assertNotNull(rates.get("SEK"));
    			Assert.assertNotNull(rates.get("PLN"));
    			Assert.assertNotNull(rates.get("ZAR"));
    			Assert.assertNotNull(rates.get("CAD"));
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
    			Assert.assertNotNull(rates.get("LTL"));
    			Assert.assertNotNull(rates.get("EEK"));
    			
    			Assert.assertEquals("Response date is incorrect", date, urldate);
    }
    
    @Given("^Enter below url with valid Symbol and Base endpoint \"([^\"]*)\" for Date API$")
    public void enter_below_url_with_valid_Symbol_and_Base_endpoint_for_Date_API(String url) throws Throwable {
    	response = given().when().get(url);        
    }

    @When("^Verify the status response for Symbol and base endpoint for Past Date API as (\\d+)$")
    public void verify_the_status_response_for_Symbol_and_base_endpoint_for_Past_Date_API_as(int arg1) throws Throwable {
    	assertEquals("Incorrect status code", arg1, response.getStatusCode());
    }

    @Then("^Verify the JSON response for Symbol and base endpoint for Past Date API for \"([^\"]*)\"$")
    public void verify_the_JSON_response_for_Symbol_and_base_endpoint_for_Past_Date_API_for(String urldate) throws Throwable {
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

    			log.info(rates.get("GBP"));
    			
    			log.info("date >" + date);
    			
    			Assert.assertEquals("USD", base);
    			
    			Assert.assertNotNull(rates.get("GBP"));
    			
    			Assert.assertEquals("Response date is incorrect", date, urldate);
    }
	
	
	
}
