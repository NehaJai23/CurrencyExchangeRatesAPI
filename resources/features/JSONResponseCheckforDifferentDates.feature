#Author: Neha Jaiswal
#Created on 02-06-2020
@PastDateExchangeRatesAPI
Feature: Validate the JSON response on providing different dates for Past Date Exchange Rates API

  #ResponseStatusCheckforDifferentDates
  @DifferentDatesJSONResponse
  Scenario Outline: Validate the response code on providing future date on endpoints
    Given Enter below "<url>" to check response
    When Verify the response as 200 for future date inputs
    Then Verify the response for future date inputs

    Examples: 
      | url |                                                  
      | https://api.ratesapi.io/api/2020-12-12?symbols=USD,GBP |   
      
  #ResponseStatusCheckforDifferentDates
  @DifferentDatesJSONResponse
  Scenario Outline: Validate the response code on providing any Saturday date on endpoints
    Given Enter below "<url>" to check response for any Saturday date inputs
    When Verify the response as 200 for any Saturday date inputs
    Then Verify the response for any Saturday date inputs

    Examples: 
      | url |                                                    
      | https://api.ratesapi.io/api/2020-05-30?symbols=USD,GBP | 
      
  #ResponseStatusCheckforDifferentDates
  @DifferentDatesJSONResponse
  Scenario Outline: Validate the response code on providing any Saturday date on endpoints
    Given Enter below "<url>" to check response for any Sunday date inputs
    When Verify the response as 200 for any Sunday date inputs
    Then Verify the response for any Sunday date inputs

    Examples: 
      | url |                                                     
      | https://api.ratesapi.io/api/2020-05-31?symbols=USD,GBP |  