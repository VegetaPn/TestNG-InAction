package com.yanhaonan;

import org.testng.Assert;
import org.testng.annotations.*;

/**
 * Created by Vegeta on 3/19/17.
 */
@Test
public class FoodMachineTest {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("\nBefore suite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After suite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before test");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After test");
    }

    @BeforeGroups(groups = "defaultGroup")
    public void beforeGroups() {
        System.out.println("Before groups");
    }

    @AfterGroups(groups = "defaultGroup")
    public void afterGroups() {
        System.out.println("After groups");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After method");
    }

    @Test(groups = "defaultGroup")
    public void testFoodMachine() {
        System.out.println("In test");
        FoodMachine foodMachine = new FoodMachine();
        Assert.assertTrue(foodMachine.product());
    }
}
