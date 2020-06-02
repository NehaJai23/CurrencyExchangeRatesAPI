#Author: Neha Jaiswal
#Created on 02-06-2020
@LatestDateExchangeRatesAPI
Feature: Validate the status code response for Latest Date Exchange Rates API

  #StatusCodeCheckofLatestDateAPI
  @LatestDateAPIStatusCode
  Scenario Outline: Validate the status code response on the below endpoints for Latest Date Exchange Rates API

  Given Enter below enpoints "<url>"
  Then I get the success response as 200

    Examples: 
      | url |                                                    
      | https://api.ratesapi.io/api/latest |
      | https://api.ratesapi.io/api/latest?symbols=USD,GBP |      
      | https://api.ratesapi.io/api/latest?base=USD |            
      | https://api.ratesapi.io/api/latest?base=USD&symbols=GBP | 
