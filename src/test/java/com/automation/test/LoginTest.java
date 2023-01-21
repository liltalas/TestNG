package com.automation.test;

import org.testng.annotations.*;

public class LoginTest extends BaseTest {

    @Parameters("browser")
    @Test(groups = "Smoke")

    public void verifyLoginSuccessful(String browser){
        System.out.println("Open Website");
        System.out.println("Do login");
        System.out.println("Verify Login Successfully");
        System.out.println(browser);
    }

    @Test

    public void secondTest(){
        System.out.println("Second test");
    }

    @Test

    public void thirdTest(){
        System.out.println("Third test");
    }

}
