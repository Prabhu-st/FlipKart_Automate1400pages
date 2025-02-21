# Flipkart Men's Footwear Scraper

## Overview
This project automates the navigation of Flipkart's Men's Footwear section using **Java & Selenium**, extracting product details from **all 1400 pages**. It stores all product names in a list and filters for products containing "Black" in the name.

## Features
- **Automates Flipkart navigation** for Men's Footwear
- **Extracts product details** (name, price, and link)
- **Handles pagination up to 1400 pages** automatically
- **Filters and displays** black shoes
- **Uses Selenium WebDriver** for browser automation
- **Bypasses login pop-ups** on Flipkart
- **Handles slow-loading elements** using explicit waits

## Prerequisites
Ensure you have the following installed before running the script:

- **Java 8+** (Check version using `java -version`)
- **Maven** (Check version using `mvn -version`)
- **Google Chrome** (Latest version, check version using `chrome://settings/help`)
- **ChromeDriver** (Matching your Chrome version, download from [here](https://chromedriver.chromium.org/downloads))
- **Selenium WebDriver** (Managed via Maven dependencies)

## Installation Guide

### 1. Clone the Repository
```sh
git clone https://github.com/yourusername/flipkart-footwear-automation.git
cd flipkart-footwear-automation
```

### 2. Set Up ChromeDriver
- Download the appropriate ChromeDriver version from [this link](https://chromedriver.chromium.org/downloads).
- Extract it and update the `webdriver.chrome.driver` path in the script:
```java
System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
```

### 3. Install Dependencies
Use Maven to install all required dependencies:
```sh
mvn clean install
```

## Running the Script
Execute the Java program using Maven:
```sh
mvn exec:java -Dexec.mainClass="com.flipkart.FootwearScraper"
```

Alternatively, if running directly via Java:
```sh
javac -cp ".;lib/*" com/flipkart/FootwearScraper.java
java -cp ".;lib/*" com.flipkart.FootwearScraper
```

## Expected Behavior
- The script launches Flipkart and closes the login popup (if displayed).
- It navigates to the Men's Footwear section.
- It extracts product details such as **name, price, and links**.
- It automatically **navigates through all 1400 pages**.
- It collects product names into a list.
- Finally, it filters out and prints all shoes containing "Black" in their names.

## Troubleshooting & Tips
- If Flipkart detects automation, consider using **proxy rotation** or **headless browsing**.
- Add **timeouts and explicit waits** to handle slow-loading pages.
- If `ChromeDriver` is outdated, **update it** to match your Chrome version.
- To avoid detection, randomize browser interactions such as scrolling and clicks.

## Future Enhancements
- Store extracted product data into a **CSV file**.
- Include additional product details such as **ratings and reviews**.
- Implement **multi-threading** to speed up scraping.
- Use **Selenium Grid** for distributed execution.


