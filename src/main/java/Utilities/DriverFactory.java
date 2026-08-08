package Utilities;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver getDriver(String browser) {

        switch (browser.toLowerCase()) {

            case "chrome":

                ChromeOptions options = new ChromeOptions();

                options.addArguments("--guest");
                options.addArguments("--disable-notifications");
                options.addArguments("--disable-popup-blocking");
                options.addArguments("--disable-save-password-bubble");
                options.addArguments("--disable-features=PasswordLeakDetection");
                options.addArguments("--disable-features=PasswordManagerOnboarding");
                options.addArguments("--disable-sync");

                driver.set(new ChromeDriver(options));
                break;

            case "edge":
				driver.set(new EdgeDriver());
                break;

            case "firefox":
                driver.set(new FirefoxDriver());
                break;

            default:
                throw new IllegalArgumentException("Invalid browser: " + browser);
        }

        return driver.get();
    }

    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void quitDriver() {

        if (driver.get() != null) {
            driver.get().quit();
            driver.remove();
        }
    }
}