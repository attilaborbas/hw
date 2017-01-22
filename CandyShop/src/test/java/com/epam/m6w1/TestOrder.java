package com.epam.m6w1;

import org.testng.Assert;
import org.testng.annotations.*;
import com.epam.m6w1.Choclate;

import static com.epam.m6w1.Candy.Taste.CLASSIC;
import static com.epam.m6w1.Candy.Taste.HONEY;
import static com.epam.m6w1.Candy.Taste.MENTHOL;

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

    @Test(dataProvider = "itemFeeder")
    public void testCreateCandy(String name, int quantaty, int price, Candy.Taste taste) {
        Candy candy = new Candy("Cukor", 1, 200, MENTHOL);

    }

    @DataProvider (name = "itemFeeder")
    public Object [][] fedder() {
        return new Object [][] {{"Cukor1", 1, 100, MENTHOL}, {"Cukor2", 2, 200, HONEY}, {"Cukor3", 3, 300, CLASSIC}};
    }


}
