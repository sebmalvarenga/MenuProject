import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DeliveryTestDelivery {

    @org.junit.jupiter.api.Test
    public void testOrderItemOne() {
        InputStream sysInBackup = System.in; // backup System.in to restore it later
        ByteArrayInputStream in = new ByteArrayInputStream("1 -1 y n".getBytes());

        Order order = Delivery.placeOrder(in);

        assertEquals(8.78, order.getCost(),  0.01);
        assertEquals(22, order.getTime());

        // optionally, reset System.in to its original
        System.setIn(sysInBackup);
    }

    @org.junit.jupiter.api.Test
    public void testOrderItemTwo() {
        InputStream sysInBackup = System.in; // backup System.in to restore it later
        ByteArrayInputStream in = new ByteArrayInputStream("2 -1 y n".getBytes());

        Order order = Delivery.placeOrder(in);

        assertEquals(9.88, order.getCost(),  0.01);
        assertEquals(26, order.getTime());

        // optionally, reset System.in to its original
        System.setIn(sysInBackup);
    }

    @org.junit.jupiter.api.Test
    public void testOrderItemThree() {
        InputStream sysInBackup = System.in; // backup System.in to restore it later
        ByteArrayInputStream in = new ByteArrayInputStream("3 -1 y n".getBytes());

        Order order = Delivery.placeOrder(in);

        assertEquals(10.98, order.getCost(),  0.01);
        assertEquals(35, order.getTime());

        // optionally, reset System.in to its original
        System.setIn(sysInBackup);
    }

    @org.junit.jupiter.api.Test
    public void testOrderItemFour() {
        InputStream sysInBackup = System.in; // backup System.in to restore it later
        ByteArrayInputStream in = new ByteArrayInputStream("4 -1 y n".getBytes());

        Order order = Delivery.placeOrder(in);

        assertEquals(12.08, order.getCost(),  0.01);
        assertEquals(25, order.getTime());

        // optionally, reset System.in to its original
        System.setIn(sysInBackup);
    }
    @org.junit.jupiter.api.Test
    public void testOrderTwoItemOne() {
        InputStream sysInBackup = System.in; // backup System.in to restore it later
        ByteArrayInputStream in = new ByteArrayInputStream("1 1 -1 y n".getBytes());

        Order order = Delivery.placeOrder(in);

        assertEquals(10.97, order.getCost(),  0.01);
        assertEquals(22, order.getTime());

        // optionally, reset System.in to its original
        System.setIn(sysInBackup);
    }

    @org.junit.jupiter.api.Test
    public void testOrderTwoItemTwo() {
        InputStream sysInBackup = System.in; // backup System.in to restore it later
        ByteArrayInputStream in = new ByteArrayInputStream("2 2 -1 y n".getBytes());

        Order order = Delivery.placeOrder(in);

        assertEquals(13.17, order.getCost(),  0.01);
        assertEquals(26, order.getTime());

        // optionally, reset System.in to its original
        System.setIn(sysInBackup);
    }

    @org.junit.jupiter.api.Test
    public void testOrderTwoItemThree() {
        InputStream sysInBackup = System.in; // backup System.in to restore it later
        ByteArrayInputStream in = new ByteArrayInputStream("3 3 -1 y n".getBytes());

        Order order = Delivery.placeOrder(in);

        assertEquals(15.37, order.getCost(),  0.01);
        assertEquals(35, order.getTime());

        // optionally, reset System.in to its original
        System.setIn(sysInBackup);
    }

    @org.junit.jupiter.api.Test
    public void testOrderTwoItemFour() {
        InputStream sysInBackup = System.in; // backup System.in to restore it later
        ByteArrayInputStream in = new ByteArrayInputStream("4 4 -1 y n".getBytes());

        Order order = Delivery.placeOrder(in);

        assertEquals(17.57, order.getCost(),  0.01);
        assertEquals(25, order.getTime());

        // optionally, reset System.in to its original
        System.setIn(sysInBackup);
    }
}
