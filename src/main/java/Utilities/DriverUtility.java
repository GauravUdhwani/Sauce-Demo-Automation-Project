package Utilities;

import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.WebDriver;

public class DriverUtility {

    public static boolean isSessionActive(WebDriver driver) {

        if (driver == null) {
            return false;
        }

        try {
            driver.getTitle();
            return true;
        }
        catch (NoSuchSessionException e) {
            return false;
        }
        catch (Exception e) {
            return false;
        }
    }
}