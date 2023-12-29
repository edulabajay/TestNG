package com.testpackage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Googletest {


    WebDriver driver;

    @BeforeClass
    public void setup() {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        // Initialize the Chrome driver
        driver = new ChromeDriver();
        
    }
	
    @Test
    public void test() {
    	
    }
}
