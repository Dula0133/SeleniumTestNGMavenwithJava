package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Point;
import org.openqa.selenium.Dimension;
import org.testng.annotations.Test;

public class ParallelTests {

    @Test(priority = 0, threadPoolSize = 2, invocationCount = 1)
    public void openGoogle() {
        WebDriver driver = new ChromeDriver();
        // Maximize window to ensure it covers the whole screen
        driver.manage().window().maximize();

        // Get the current window size
        int screenWidth = driver.manage().window().getSize().getWidth();
        int screenHeight = driver.manage().window().getSize().getHeight();

        // Set window size to half of the screen width and full height
        driver.manage().window().setSize(new Dimension(screenWidth / 2, screenHeight));
        // Position the window to the left side
        driver.manage().window().setPosition(new Point(0,0));

        driver.get("https://www.google.com/");
    }

    @Test(priority = 1)
    public void openEdge() {
        WebDriver driver = new ChromeDriver();
        // Maximize window to ensure it covers the whole screen
        driver.manage().window().maximize();

        // Get the current window size
        int screenWidth = driver.manage().window().getSize().getWidth();
        int screenHeight = driver.manage().window().getSize().getHeight();

        // Set window size to half of the screen width and full height
        driver.manage().window().setSize(new Dimension(screenWidth / 2, screenHeight));
        // Position the window to the right side
        driver.manage().window().setPosition(new Point(screenWidth / 2, 0));

        driver.get("http://edge.com/");
    }
}