Feature: login
 Scenario: login in to website
    Given initiate browser
    When navigate to website
    And enter username
    Then enter password
    And click login button
    And check the current url
   
  Scenario: hit the api with post method
  
 Given delete the favorites in API
 And add the airport in favorites using POST
 Then print the response
 