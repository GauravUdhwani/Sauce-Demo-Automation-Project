# 🚀 Sauce Demo Automation Framework

A scalable and maintainable Selenium Automation Framework developed using **Java**, **Selenium WebDriver**, **TestNG**, **Maven**, and the **Page Object Model (POM)** for automating the Sauce Demo web application.

This framework is designed following industry best practices with reusable page classes, utility components, logging, reporting, and cross-browser support.

---

# 📌 Project Overview

This project automates the end-to-end user journey of the Sauce Demo application, including login, inventory management, shopping cart, checkout process, and order confirmation.

The framework is built to be modular, reusable, and easy to maintain while supporting multiple browsers and detailed execution reporting.

---

# 🛠️ Tech Stack

- Java
- Selenium WebDriver
- TestNG
- Maven
- Page Object Model (POM)
- Log4j2
- Extent Reports
- Git
- GitHub
- Jenkins
- ChromeDriver
- Eclipse IDE

---

# 📂 Project Structure

```
Sauce-Demo-Automation-Project
│
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── Base
│   │   │   ├── Pages
│   │   │   ├── Utilities
│   │   │   └── Listeners
│   │   └── resources
│   │
│   └── test
│       ├── java
│       └── resources
│
├── screenshots
├── logs
├── pom.xml
├── testng.xml
└── README.md
```

---

# ✨ Framework Features

- Page Object Model (POM) Design Pattern
- Cross Browser Support
- Maven Build Management
- TestNG Test Execution
- Log4j2 Logging
- Extent HTML Reports
- Screenshot Capture
- Explicit Wait Utilities
- Reusable Utility Classes
- Configurable Test Execution
- ThreadLocal WebDriver Management
- Jenkins Integration Ready

---

# 🧪 Test Scenarios Automated

## Login Module

- Valid Login
- Invalid Login
- Empty Username
- Empty Password
- Locked User Validation

---

## Inventory Module

- Inventory Page Validation
- Product Availability
- Add Product to Cart
- Remove Product
- Shopping Cart Navigation

---

## Cart Module

- Cart Page Verification
- Cart Title Validation
- Product Validation
- Continue Shopping
- Remove Product
- Checkout Navigation

---

## Checkout Module

- Checkout Information Validation
- Continue Button Validation
- Checkout Overview Verification

---

## Order Confirmation

- Order Completion
- Thank You Message Validation
- Back Home Navigation

---

# ⚙️ Prerequisites

- Java JDK 17 or above
- Maven
- Chrome Browser
- Eclipse IDE
- Git

---

# ▶️ How to Execute the Project

### Clone the Repository

```bash
git clone https://github.com/GauravUdhwani/Sauce-Demo-Automation-Project.git
```

---

### Navigate to Project

```bash
cd Sauce-Demo-Automation-Project
```

---

### Execute using Maven

```bash
mvn clean test
```

---

### Execute from TestNG

Run

```
testng.xml
```

as a TestNG Suite.

---

# 📊 Reporting

The framework generates:

- TestNG Reports
- Extent HTML Reports
- Log4j2 Execution Logs

Reports are generated after every execution.

---

# 🔧 Framework Components

- Base Test Class
- Driver Factory
- Config Reader
- Wait Utility
- Screenshot Utility
- Retry Analyzer
- Extent Manager
- Log4j2 Logger
- TestNG Listeners

---

# 🔄 Continuous Integration

This framework supports Jenkins integration.

Current Jenkins Features:

- Maven Build
- Test Execution
- Automated Report Generation

---

# 📈 Future Enhancements

- Docker Integration
- GitHub Actions CI/CD
- BrowserStack Integration
- Excel Data Driven Framework
- REST Assured API Automation
- Allure Reporting

---

## CI/CD Integration

This project is integrated with Jenkins for automated test execution.

# 👨‍💻 Author

**Gaurav Udhwani**

QA Automation Engineer

GitHub:
https://github.com/GauravUdhwani

LinkedIn:
https://www.linkedin.com/in/gaurav-udhwani-7083661a6/

Email:
gauravudhwani03@gmail.com

---

# ⭐ If you found this project useful, don't forget to Star the repository.
