#Author: Neha Jaiswal
#Created on 02-06-2020
@PastDateExchangeRatesAPI
Feature: Validate the status code response for Past Date Exchange Rates API

  #StatusCodeCheckofPastDateAPI
  @PastDateAPIStatusCode
  Scenario Outline: Validate the status code response on the below endpoints for Past Date Exchange Rates API

    Given Enter below past date endpoints "<url>"
    Then Verify the past date response as 200

	  Examples:
      | url                                                         | code |
      | https://api.ratesapi.io/api/2010-01-12                      |  200 |
      | https://api.ratesapi.io/api/2010-01-12?symbols=USD,GBP      |  200 |
      | https://api.ratesapi.io/api/2010-01-12?base=USD             |  200 | 
      | https://api.ratesapi.io/api/2010-01-12?base=USD&symbols=GBP |  200 | 
      