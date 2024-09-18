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

    @Test
    public void cancelAlert() throws InterruptedException {
        WebElement alertBox= driver.findElement(By.id("j_idt88:j_idt93"));
        alertBox.click();

        Alert confirmBox= driver.switchTo().alert();
        Thread.sleep(2000);
        confirmBox.dismiss();

    }

    @Test
    public void dialogAlert() throws InterruptedException {
        //prompt dialog
        WebElement alertBox2= driver.findElement(By.id("j_idt88:j_idt104"));
        alertBox2.click();

        Alert confirmBox2= driver.switchTo().alert();
        confirmBox2.sendKeys("Dulashi Yapa");
        Thread.sleep(2000);
        confirmBox2.accept();

    }

}
