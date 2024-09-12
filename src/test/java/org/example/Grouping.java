package org.example;
import org.testng.annotations.Test;

public class Grouping {
    // S=Smoke R=Regression

    @Test(groups= {"S","R"})
    public void test01(){
        System.out.println("This is Smoke and Regression");
    }

    @Test(groups= {"R"})
    public void test02(){
        System.out.println("This is Regression");
    }

    @Test(groups= {"S"})
    public void test03(){
        System.out.println("This is Smoke");
    }

    @Test
    public void test04(){
        System.out.println("This is not Smoke or Regression");
    }

}
