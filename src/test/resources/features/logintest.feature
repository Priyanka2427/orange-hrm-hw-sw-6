@regression
Feature: Login Future Test
  As a user
  I should login successfully with valid username and password
  I should see the Logo on homepage
  I should logout successfully
  I should get error message when logged in with invalid credentials

  @author_Priyanka_Gajera @sanity @smoke
  Scenario: User should log in successfully with valid credentials
    Given I am on login page
    When I enter username "Admin"
    And I enter password "admin123"
    And I click on login button
    Then I should login successfully and verify the text "Dashboard"

  @author_Priyanka_Gajera @smoke
  Scenario: User should see the OrangeHRM logo on the Homepage
    Given I am on login page
    When I enter username "Admin"
    And I enter password "admin123"
    And I click on login button
    Then I should see the OrangeHRM logo

  @author_Priyanka_Gajera
  Scenario: User should logout successfully
    Given I am on login page
    When I enter username "Admin"
    And I enter password "admin123"
    And I click on login button
    And I click on user profile logo
    And I mouse hover and click on Logout
    Then I should navigate to login page and verify "Login" text

  @author_Priyanka_Gajera
  Scenario Outline: : User should get error message with invalid credentials
    Given I am on login page
    When I enter username "<username>"
    And I enter password "<password>"
    And I click on login button
    Then I should get error message "<errorMessage>" depends on username "<username>" and password "<password>"
    Examples:
      | username          |  | password |  | errorMessage        |
      |                   |  |          |  | Required            |
      | test123@gmail.com |  |          |  | Required            |
      |                   |  | test123  |  | Required            |
      | test123@gmail.com |  | test123  |  | Invalid credentials |