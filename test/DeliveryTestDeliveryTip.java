import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DeliveryTestDeliveryTip {

    @org.junit.jupiter.api.Test
    public void testOrderItemOne() {
        InputStream sysInBackup = System.in; // backup System.in to restore it later
        ByteArrayInputStream in = new ByteArrayInputStream("1 -1 y y 10.0".getBytes());

        Order order = Delivery.placeOrder(in);

        assertEquals(8.98, order.getCost(),  0.01);
        assertEquals(22, order.getTime());

        // optionally, reset System.in to its original
        System.setIn(sysInBackup);
    }

    @org.junit.jupiter.api.Test
    public void testOrderItemTwo() {
        InputStream sysInBackup = System.in; // backup System.in to restore it later
        ByteArrayInputStream in = new ByteArrayInputStream("2 -1 y y 15.0".getBytes());

        Order order = Delivery.placeOrder(in);

        assertEquals(10.33, order.getCost(),  0.01);
        assertEquals(26, order.getTime());
        // optionally, reset System.in to its original
        System.setIn(sysInBackup);
    }

    @org.junit.jupiter.api.Test
    public void testOrderItemThree() {
        InputStream sysInBackup = System.in; // backup System.in to restore it later
        ByteArrayInputStream in = new ByteArrayInputStream("3 -1 y y 18.0".getBytes());

        Order order = Delivery.placeOrder(in);

        assertEquals(11.70, order.getCost(),  0.01);
        assertEquals(35, order.getTime());
        // optionally, reset System.in to its original
        System.setIn(sysInBackup);
    }

    @org.junit.jupiter.api.Test
    public void testOrderItemFour() {
        InputStream sysInBackup = System.in; // backup System.in to restore it later
        ByteArrayInputStream in = new ByteArrayInputStream("4 -1 y y 20.0".getBytes());

        Order order = Delivery.placeOrder(in);

        assertEquals(13.08, order.getCost(),  0.01);
        assertEquals(25, order.getTime());
        // optionally, reset System.in to its original
        System.setIn(sysInBackup);
    }
    @org.junit.jupiter.api.Test
    public void testOrderTwoItemOne() {
        InputStream sysInBackup = System.in; // backup System.in to restore it later
        ByteArrayInputStream in = new ByteArrayInputStream("1 1 -1 y y 10.0".getBytes());

        Order order = Delivery.placeOrder(in);

        assertEquals(11.37, order.getCost(),  0.01);
        assertEquals(22, order.getTime());

        // optionally, reset System.in to its original
        System.setIn(sysInBackup);
    }

    @org.junit.jupiter.api.Test
    public void testOrderTwoItemTwo() {
        InputStream sysInBackup = System.in; // backup System.in to restore it later
        ByteArrayInputStream in = new ByteArrayInputStream("2 2 -1 y y 15.0".getBytes());

        Order order = Delivery.placeOrder(in);

        assertEquals(14.06, order.getCost(),  0.01);
        assertEquals(26, order.getTime());
        // optionally, reset System.in to its original
        System.setIn(sysInBackup);
    }

    @org.junit.jupiter.api.Test
    public void testOrderTwoItemThree() {
        InputStream sysInBackup = System.in; // backup System.in to restore it later
        ByteArrayInputStream in = new ByteArrayInputStream("3 3 -1 y y 18.0".getBytes());

        Order order = Delivery.placeOrder(in);

        assertEquals(16.80, order.getCost(),  0.01);
        assertEquals(35, order.getTime());
        // optionally, reset System.in to its original
        System.setIn(sysInBackup);
    }

    @org.junit.jupiter.api.Test
    public void testOrderTwoItemFour() {
        InputStream sysInBackup = System.in; // backup System.in to restore it later
        ByteArrayInputStream in = new ByteArrayInputStream("4 4 -1 y y 20.0".getBytes());

        Order order = Delivery.placeOrder(in);

        assertEquals(19.56, order.getCost(),  0.01);
        assertEquals(25, order.getTime());
        // optionally, reset System.in to its original
        System.setIn(sysInBackup);
    }
}
