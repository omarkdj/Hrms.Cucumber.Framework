@sprint200
Feature: invalid credentials

  Scenario Outline: login with invalid credtenatil and see errror message
    When user enters invalid "<UserName>" and "<Password>" and see "<ErrorMessage>"

    Examples: 
      | UserName | Password   | ErrorMessage        |
      | Admin    | Admin123   | Invalid Credentials |
      | Hello    | Syntax123! | Invalid Credentials |
  #Scenario: login with invalid credtenatil and see errror message
    #When user enters invalid "<UserName>" and "<Password>" and see "<ErrorMessage>"
      #| UserName | Password   | ErrorMessage        |
      #| Admin    | Admin123   | Invalid credentials |
      #| Hello    | Syntax123! | Invalid credentials |
