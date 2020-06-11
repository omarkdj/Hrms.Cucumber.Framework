@PersonDetails
Feature: Employee personal details

  Background: user is logged with valid admin credentials

  Scenario: Admin should be able to modify employee personal details:
    Given user navigate to employee list page
    And user select employee bi "12479"
    When user modify emp person detail
      | DLNNumber | LicenseExpiryDate | SSN       | SIN    | Gender | MaritalStatus | Nationality | DateofBirth | NickName | Smoker | MilitaryS |
      | 147258369 | 2020-01-03        | 987654321 | 777777 | Mal    | Single        | Algeria     | 1988-01-01  | Omar     | No     | Army      |
    Then user save the modification and tack "Screen shot"
