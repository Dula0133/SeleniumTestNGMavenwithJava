package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WorkingWithTestBoxes {

    WebDriver driver;

    @BeforeMethod
    public void openLinkPage(){
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/input.xhtml");
    }

    @Test
    //Type name
    public void testBox(){
        WebElement name= driver.findElement(By.xpath("//input[@id='j_idt88:name']"));
        name.sendKeys("Dulashi Yapa");
    }

    //Check the textbox is enabled
    @Test
    public void textBoxAvailable(){
        Boolean enable= driver.findElement(By.id("j_idt88:j_idt93")).isEnabled();
        System.out.println("Text box is"+enable);
    }

    //Clear the text
    @Test
    public void textClear(){
        WebElement clearText= driver.findElement(By.xpath("//input[@id='j_idt88:j_idt95']"));
        clearText.clear();
    }

    //Get Text
    @Test
    public void getText(){
       // String typedText= driver.findElement(By.xpath("//input[@id='j_idt88:j_idt97']")).getText(); there is no text
        String typedText= driver.findElement(By.xpath("//input[@id='j_idt88:j_idt97']")).getAttribute("value"); //has a value only

        System.out.println("The test is "+typedText);
    }
}
