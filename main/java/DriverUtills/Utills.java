package DriverUtills;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by ihor on 04.01.17.
 */
public class Utills {
    private static WebDriver driver;
    public static WebDriver getDriver(){
        if(driver==null){
            driver = new ChromeDriver();
        }
        return driver;
    }
}
