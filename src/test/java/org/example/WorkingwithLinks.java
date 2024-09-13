package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WorkingwithLinks {

    WebDriver driver;

    @BeforeMethod
    public void openLinkPage(){
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/link.xhtml");
    }

    @Test
    public void testLinks(){
        WebElement homeDashboard= driver.findElement(By.linkText("Go to Dashboard"));
        homeDashboard.click();
        String actualURL=("https://www.leafground.com/dashboard.xhtml");
        String currentURL=driver.getCurrentUrl();
        if(currentURL.equals(actualURL)){
            System.out.println("Passed the test");
        }
        else {
            System.out.println("Failed the Test");
        }
    }

    @AfterMethod
    public void endTest(){
//        driver.quit();
    }
}
