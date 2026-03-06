package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WEbDriverfactory {


    public static WebDriver getDriver(String browserType) {

        if (browserType.equalsIgnoreCase("chrome")) {

            return new ChromeDriver();

        } else if (browserType.equalsIgnoreCase("edge")) {
            return new EdgeDriver();//FirefoxDriver();

        } else {
            System.err.println("Given string doesn't represent any browser.");
            System.err.println("Either that browser doesn't exist or not currently supported.");
            System.err.println("driver = null");
            return null;
        }
    }
}



