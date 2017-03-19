package com.yanhaonan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.*;

/**
 * Created by Vegeta on 3/19/17.
 */
@Test
@ContextConfiguration(classes = FoodMachineConfig.class)
public class FoodMachineSpringTest extends AbstractTestNGSpringContextTests {

    @Autowired
    FoodMachine foodMachine;

    @BeforeSuite
    public void beforeSuite() {
//        foodMachine.product();
        System.out.println("\nBefore suite");
    }

    @AfterSuite
    public void afterSuite() {
        foodMachine.product();
        System.out.println("After suite");
    }

    @BeforeTest
    public void beforeTest() {
//        foodMachine.product();
        System.out.println("Before test");
    }

    @AfterTest
    public void afterTest() {
        foodMachine.product();
        System.out.println("After test");
    }

    @BeforeGroups
    public void beforeGroups() {
        foodMachine.product();
        System.out.println("Before groups");
    }

    @AfterGroups
    public void afterGroups() {
        foodMachine.product();
        System.out.println("After groups");
    }

    @BeforeClass
    public void beforeClass() {
        foodMachine.product();
        System.out.println("Before class");
    }

    @AfterClass
    public void afterClass() {
        foodMachine.product();
        System.out.println("After class");
    }

    @BeforeMethod
    public void beforeMethod() {
        foodMachine.product();
        System.out.println("Before Method");
    }

    @AfterMethod
    public void afterMethod() {
        foodMachine.product();
        System.out.println("After method");
    }

    public void testFoodMachine() {
        System.out.println("In test");
        FoodMachine foodMachine = new FoodMachine();
        Assert.assertTrue(foodMachine.product());
    }
}
