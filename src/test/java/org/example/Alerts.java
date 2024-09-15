package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Alerts {

    WebDriver driver;

    @BeforeMethod
    public void dropdownTest() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/alert.xhtml");
    }

    @Test
    public void checkAlert() throws InterruptedException{
        WebElement alertButton= driver.findElement(By.id("j_idt88:j_idt91"));
        alertButton.click();

        Alert alert= driver.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();

    }
}
