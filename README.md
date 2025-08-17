# TestNG-Learn 🚀

This repository is my personal learning space for **TestNG**, **Selenium WebDriver**, and related automation testing concepts.  
It contains hands-on code, notes, and study materials to prepare for QA/SDET interviews and real-world automation projects.  

---

## 📂 Repository Structure
- **/src/main/java/com/TestNGLearn/** → Contains all practice test classes:
  - `GoogleTest` → TestNG basics with priority, groups, and search/element validation on Google.
  - `GoogleTitleTest` → Validating page title and logo using TestNG `Assert`.
  - `TestNGFeatures` → Demonstrates `dependsOnMethods`, priorities, and group execution.
  - `InvocationCountTest` → Running a test multiple times with `invocationCount`.
  - `ExceptionTimeOutTest` → Handling `expectedExceptions` and `timeOut` in tests.
  - `TestNGBasic` → (future use for fundamentals).
- **/notes/** → Contains interview notes, cheat sheets, and PDFs.
- `testng.xml` → Central TestNG suite configuration to run all classes together.

---

## ⚡ Features Covered
- TestNG Annotations (`@BeforeMethod`, `@AfterMethod`, `@Test`)
- Prioritization & Grouping of tests
- `dependsOnMethods` for test dependencies
- Exception Handling with `expectedExceptions`
- Timeout handling for infinite loops
- Assertion techniques (`assertEquals`, `assertTrue`)
- Running test multiple times with `invocationCount`
- TestNG suite execution with `testng.xml`
- Selenium WebDriver basics:
  - Launching Chrome using **WebDriverManager**
  - Locating elements by `By.name`, `By.xpath`
  - Validating search, logo, buttons, and title on Google

---

## 🛠️ Setup & Run
1. Clone the repo:
   ```bash
   git clone https://github.com/thejanmejay/TestNG-Learn.git
````

2. Import the project into **Eclipse/IntelliJ** as a Maven project.
3. Make sure you have:

   * Java (JDK 8+)
   * Maven
   * TestNG plugin
4. Run any test class:

   ```bash
   mvn test
   ```

   Or run using **testng.xml**.

---

## 📘 Study Materials

All **interview notes and PDFs** (like TestNG cheat sheets) will be added here for quick revision.
Use this repo as both a **code playground** and a **study reference** for TestNG & Selenium.

---

## ✅ To-Do (Learning Roadmap)

* [ ] Add **DataProviders** (parameterization in TestNG)
* [ ] Implement **Parallel Execution**
* [ ] Integrate **ExtentReports** for reporting
* [ ] Add **Page Object Model (POM)** examples
* [ ] Explore **Cross-browser testing**

---

## 🤝 Contribution

This repo is mainly for **self-learning**, but if you want to share improvements or suggestions, feel free to fork and raise a PR.

---

## 🧑‍💻 Author

**Janmejay Singh**
QA Engineer | Test Automation Enthusiast
📌 Building strong foundations in TestNG & Selenium

Do you want me to also include **badges** (like Java version, TestNG, Selenium, etc.) at the top for a more professional GitHub look?
```
