package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class WorkingwithDropdowns {

    WebDriver driver;

    @BeforeMethod
    public void dropdownTest(){
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/select.xhtml");
    }

    @Test
    public void dropdownTest1(){
        //select value in basic dropdown
        WebElement dropdown= driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
        Select select=new Select(dropdown);
        select.selectByVisibleText("Cypress");
    }

    @Test
    public void getCount(){
        //get count of options and texts
        WebElement dropdown= driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
        Select select=new Select(dropdown);
        List<WebElement> getcount= select.getOptions();
        int size= getcount.size();
        System.out.println("The size of dropdown is " +size);

        for(WebElement element:getcount){
            System.out.println(element.getText());
        }
    }


}
