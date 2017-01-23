package com.epam.m6w1;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.mockito.Mockito;
import org.testng.Assert;
import org.testng.annotations.*;
import com.epam.m6w1.Choclate;

/*
import static com.epam.m6w1.Candy.Taste.CLASSIC;
import static com.epam.m6w1.Candy.Taste.HONEY;
import static com.epam.m6w1.Candy.Taste.MENTHOL;
*/
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
    /*
    @Ignore
    @Test
    public void testAddItemTotalQuantaty() {
        Choclate choclate = new Choclate();
        order.addItem(choclate, 2);
        int totalQuantity = order.getTotalQuantity();
        Assert.assertEquals(totalQuantity, 2);
    }

    @Ignore
    @Test
    public void testAddItemTotalPrice() {
        Choclate choclate = new Choclate();
        //Taste taste = choclate.getSpecialParameter();
        order.addItem(choclate, 2);
        int totalPrice = order.getTotalPrice();
        Assert.assertEquals(totalPrice, 420);
    }

    @Ignore
    @Test(dataProvider = "candyFeeder")
    public void testCreatingCandy(String name, int quantaty, int price, Candy.Taste taste) {
        Candy candy = new Candy(name, quantaty, price, taste);

    }

    @DataProvider (name = "candyFeeder")
    public Object [][] fedder() {
        return new Object [][] {{"Candy1", 1, 100, MENTHOL}, {"Candy2", 2, 200, HONEY}, {"Candy3", 3, 300, CLASSIC}};
    }
    */
    @Test
    public void testMockGetTotalPrice() {
        Order orderForMock;
        orderForMock = Mockito.mock(Order.class);
        Mockito.when(orderForMock.getTotalPrice()).thenReturn(99);
        Assert.assertEquals(50, orderForMock.getTotalPrice());
    }


}
