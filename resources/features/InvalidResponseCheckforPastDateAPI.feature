#Author: Neha Jaiswal
#Created on 02-06-2020
@PastDateExchangeRatesAPI
Feature: Status code check by providing incorrect Rates APIs endpoint for Past Date Exchange Rates

  #InvalidResponseStatusCheckforPastDateAPI
  @IncorrectAPIsStatuscode
  Scenario Outline: Validate the response code on providing invalid inputs on endpoints
    Given Enter below invalid endpoints "<url>" to check response for Past date Exchange API
    When Verify the error response for Past Date API as 400
    Then Verify the error messages for Past Date API for "<value>"

    Examples: 
      | url                                                          | value        |
      | https://api.ratesapi.io/ap                                   | invalid api  |
      | https://api.ratesapi.io/api/2010-01-12?symbols=USD,GBK       | Symbols      |
      | https://api.ratesapi.io/api/2010-01-12?base=USZ              | base         |
      | https://api.ratesapi.io/api/2010-01-12?base=USD&symbols=GBO  | Symbols_base |
      
      
  #CaseSensitiveEndpointResponseCheckofPastDateAPI
  @IncorrectAPIsStatuscode
  Scenario Outline: Validate the response code on providing lowercase inputs on endpoints for Past Date Exchange Rates API
    Given Enter endpoints in lowercase in below "<url>" for Past Date Exchange Rates API
    When Verify the error response for case sensitive input for Past Date API as 400
    Then Verify the error message for case sensitive inputs
    
    Examples:
    | url |
    | https://api.ratesapi.io/api/2010-01-12?symbols=usd |
    
   #InvalidResponseStatusCheckforOutofRangeDateAPI
   @IncorrectAPIsStatuscode
   Scenario Outline: Validate the response code on providing out of range date on endpoints for Past Date Exchange Rates API:
    Given Enter out of range date in Past Date API endpoints "<url>"
    When Verify the error response for out of range date in Past Date API as 400
    Then Verify the error message out of range date in Past Date API
    
    Examples:
    | url |
    | https://api.ratesapi.io/api/1980-01-20 |
    
   #InvalidResponseStatusCheckforInvalidDateAPI
   @IncorrectAPIsStatuscode
   Scenario Outline: Validate the response code on providing invalid date on endpoints for Past Date Exchange Rates API:
    Given Enter invalid date in Past Date API endpoints "<url>"
    When Verify the error response for invalid date in Past Date API as 400
    Then Verify the error message for invalid date in Past Date API
    
    Examples:
    | url |
    | https://api.ratesapi.io/api/2010-30-04 |
   