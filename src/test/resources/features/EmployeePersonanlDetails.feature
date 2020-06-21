@PersonDetails
Feature: personal details

  Scenario: Admin should be able to modify employee personal details
    Given user is logged with valid admin credentials
    And user navigate to employee list page
    And user select employee by "12479"
    When user should be able to modify employee personal details
      | DLNNumber | LicenseExpiryDate | SSN       | SIN    | Gender | MaritalStatus | Nationality | DateofBirth | NickName | MilitaryS |
      | 147258369 | 2020-01-03        | 987654321 | 777777 | Male   | Single        | Algeria     | 1988-01-01  | Omar     | Army      |
    Then user saves the modifications and takes "modifyDetails"
