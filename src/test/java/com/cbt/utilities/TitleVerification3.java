package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification3 {
    public static void main(String[] args) {


        List<String> urls = Arrays.asList("https://luluandgeorgia.com", "https://wayfair.com", "https://walmart.com", "https://westelm.com");

        for (String url : urls) {
            WebDriver driver = BrowserFactory.getDriver("chrome");
            driver.get(url);

            if(url.contains(driver.getTitle().replace(" ", "").toLowerCase())) {
                System.out.println("PASSED!");
            }else{
                System.out.println("FAILED!");
                System.out.println("url = " + url);
                System.out.println("title =" + driver.getTitle());
            }

            driver.quit();
        }

    }
}
