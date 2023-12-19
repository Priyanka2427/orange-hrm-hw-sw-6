@regression
Feature: User Feature Test
  As a User
  I have to add user successfully
  I have to verify created user successfully
  I have to delete the added user successfully
  I have to search for the user and should found unique user

  @author_Priyanka_Gajera @sanity @smoke
  Scenario: User should successfully add the new user
    Given I am on login page
    When I enter username "Admin"
    And I enter password "admin123"
    And I click on login button
    And I click on Admin tab
    And I should see the System Users text "System Users"
    And I click on Add button
    And I should see the Add User text "Add User"
    And I select User Role as Admin
    And I enter Employee Name "Peter Mac Anderson"
    And I enter User Name "Prime78"
    And I select Status as Disable
    And I enter Password "prime123"
    And I enter Confirm Password "prime123"
    And I click on Save button
    Then I should see the message "Successfully Saved"

  @author_Priyanka_Gajera @smoke
  Scenario: User created successfully and verify it
    Given I am on login page
    When I enter username "Admin"
    And I enter password "admin123"
    And I click on login button
    And I click on Admin tab
    And I should see the System Users text "System Users"
    And I enter user name "Prime78" in system users page
    And I select user role as Admin in system users page
    And I select status as disable in system users page
    And I click on search button
    Then I should verify the user name "Prime78" in result list

  @author_Priyanka_Gajera
  Scenario: Admin should delete the user successfully
    Given I am on login page
    When I enter username "Admin"
    And I enter password "admin123"
    And I click on login button
    And I click on Admin tab
    And I should see the System Users text "System Users"
    And I enter user name "Prime78" in system users page
    And I select user role as Admin in system users page
    And I select status as disable in system users page
    And I click on search button
    And I should verify the user name "Prime78" in result list
    And I click on check box against the user name
    And I click on delete button against the user name
    And I click on ok button on popup
    Then I should get successfully deleted message "Successfully Deleted"

  @author_Priyanka_Gajera
  Scenario Outline: User should search and verify the message record found
    Given I am on login page
    When I enter username "Admin"
    And I enter password "admin123"
    And I click on login button
    And I click on Admin tab
    And I should see the System Users text "System Users"
    And I enter user name "<username>" in system users page
    And I select user role "<userrole>" in system users page
    And I select status "<status>" in system users page
    And I click on search button
    And I see the one record found "(1) Record Found" message
    And I should verify the username "<username>"
    Then I click on reset button
    Examples:
      | username   |  | userrole |  | status |
      | Admin      |  | Admin    |  | Enable |
      | Nina.Patel |  | ESS      |  | Enable |