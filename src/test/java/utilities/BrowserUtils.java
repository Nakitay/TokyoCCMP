package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
import org.junit.Assert;

import java.time.Duration;
import java.util.Set;

public class BrowserUtils {
    public static void sleep(int second) {

        try {
            Thread.sleep(second * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }

    }


    public static void switchWindowVerify(WebDriver driver, String expectedInURL, String ExpectedTitle) {
        //Return and store all window handle in a Set

        Set<String> allWindowHandles = driver.getWindowHandles();
        for (String each : allWindowHandles) {
            driver.switchTo().window(each);
            System.out.println("Current URL: " + driver.getCurrentUrl());

            if (driver.getCurrentUrl().contains(expectedInURL)) {
                break;
            }
        }

        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains(ExpectedTitle));
    }
}
//
//
//    public static void verifyTitle(WebDriver driver, String expectedTitle) {
//        Assert.assertEquals(driver.getTitle(), expectedTitle);
//
//
//    }
//
//    public static void verifyTitleContains(WebDriver driver, String expectedTitle) {
//        Assert.assertTrue(driver.getTitle().contains(expectedTitle));
//
//
//    }
//
//    WebDriverWait wait  = new  WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
//
//
//
//
//
//}
//
