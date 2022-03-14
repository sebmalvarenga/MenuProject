import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DeliveryTestTip {

    @org.junit.jupiter.api.Test
    public void testOrderItemOne() {
        InputStream sysInBackup = System.in; // backup System.in to restore it later
        ByteArrayInputStream in = new ByteArrayInputStream("1 -1 n y 10.0".getBytes());

        Order order = Delivery.placeOrder(in);
//        assertTrue( Math.abs(order.getCost() - 2.39) < 0.01);

        assertEquals(2.39, order.getCost(),  0.01);
        assertEquals(2, order.getTime());

        // optionally, reset System.in to its original
        System.setIn(sysInBackup);
    }

    @org.junit.jupiter.api.Test
    public void testOrderItemTwo() {
        InputStream sysInBackup = System.in; // backup System.in to restore it later
        ByteArrayInputStream in = new ByteArrayInputStream("2 -1 n y 15.0".getBytes());

        Order order = Delivery.placeOrder(in);
//        assertTrue( Math.abs(order.getCost() - 3.74) < 0.01);

        assertEquals(3.74, order.getCost(),  0.01);
        assertEquals(6, order.getTime());

        // optionally, reset System.in to its original
        System.setIn(sysInBackup);
    }

    @org.junit.jupiter.api.Test
    public void testOrderItemThree() {
        InputStream sysInBackup = System.in; // backup System.in to restore it later
        ByteArrayInputStream in = new ByteArrayInputStream("3 -1 n y 18.0".getBytes());

        Order order = Delivery.placeOrder(in);
//        assertTrue( Math.abs(order.getCost() - 5.11) < 0.01);

        assertEquals(5.11, order.getCost(),  0.01);
        assertEquals(15, order.getTime());
        // optionally, reset System.in to its original
        System.setIn(sysInBackup);
    }

    @org.junit.jupiter.api.Test
    public void testOrderItemFour() {
        InputStream sysInBackup = System.in; // backup System.in to restore it later
        ByteArrayInputStream in = new ByteArrayInputStream("4 -1 n y 20.0".getBytes());

        Order order = Delivery.placeOrder(in);
//        assertTrue( Math.abs(order.getCost() - 6.49) < 0.01);

        assertEquals(6.49, order.getCost(),  0.01);
        assertEquals(5, order.getTime());

        // optionally, reset System.in to its original
        System.setIn(sysInBackup);
    }

    @org.junit.jupiter.api.Test
    public void testOrderTwoItemOne() {
        InputStream sysInBackup = System.in; // backup System.in to restore it later
        ByteArrayInputStream in = new ByteArrayInputStream("1 1 -1 n y 10.0".getBytes());

        Order order = Delivery.placeOrder(in);
//        assertTrue( Math.abs(order.getCost() - 2.39) < 0.01);

        assertEquals(4.78, order.getCost(),  0.01);
        assertEquals(2, order.getTime());

        // optionally, reset System.in to its original
        System.setIn(sysInBackup);
    }

    @org.junit.jupiter.api.Test
    public void testOrderTwoItemTwo() {
        InputStream sysInBackup = System.in; // backup System.in to restore it later
        ByteArrayInputStream in = new ByteArrayInputStream("2 2 -1 n y 15.0".getBytes());

        Order order = Delivery.placeOrder(in);
//        assertTrue( Math.abs(order.getCost() - 3.74) < 0.01);

        assertEquals(7.48, order.getCost(),  0.01);
        assertEquals(6, order.getTime());

        // optionally, reset System.in to its original
        System.setIn(sysInBackup);
    }

    @org.junit.jupiter.api.Test
    public void testOrderTwoItemThree() {
        InputStream sysInBackup = System.in; // backup System.in to restore it later
        ByteArrayInputStream in = new ByteArrayInputStream("3 3 -1 n y 18.0".getBytes());

        Order order = Delivery.placeOrder(in);
//        assertTrue( Math.abs(order.getCost() - 5.11) < 0.01);

        assertEquals(10.21, order.getCost(),  0.01);
        assertEquals(15, order.getTime());
        // optionally, reset System.in to its original
        System.setIn(sysInBackup);
    }

    @org.junit.jupiter.api.Test
    public void testOrderTwoItemFour() {
        InputStream sysInBackup = System.in; // backup System.in to restore it later
        ByteArrayInputStream in = new ByteArrayInputStream("4 4 -1 n y 20.0".getBytes());

        Order order = Delivery.placeOrder(in);
//        assertTrue( Math.abs(order.getCost() - 6.49) < 0.01);

        assertEquals(12.97, order.getCost(),  0.01);
        assertEquals(5, order.getTime());

        // optionally, reset System.in to its original
        System.setIn(sysInBackup);
    }


}
