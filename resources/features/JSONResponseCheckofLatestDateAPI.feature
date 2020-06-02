#Author: Neha Jaiswal
#Created on 02-06-2020
@LatestDateExchangeRatesAPI
Feature: Validate the JSON response on providing valid endpoints for Latest Date Exchange Rates API


  #SymbolAPIResponseCheckofLatestDateAPI
  @LatestDateJSONResponse
  Scenario Outline: Validate the JSON response on providing valid Symbol endpoint for Latest Date Exchange Rates API
  Given Enter below url with valid symbol endpoint "<url>"
  When I get Symbol API response as 200
  Then Verify the Symbol JSON response
  
    Examples: 
      | url |                                                    
      | https://api.ratesapi.io/api/latest?symbols=USD,GBP |

   
  #BaseAPIResponseCheckofLatestDateAPI
  @LatestDateJSONResponse
  Scenario Outline: Validate the JSON response on providing valid Base endpoint for Latest Date Exchange Rates API
  Given Enter below url with valid Base endpoint "<url>"
  When I get Base API response as 200
  Then Verify the Base JSON response
  
    Examples: 
      | url |                                                    
      | https://api.ratesapi.io/api/latest?base=USD |
      
 
  #SymbolandBaseAPIResponseCheckofLatestDateAPI
  @LatestDateJSONResponse
  Scenario Outline: Validate the JSON response on providing valid Symbol and Base endpoints for Latest Date Exchange Rates API
  Given Enter below url with valid Symbol and Base endpoint "<url>"
  When I get Symbol and Base API response as 200
  Then Verify the Symbol and Base API JSON response
  

    Examples: 
      | url |                                                    
      | https://api.ratesapi.io/api/latest?base=USD | 