package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification2 {
    public static void main(String[] args) throws Exception {

        WebDriver driver = BrowserFactory.getDriver("chrome");


        List<String> urls = Arrays.asList("https://luluandgeorgia.com", "https://wayfair.com/", "https://walmart.com", "http://westelm.com/");

        for (String url : urls) {
            driver.get(url);
            Thread.sleep(3000);

           if(url.contains(driver.getTitle().replace(" ", "").toLowerCase())) {
               System.out.println("PASSED!");
           }else{
               System.out.println("FAILED!");
               System.out.println("url = " + url);
               System.out.println("title =" + driver.getTitle());
           }
        }

        driver.quit();

    }
}
