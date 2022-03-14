import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DeliveryTestSimple {

    @org.junit.jupiter.api.Test
    public void testOrderItemOne() {
        InputStream sysInBackup = System.in; // backup System.in to restore it later
        ByteArrayInputStream in = new ByteArrayInputStream("1 -1 n n".getBytes());

        Order order = Delivery.placeOrder(in);
//        assertTrue(Math.abs(order.getCost() - 2.19) < 0.01);
//        assertTrue(Math.abs(order.getTimeToComplete() - 2) < 0.01);

        assertEquals(2.19, order.getCost(),  0.01);
        assertEquals(2, order.getTime());


        // optionally, reset System.in to its original
        System.setIn(sysInBackup);
    }

    @org.junit.jupiter.api.Test
    public void testOrderItemTwo() {
        InputStream sysInBackup = System.in; // backup System.in to restore it later
        ByteArrayInputStream in = new ByteArrayInputStream("2 -1 n n".getBytes());

        Order order = Delivery.placeOrder(in);

        assertEquals(3.29, order.getCost(),  0.01);
        assertEquals(6, order.getTime());

        // optionally, reset System.in to its original
        System.setIn(sysInBackup);
    }

    @org.junit.jupiter.api.Test
    public void testOrderItemThree() {
        InputStream sysInBackup = System.in; // backup System.in to restore it later
        ByteArrayInputStream in = new ByteArrayInputStream("3 -1 n n".getBytes());

        Order order = Delivery.placeOrder(in);

        assertEquals(4.39, order.getCost(),  0.01);
        assertEquals(15, order.getTime());
        // optionally, reset System.in to its original
        System.setIn(sysInBackup);
    }

    @org.junit.jupiter.api.Test
    public void testOrderItemFour() {
        InputStream sysInBackup = System.in; // backup System.in to restore it later
        ByteArrayInputStream in = new ByteArrayInputStream("4 -1 n n".getBytes());

        Order order = Delivery.placeOrder(in);

        assertEquals(5.49, order.getCost(),  0.01);
        assertEquals(5, order.getTime());
        // optionally, reset System.in to its original
        System.setIn(sysInBackup);
    }

    @org.junit.jupiter.api.Test
    public void testOrderTwoItemOne() {
        InputStream sysInBackup = System.in; // backup System.in to restore it later
        ByteArrayInputStream in = new ByteArrayInputStream("1 1 -1 n n".getBytes());

        Order order = Delivery.placeOrder(in);
//        assertTrue(Math.abs(order.getCost() - 2.19) < 0.01);
//        assertTrue(Math.abs(order.getTimeToComplete() - 2) < 0.01);

        assertEquals(4.38, order.getCost(),  0.01);
        assertEquals(2, order.getTime());


        // optionally, reset System.in to its original
        System.setIn(sysInBackup);
    }

    @org.junit.jupiter.api.Test
    public void testOrderTwoItemTwo() {
        InputStream sysInBackup = System.in; // backup System.in to restore it later
        ByteArrayInputStream in = new ByteArrayInputStream("2 2 -1 n n".getBytes());

        Order order = Delivery.placeOrder(in);

        assertEquals(6.58, order.getCost(),  0.01);
        assertEquals(6, order.getTime());

        // optionally, reset System.in to its original
        System.setIn(sysInBackup);
    }

    @org.junit.jupiter.api.Test
    public void testOrderTwoItemThree() {
        InputStream sysInBackup = System.in; // backup System.in to restore it later
        ByteArrayInputStream in = new ByteArrayInputStream("3 3 -1 n n".getBytes());

        Order order = Delivery.placeOrder(in);

        assertEquals(8.78, order.getCost(),  0.01);
        assertEquals(15, order.getTime());
        // optionally, reset System.in to its original
        System.setIn(sysInBackup);
    }

    @org.junit.jupiter.api.Test
    public void testOrderTwoItemFour() {
        InputStream sysInBackup = System.in; // backup System.in to restore it later
        ByteArrayInputStream in = new ByteArrayInputStream("4 4 -1 n n".getBytes());

        Order order = Delivery.placeOrder(in);

        assertEquals(10.98, order.getCost(),  0.01);
        assertEquals(5, order.getTime());
        // optionally, reset System.in to its original
        System.setIn(sysInBackup);
    }
}
