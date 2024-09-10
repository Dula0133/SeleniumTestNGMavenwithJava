package org.example;

import org.testng.annotations.Test;

public class PriorityTest {

    @Test(priority = 0)
    public void testLogin(){
        System.out.println("Login");
    }

    @Test(priority = 2)
    public void Create(){
        System.out.println("Create");
    }

    @Test(priority = 1, enabled = false)
    public void testEdit(){
        System.out.println("Edit");
    }

}
