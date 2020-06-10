Feature: Add new Employee

  Scenario: Add Employee with first and lastname
    Given user logins with valid admin credentials
    And user navigates to AddEmployeePage
    When user enters employees first name and last name
    And user clicks save button
    Then employee is added successfully

  Scenario: Add Employee without employee id
    Given user logins with valid admin credentials
    And user navigates to AddEmployeePage
    When user enters employees first name and last name
    And user deletes employee id
    And user clicks save button
    Then employee is added successfully

  Scenario: AddEmployee and create Login Credentials
    Given user logins with valid admin credentials
    And user navigates to AddEmployeePage
    When user enters employees first name and last name
    And user clicks on create login checkbox
    And user enters login credentials
    And user clicks save button
    Then employee is added successfully
