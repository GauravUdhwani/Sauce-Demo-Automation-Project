# 🚀 Sauce Demo Automation Framework

A scalable and maintainable Selenium Automation Framework developed using **Java**, **Selenium WebDriver**, **TestNG**, **Maven**, and the **Page Object Model (POM)** for automating the Sauce Demo web application.

The framework is designed following industry best practices with reusable page classes, utility components, logging, reporting, configurable test execution, and cross-browser support.

The project is also integrated with **GitHub and Jenkins** to enable automated CI execution whenever changes are detected in the repository.

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

---

# 🛠️ Tech Stack

- **Java**
- **Selenium WebDriver**
- **TestNG**
- **Maven**
- **Page Object Model (POM)**
- **Log4j2**
- **Extent Reports**
- **Git**
- **GitHub**
- **Jenkins**
- **Chrome**
- **Edge**
- **Firefox**
- **Eclipse IDE**

---

# 📂 Project Structure

```text
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
├── screenshots
├── logs
├── test-output
├── pom.xml
├── testng.xml
└── README.md
