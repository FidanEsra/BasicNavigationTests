package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;


public class TitleVerification {
    public static void main(String[] args) throws Exception {
        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
                "http://practice.cybertekschool.com/dropdown",
                "http://practice.cybertekschool.com/login");

        WebDriver driver = BrowserFactory.getDriver("chrome");

        List<String> titles = new ArrayList<>();

        for (int i = 0; i < urls.size() ; i++) {
            driver.get(urls.get(i)); // driver.getCurrentUrl()
            titles.add(driver.getTitle());
            if (driver.getCurrentUrl().startsWith("http://practice.cybertekschool.com.")) {
                System.out.println("TEST PASSED!");
            } else {
                System.out.println("TEST FAILED!");
            }
        }

        for (int i = 0; i < titles.size()-1 ; i++) {
            StringUtility.verifyEquals(titles.get(i),titles.get(i+1)); // 0-1, 1-2
        }

        StringUtility.verifyEquals(titles.get(0),titles.get(2)); // 0-2


        driver.quit();


    }
}
