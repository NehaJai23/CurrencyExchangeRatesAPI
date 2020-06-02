#Author: Neha Jaiswal
#Created on 02-06-2020
@PastDateExchangeRatesAPI
Feature: Validate the JSON response on providing valid endpoints for Past Date Exchange Rates API


  #SymbolAPIResponseCheckofPastDateAPI
  @PastDateJSONResponse
  Scenario Outline: Validate the JSON response on providing valid Symbol endpoint for Past Date Exchange Rates API
  Given Enter below url with valid symbol endpoint "<url>" for Date API
  When Verify the status response for Symbol endpoint for Past Date API as 200
  Then Verify the JSON response for Symbol endpoint for Past Date API for "<Date>"
  
    Examples: 
      | url |                                                      | Date |
      | https://api.ratesapi.io/api/2010-01-12?symbols=USD,GBP |   | 2010-01-12 |

   
  #BaseAPIResponseCheckofPastDateAPI
  @PastDateJSONResponse
  Scenario Outline: Validate the JSON response on providing valid Base endpoint for Past Date Exchange Rates API
  Given Enter below url with valid base endpoint "<url>" for Date API
  When Verify the status response for Base endpoint for Past Date API as 200
  Then Verify the JSON response for Base endpoint for Past Date API for "<Date>"
  
    Examples: 
      | url |                                                      | Date |         
      | https://api.ratesapi.io/api/2010-01-12?base=USD |          | 2010-01-12 |
      
 
  #SymbolandBaseAPIResponseCheckofPastDateAPI
  @PastDateJSONResponse
  Scenario Outline: Validate the JSON response on providing valid Symbol and Base endpoints for Past Date Exchange Rates API
  Given Enter below url with valid Symbol and Base endpoint "<url>" for Date API
  When Verify the status response for Symbol and base endpoint for Past Date API as 200
  Then Verify the JSON response for Symbol and base endpoint for Past Date API for "<Date>"
  

    Examples: 
      | url |                                                            | Date |
      | https://api.ratesapi.io/api/2010-01-12?base=USD&symbols=GBP |    | 2010-01-12 |