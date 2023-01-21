package com.automation.test;

import org.testng.annotations.Test;

public class ProductListingPageTest extends BaseTest{

    @Test(groups = {"KO","Smoke"}, priority = 1) //use {} when used more than one string
    public void verifyEachProductPrice(){
        System.out.println("Test - Verify Each Product Price");
    }

    @Test (groups = "KO", priority = 2)
    public void verifyEachProductHasStockInformation(){
        System.out.println("Test - Verify Each Product Stock Information");
    }

    @Test(priority = 3)
    public void verifyEachProductHasAddToCartButton(){
        System.out.println("Test - Verify Each Product add to cart button");
    }
}
