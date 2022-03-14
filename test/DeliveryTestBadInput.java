import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DeliveryTestBadInput {

    @org.junit.jupiter.api.Test
    public void testOrderBadItem() {
        InputStream sysInBackup = System.in; // backup System.in to restore it later
        ByteArrayInputStream in = new ByteArrayInputStream("5 4 -1 n n".getBytes());

        Order order = Delivery.placeOrder(in);

        assertEquals(5.49, order.getCost(),  0.01);
        assertEquals(5, order.getTime());

        // optionally, reset System.in to its original
        System.setIn(sysInBackup);
    }

    @org.junit.jupiter.api.Test
    public void testOrderBadDelivery() {
        InputStream sysInBackup = System.in; // backup System.in to restore it later
        ByteArrayInputStream in = new ByteArrayInputStream("3 -1 c n n".getBytes());

        Order order = Delivery.placeOrder(in);
        assertEquals(4.39, order.getCost(),  0.01);
        assertEquals(15, order.getTime());
        // optionally, reset System.in to its original
        System.setIn(sysInBackup);
    }

    @org.junit.jupiter.api.Test
    public void testOrderBadTip() {
        InputStream sysInBackup = System.in; // backup System.in to restore it later
        ByteArrayInputStream in = new ByteArrayInputStream("1 -1 y c n".getBytes());

        Order order = Delivery.placeOrder(in);
        assertEquals(8.78, order.getCost(),  0.01);
        assertEquals(22, order.getTime());
        // optionally, reset System.in to its original
        System.setIn(sysInBackup);
    }

    @org.junit.jupiter.api.Test
    public void testOrderBadTipNeg() {
        InputStream sysInBackup = System.in; // backup System.in to restore it later
        ByteArrayInputStream in = new ByteArrayInputStream("4 -1 y y -1.0 20.0".getBytes());

        Order order = Delivery.placeOrder(in);
        assertEquals(13.08, order.getCost(),  0.01);
        assertEquals(25, order.getTime());
        // optionally, reset System.in to its original
        System.setIn(sysInBackup);
    }

    @org.junit.jupiter.api.Test
    public void testOrderBadTipZero() {
        InputStream sysInBackup = System.in; // backup System.in to restore it later
        ByteArrayInputStream in = new ByteArrayInputStream("4 -1 y y 0.0 20.0".getBytes());

        Order order = Delivery.placeOrder(in);
        assertEquals(13.08, order.getCost(),  0.01);
        assertEquals(25, order.getTime());
        // optionally, reset System.in to its original
        System.setIn(sysInBackup);
    }

    @org.junit.jupiter.api.Test
    public void testOrderBadTipTooBig() {
        InputStream sysInBackup = System.in; // backup System.in to restore it later
        ByteArrayInputStream in = new ByteArrayInputStream("4 -1 y y 40.0 20.0".getBytes());

        Order order = Delivery.placeOrder(in);
        assertEquals(13.08, order.getCost(),  0.01);
        assertEquals(25, order.getTime());
        // optionally, reset System.in to its original
        System.setIn(sysInBackup);
    }
}
