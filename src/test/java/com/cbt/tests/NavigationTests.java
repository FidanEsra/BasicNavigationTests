package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationTests {
    public static void main(String[] args) throws Exception {
        chromeTest();
        fireFoxTest();
        edgeTest();

    }

    public static void chromeTest() throws Exception{
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://www.google.com");
        String title = driver.getTitle();
 //       System.out.println(title);

        driver.navigate().to("https://etsy.com");
        String title2 = driver.getTitle();
//        System.out.println(title2);

        driver.navigate().back();
        String title3 = driver.getTitle();

        StringUtility.verifyEquals(title,title3);
        Thread.sleep(2000);

        driver.navigate().forward();
        String title4 = driver.getTitle();

        StringUtility.verifyEquals(title2,title4);
        Thread.sleep(2000);

        driver.quit();
    }

    public static void fireFoxTest() throws Exception{
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com");
        String title = driver.getTitle();
        System.out.println(title);

        driver.navigate().to("https://etsy.com");
        String title2 = driver.getTitle();
        System.out.println(title2);

        driver.navigate().back();
        String title3 = driver.getTitle();

        StringUtility.verifyEquals(title,title3);
        Thread.sleep(2000);

        driver.navigate().forward();
        String title4 = driver.getTitle();

        StringUtility.verifyEquals(title2,title4);
        Thread.sleep(2000);

        driver.quit();
    }

    public static void edgeTest() throws Exception{
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.google.com");
        String title = driver.getTitle();
        System.out.println(title);

        driver.navigate().to("https://etsy.com");
        String title2 = driver.getTitle();
        System.out.println(title2);

        driver.navigate().back();
        String title3 = driver.getTitle();

        StringUtility.verifyEquals(title,title3);
        Thread.sleep(2000);

        driver.navigate().forward();
        String title4 = driver.getTitle();

        StringUtility.verifyEquals(title2,title4);
        Thread.sleep(2000);

        driver.quit();
    }
}
