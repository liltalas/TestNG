package com.automation.test;

import org.testng.annotations.Test;

public class CartPageTest extends BaseTest {
    @Test
    public void verifyUserCanRemoveItemFromCart(){
        System.out.println("Test - Verify user can remove item from cart");
        throw new RuntimeException("Test Failed!");
    }

    @Test(dependsOnMethods = "verifyUserCanRemoveItemFromCart")
    public void verifyUserCanAddItemIntoCart(){
        System.out.println("Test - Verify user can add item into cart");
    }

    @Test(dependsOnMethods = "verifyUserCanAddItemIntoCart")
    public void verifyUserCanChangeQuantityOfItemOnCart(){
        System.out.println("Test - Verify user can change quantity ");
    }
}
