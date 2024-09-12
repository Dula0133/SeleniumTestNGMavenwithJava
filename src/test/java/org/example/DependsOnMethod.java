package org.example;

import org.testng.annotations.Test;

public class DependsOnMethod {

    @Test()
    public void oLevel() {
        System.out.println("oLevel");
    }

    @Test(priority = 1, dependsOnMethods = "oLevel")
//    @Test(priority = 1, dependsOnMethods = "oLevel",enabled = false)campus test will not run give an error
    public void aLevel() {
        System.out.println("aLevel");
    }

    @Test(priority = 2, dependsOnMethods = "aLevel")
    public void campus() {
        System.out.println("campus");
    }

}

