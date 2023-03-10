package com.automation.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {

    // @BeforeMethod - will be printed before each method
    // @BeforeClass - prints only once before anything
    // @BeforeSuite - prints before anything only once
    // @AfterSuite - only once, after everything
    // @AfterMethod - After every test / any test method

    @BeforeMethod
    public void setUp(){
        System.out.println("Open Browser");
    }

    @AfterMethod
    public void cleanUp(){
        System.out.println("Close Browser");
    }
}
