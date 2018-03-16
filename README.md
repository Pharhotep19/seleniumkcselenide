# Selenium KC Selenide Examples

This is a sample project demonstrating how to test the Automation practice site with Selenide (Selenium webdriver).

You can checkout and run it locally with a few minutes.

## How to run tests

This project uses JUnit and each test Class or Method can be ran autonomously or together.

To run all tests simply right-click the project folder (seleniumkcselenide) and select Run > All Tests

## How to run with Maven

Type from command line for running tests in different browsers:

mvn clean test -P chrome
mvn clean test -P firefox
mvn clean test -P ie
mvn clean test -P edge
mvn clean test -P phantomjs
mvn clean test -P htmlunit
mvn clean test -P safari