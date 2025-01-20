# MotorwayProject
Test Automation
CarValuation Automation Project
Overview
The CarValuation Automation Project automates the process of car valuation on the Motorway website by extracting registration numbers from a text file, searching for their valuations, and verifying the results against expected outcomes. This project employs Selenium WebDriver for browser interactions, Cucumber for behavior-driven development (BDD), and JUnit for assertions and testing.

Features
The primary feature of this project is described in the CarValuation feature file:

Feature: CarValuation
Automates the validation of car valuation data.

Scenario: Valid car valuation
Given car registration numbers are extracted from a text file.
When the user searches for each registration number.
Then the search result should match the expected outcome.
Project Components
1. CarValuationSteps Class
Handles the step definitions for the CarValuation feature, connecting each scenario step to a method.

Key Functions:

@Given: Extracts registration numbers from a provided text file (car_input.txt) using regex patterns.
@When: Searches for each registration number on the Motorway website and refreshes the page for each entry.
@Then: Verifies the search results against pre-defined expected outcomes.
Expected Output: Hardcoded in the loadExpectedOutput method. Modify this method to update the expected car details.

2. CarValuationPage Class
Implements the Page Object Model (POM) for the car valuation webpage.

Methods:
fillCarRegistration: Fills the car registration number into the input field.
clickValueYourCar: Clicks the "Value your car" button.
getCarDetails: Retrieves the car details from the search results.
Prerequisites
Java Development Kit (JDK) installed on your machine.
Maven for dependency management.
Selenium WebDriver and browser drivers (e.g., ChromeDriver).
Cucumber and JUnit libraries (added as Maven dependencies).
IDE like IntelliJ IDEA or Eclipse.
Text File: A file containing car registration numbers (car_input.txt).
Setup Instructions
Clone the Repository:

bash
Copy
Edit
git clone <repository-url>
cd CarValuationProject
Install Dependencies.

Download and install the appropriate WebDriver (e.g., ChromeDriver for Chrome).
Add the WebDriver executable to your system's PATH.
File Path: Update the txtFilePath in CarValuationSteps.java to point to the correct location of car_input.txt.

Run Tests: Use an IDE or Maven to execute the tests:

bash
Copy
Edit
mvn test
File Descriptions
1. car_input.txt
A text file containing car registration numbers in the following format:

Copy
Edit
SG18 HTN
AD58 VNF
BW57 BOF
KT17 DLX
2. CarValuationSteps.java
Handles the step definitions for the Cucumber scenarios. Includes methods for:

Reading registration numbers from car_input.txt.
Searching for valuations on the website.
Verifying results against expected outcomes.
3. CarValuationPage.java
Implements the Page Object Model (POM) for interacting with webpage elements:

Input field for car registration.
Button to initiate valuation.
Element containing valuation details.
How It Works
Extract Registration Numbers:

Reads registration numbers from car_input.txt.
Uses a regex pattern to match valid UK registration numbers.
Search for Valuations:

Navigates to the Motorway website.
Inputs each registration number and searches for its valuation.
Validate Results:

Compares actual car details from the webpage against the expected outcomes defined in loadExpectedOutput.
Example Output
Console Log
plaintext
Copy
Edit
Extracted Registrations:
SG18 HTN
AD58 VNF
BW57 BOF
KT17 DLX

Assertion Passed: Variant registration matches for SG18 HTN.
Assertion Passed: Make and model match for SG18 HTN.
Assertion Passed: Year matches for SG18 HTN.
...
Enhancements
Dynamic Expected Outputs:

Load expected values from an external file (e.g., CSV or JSON) instead of hardcoding in loadExpectedOutput.
Error Handling:

Add robust error handling for missing or invalid registration numbers.
Parallel Execution:

Use TestNG or JUnit to enable parallel test execution for large datasets.
