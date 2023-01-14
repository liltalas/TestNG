package com.automation.test;

import org.testng.annotations.Test;

public class OrderCancellationOrderTest {
    @Test
    public void verifyUserCanCancelOrder(){
        System.out.println("Test - verify user can cancel the order");
    }

    @Test
    public void verifyUserCannotCancelOrderAfterShipment(){
        System.out.println("Test - verify user cannot cancel the order after it's shipped");
    }
}
