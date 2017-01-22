package com.epam.m6w1;

import org.testng.Assert;
import org.testng.annotations.*;
import com.epam.m6w1.Choclate;

public class TestOrder {

    private Order order;

    @BeforeMethod(alwaysRun = true)
    public void beforeMethod() {
        System.out.println("Before Method");
        order = new Order();
    }


    @AfterMethod(alwaysRun = true)
    public void afterMethod() {
        System.out.println("After Method");
        order.clear();
    }

    @Test
    public void testAddItemTotalQuantaty() {
        Choclate choclate = new Choclate();
        order.addItem(choclate, 2);
        int totalQuantity = order.getTotalQuantity();
        Assert.assertEquals(totalQuantity, 2);
    }

    @Test
    public void testAddItemTotalPrice() {
        Choclate choclate = new Choclate();
        order.addItem(choclate, 2);
        int totalPrice = order.getTotalPrice();
        Assert.assertEquals(totalPrice, 420);
    }


}
