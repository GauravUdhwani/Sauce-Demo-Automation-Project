# 🚀 Sauce Demo Automation Framework

A scalable and maintainable Selenium Automation Framework developed using **Java**, **Selenium WebDriver**, **TestNG**, **Maven**, and the **Page Object Model (POM)** for automating the Sauce Demo web application.

The framework is designed following industry best practices with reusable page classes, utility components, logging, reporting, configurable test execution, and cross-browser support.

The project is also integrated with **GitHub and Jenkins** to enable automated Continuous Integration (CI) execution whenever changes are detected in the repository.

---

# 📌 Project Overview

This project automates the end-to-end user journey of the Sauce Demo application, including:

- Login
- Inventory validation
- Product selection
- Shopping cart
- Checkout
- Order confirmation

The framework is built to be modular, reusable, and easy to maintain.

It follows the **Page Object Model (POM)** design pattern and uses a centralized **DriverFactory** for WebDriver initialization and management.

The framework currently contains **27 automated test cases**, with the latest Jenkins execution achieving:

**27 Tests Passed | 0 Failed | 0 Skipped**

---

# 🎯 Project Objectives

The main objectives of this project are:

- Build a maintainable Selenium automation framework
- Implement the Page Object Model design pattern
- Centralize WebDriver initialization and management
- Execute tests using TestNG
- Manage dependencies and builds using Maven
- Implement reusable utilities and configuration management
- Generate detailed test execution reports
- Integrate the automation framework with GitHub
- Integrate the framework with Jenkins CI
- Automatically trigger Jenkins builds when repository changes are detected

---

# 🛠️ Tech Stack

| Technology | Purpose |
|---|---|
| **Java** | Programming Language |
| **Selenium WebDriver** | Web UI Automation |
| **TestNG** | Test Execution & Test Management |
| **Maven** | Build & Dependency Management |
| **Page Object Model** | Framework Design Pattern |
| **Log4j2** | Logging |
| **Extent Reports** | HTML Test Reporting |
| **Git** | Version Control |
| **GitHub** | Source Code Repository |
| **Jenkins** | Continuous Integration |
| **Chrome** | Primary CI Browser |
| **Edge** | Cross-Browser Support |
| **Firefox** | Cross-Browser Support |
| **Eclipse IDE** | Development Environment |

---

# 🏗️ Framework Architecture

The framework follows a layered and reusable architecture.

```text
Test Classes
     │
     ▼
Base Test
     │
     ▼
Driver Factory
     │
     ▼
WebDriver
     │
     ▼
Page Objects
     │
     ▼
Sauce Demo Application

Supporting components include:



Utilities
   ├── Driver Factory
   ├── Config Reader
   ├── Wait Utility
   ├── Screenshot Utility
   └── Other reusable utilities

Listeners
   ├── TestNG Listeners
   ├── Extent Reporting
   └── Test Execution Events

📂 Project Structure



Sauce-Demo-Automation-Project
│
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── Base
│   │   │   ├── Pages
│   │   │   ├── Utilities
│   │   │   └── Listeners
│   │   │
│   │   └── resources
│   │
│   └── test
│       ├── java
│       └── resources
│
├── logs
├── test-output
├── pom.xml
├── testng.xml
├── README.md
└── .gitignore

✨ Framework Features

Page Object Model (POM) Design Pattern

Cross-Browser Support

Maven Build Management

TestNG Test Execution

Log4j2 Logging

Extent HTML Reporting

Screenshot Capture

Explicit Wait Utilities

Reusable Utility Classes

Configuration Management

ThreadLocal WebDriver Management

TestNG Listeners

Retry Analyzer

Git/GitHub Integration

Jenkins CI Integration

Jenkins Poll SCM

Automated Build Execution

Jenkins Test Result Reporting

HTML Report Archiving

🧪 Test Automation Coverage

The framework currently contains 27 automated test cases covering the major workflows of the Sauce Demo application.

🔐 Login Module

Verify Login functionality

📦 Inventory Module

Verify Inventory Page

Verify Product Names

Verify Product Price

Verify Product Title

Verify Web Page

Add Product to Cart

Verify Back Button Functionality

🛒 Cart Module

Verify Cart Page

Verify Cart Title

Add Product to Cart

Remove Product from Cart

Continue Shopping

Click Shopping Cart

💳 Checkout Module

Verify Checkout Page

Verify Checkout Title

Add Customer Details

Continue Checkout

Cancel Checkout

Finish Order

✅ Order Confirmation Module

Verify Order Confirmation Page

Verify Confirmation Message

Verify Confirmation Description

Verify Header Title

⚙️ Prerequisites

Make sure the following are installed before running the project:

Java JDK

Maven

Git

Chrome Browser

Eclipse IDE

📥 Clone the Repository

Clone the project using:



git clone https://github.com/GauravUdhwani/Sauce-Demo-Automation-Project.git

📁 Navigate to the Project



cd Sauce-Demo-Automation-Project

▶️ Execute the Tests Using Maven

Run the complete TestNG suite using:



mvn clean test

Maven will:

Clean the previous build

Compile the project

Execute the TestNG test suite

Generate test results

Generate the Extent HTML report

🧪 Execute Using TestNG

The TestNG suite is configured in:



testng.xml

The suite can be executed directly from Eclipse as:



Run As → TestNG Suite

🌐 Browser Configuration

The framework supports multiple browsers through the centralized DriverFactory.

Supported browsers:



Chrome
Edge
Firefox

The browser is passed through a TestNG parameter.

Example:



<parameter name="browser" value="chrome"/>

The BaseTest class receives the browser parameter and initializes the required WebDriver through the DriverFactory.

Example:



@BeforeMethod
@Parameters("browser")
public void setup(@Optional("chrome") String browser) {

    DriverFactory.getDriver(browser);

    driver = DriverFactory.getDriver();

    // Test setup
}

Jenkins Browser

Chrome is currently configured as the primary browser for Jenkins CI execution.

The framework also contains Edge and Firefox support for cross-browser execution.

🔧 Driver Factory

The framework uses a centralized DriverFactory to initialize and manage WebDriver instances.

The DriverFactory provides:

Centralized driver initialization

Browser selection

ThreadLocal WebDriver management

Driver cleanup

Example:



DriverFactory.getDriver(browser);

The framework uses:



ThreadLocal<WebDriver>

to maintain WebDriver instances independently.

🧩 Page Object Model

The framework follows the Page Object Model (POM) design pattern.

Each application page has a dedicated Page Object containing:

Web elements

Locators

Page-specific actions

Reusable methods

This helps improve:

Code reusability

Maintainability

Readability

Separation of test logic and page logic

📝 Configuration Management

The framework uses a configuration reader to manage configurable values such as:

Application URL

Implicit wait configuration

Other framework properties

This allows configuration values to be maintained separately from the test code.

⏱️ Wait Management

The framework uses reusable wait functionality to improve test stability and synchronization between Selenium and the application.

This helps reduce issues caused by:

Dynamic page loading

Delayed elements

Page transitions

Asynchronous UI behavior

📊 Test Execution Results

The latest successful Jenkins execution produced:



Tests run: 27
Failures: 0
Errors: 0
Skipped: 0

BUILD SUCCESS

Execution Summary

MetricResult



Tests Executed

27

Tests Passed

27

Tests Failed

0

Tests Skipped

0

Errors

0

Pass Rate

100%

Build Status

✅ SUCCESS

📈 Extent HTML Report

The framework generates an Extent HTML Report after test execution.

The report provides detailed information including:

Test case names

Test execution status

Execution timestamps

Test duration

Environment information

Passed/Failed test summary

Test execution timeline

The generated report is located at:



test-output/ExtentReport.html

The report is also archived by Jenkins after the build.

📋 Jenkins Test Results

Jenkins records the automated test execution results and provides visibility into:

Total tests

Passed tests

Failed tests

Skipped tests

Test execution duration

Test class-level results

The latest Jenkins execution successfully recorded:



27 Tests Passed
0 Tests Failed
0 Tests Skipped

🔄 Jenkins CI/CD Integration

The project is integrated with Jenkins for Continuous Integration.

The Jenkins job is connected to the GitHub repository and uses Poll SCM to periodically check for repository changes.

When Jenkins detects a new SCM change, it automatically triggers the automation build.

🔁 CI/CD Workflow

The complete CI workflow is:



Developer
    │
    ▼
Code Changes
    │
    ▼
Git
    │
    ▼
GitHub Repository
    │
    ▼
Jenkins Poll SCM
    │
    ▼
SCM Change Detected
    │
    ▼
Jenkins Build
    │
    ▼
Maven clean test
    │
    ▼
TestNG
    │
    ▼
Selenium WebDriver
    │
    ▼
Chrome Browser
    │
    ▼
27 Automated Tests
    │
    ├─────────────────┐
    ▼                 ▼
Jenkins Test      Extent HTML
Results           Report
    │                 │
    └────────┬────────┘
             ▼
        BUILD SUCCESS

⚙️ Jenkins Build Configuration

Jenkins executes the automation suite using Maven:



mvn clean test

The build is automatically triggered when Jenkins detects a change in the GitHub repository.

The Jenkins console confirms the SCM-triggered execution with:



Started by an SCM change

🔄 GitHub → Jenkins Integration

The source code is maintained in GitHub.

Typical development workflow:



git add .
git commit -m "Update automation framework"
git push origin main

After pushing the changes:



GitHub
   ↓
Jenkins Poll SCM
   ↓
SCM Change Detected
   ↓
Automatic Build
   ↓
Maven Test Execution

This enables continuous integration of the automation suite.

📊 Reporting Workflow

The reporting flow is:



TestNG
   ↓
Test Execution
   ↓
Jenkins Test Results
   ↓
Extent HTML Report

This provides both Jenkins-level execution visibility and a detailed HTML report.

🧰 Framework Components

The framework contains reusable components including:

Base Test

Responsible for common test setup and teardown activities.

Driver Factory

Responsible for WebDriver initialization and browser management.

Config Reader

Reads framework configuration values.

Wait Utility

Provides reusable synchronization and wait functionality.

Screenshot Utility

Provides screenshot capture functionality where required.

Retry Analyzer

Provides retry functionality for configured failed tests.

Extent Manager

Handles Extent Report configuration and report generation.

Log4j2 Logger

Provides execution logging for the automation framework.

TestNG Listeners

Handles TestNG execution events and reporting integration.

🧹 Test Cleanup

The framework performs WebDriver cleanup after test execution.

The DriverFactory provides a quitDriver() method to:

Quit the browser

Remove the ThreadLocal WebDriver instance

Prevent driver references from remaining after execution

🔀 Git Workflow

The project uses Git for version control and GitHub for repository management.

Typical workflow:



git add .
git commit -m "Update automation tests"
git push origin main

The GitHub repository acts as the source of truth for the automation framework.

🎯 Key Project Highlights

✅ Selenium WebDriver Automation

✅ Java-based Framework

✅ TestNG

✅ Maven

✅ Page Object Model

✅ DriverFactory

✅ ThreadLocal WebDriver

✅ Configuration Management

✅ Log4j2 Logging

✅ TestNG Listeners

✅ Retry Analyzer

✅ Reusable Utilities

✅ Cross-Browser Framework Support

✅ Git/GitHub Integration

✅ Jenkins CI

✅ Jenkins Poll SCM

✅ Automated Build Execution

✅ Jenkins Test Results

✅ Extent HTML Reporting

✅ 27 Automated Tests

✅ 27 Tests Passed

✅ 0 Failures

✅ 0 Errors

✅ 0 Skipped

✅ 100% Pass Rate

🚀 Future Enhancements

The framework can be further enhanced with:

Docker Integration

GitHub Actions CI/CD

BrowserStack Integration

Excel Data-Driven Testing

REST Assured API Automation

Allure Reporting

Parallel Test Execution

Selenium Grid

Email Notifications

Slack Notifications

Enhanced Test Data Management

📌 Project Status

ComponentStatus



Selenium Automation

✅ Completed

Java Framework

✅ Completed

TestNG Integration

✅ Completed

Maven Integration

✅ Completed

Page Object Model

✅ Implemented

DriverFactory

✅ Implemented

GitHub Integration

✅ Completed

Jenkins Integration

✅ Completed

Poll SCM

✅ Configured

Automated CI Execution

✅ Working

Test Reporting

✅ Implemented

Extent HTML Report

✅ Implemented

Automated Test Cases

27

Tests Passed

27

Tests Failed

0

Tests Skipped

0

Latest Build

BUILD SUCCESS

👨‍💻 Author

Gaurav Udhwani

QA Automation Engineer

GitHub

https://github.com/GauravUdhwani/Sauce-Demo-Automation-Project

LinkedIn

https://www.linkedin.com/in/gaurav-udhwani-7083661a6/

Email

gauravudhwani03@gmail.com

⭐ Support

If you found this project useful, please consider giving the repository a ⭐ Star on GitHub.

