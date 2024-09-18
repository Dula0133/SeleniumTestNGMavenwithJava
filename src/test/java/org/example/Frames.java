package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Frames {

    WebDriver driver;

    @BeforeMethod
    public void frameTest() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/frame.xhtml");
    }

    @Test
    public void navigatetoFrame(){
        driver.switchTo().frame(0);
        WebElement clickButton= driver.findElement(By.xpath("//button[@id='Click']"));
        clickButton.click();
        String text= clickButton.getText();
        System.out.println("Clicked the Button with message:"+text);
    }

}
