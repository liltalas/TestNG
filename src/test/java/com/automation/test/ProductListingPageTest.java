package com.automation.test;

import org.testng.annotations.Test;

public class ProductListingPageTest {

    @Test(groups = {"Sunshine", "Smoke"}) //use {} when used more than one string
    public void verifyEachProductPrice(){
        System.out.println("Test - Verify Each Product Price");
    }

    @Test
    public void verifyEachProductHasStockInformation(){
        System.out.println("Test - Verify Each Product Stock Information");
    }

    @Test
    public void verifyEachProductHasAddToCartButton(){
        System.out.println("Test - Verify Each Product add to cart button");
    }
}
