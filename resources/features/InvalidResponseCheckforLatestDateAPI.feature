#Author: Neha Jaiswal
#Created on 02-06-2020
@LatestDateExchangeRatesAPI
Feature: Status code check by providing incorrect Rates APIs endpoint for Latest Date Exchange Rates

  #InvalidResponseStatusCheckforLatestDateAPI
  @IncorrectAPIsStatuscode
  Scenario Outline: Validate the response code on providing invalid inputs on endpoints
    Given Enter below invalid endpoints "<url>" to check response
    When I get error response as 400
    Then I am able to verify details "<value>"

    Examples: 
      | url                                                      | value        |
      | https://api.ratesapi.io/ap                               | invalid api  |
      | https://api.ratesapi.io/api/latest?symbols=USD,GBK       | Symbols      |
      | https://api.ratesapi.io/api/latest?base=USZ              | base         |
      | https://api.ratesapi.io/api/latest?base=USI&symbols=GBO  | Symbols_base |
      
       
   #CaseSensitiveEndpointResponseCheckofLatestDateAPI
   @IncorrectAPIsStatuscode
   Scenario Outline: Validate the response code on providing lowercase inputs on endpoints for Latest Date Exchange Rates API
    Given Enter endpoints in lowercase in below "<url>"
    When I get the error response as 400
    Then Verify the error message
    
    Examples:
    | url |
    | https://api.ratesapi.io/api/latest?symbols=usd |