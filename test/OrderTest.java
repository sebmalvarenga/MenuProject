import static org.junit.jupiter.api.Assertions.*;

public class OrderTest {

    @org.junit.jupiter.api.Test
    public void testDefaultConstructor() {
        Order order = new Order();
        assertEquals(0, order.getCost(), 0.01);
        assertEquals(0, order.getTime());
    }

    @org.junit.jupiter.api.Test
    public void testAddItem() {
        MenuItem item = new MenuItem();
        item.setCost(12.99);
        item.setTime(200);

        Order order = new Order();
        assertEquals(0, order.getItems().size());

        order.addItem(item);

        assertEquals(14.29, order.getCost(), 0.01);
        assertEquals(200, order.getTime());
        assertEquals(1, order.getItems().size());
    }

    @org.junit.jupiter.api.Test
    public void testAddTwoItem() {
        MenuItem item = new MenuItem();
        item.setCost(12.99);
        item.setTime(7);

        MenuItem item2 = new MenuItem();
        item2.setCost(15.99);
        item2.setTime(140);

        Order order = new Order();
        order.addItem(item);
        order.addItem(item2);

        assertEquals(31.88, order.getCost(), 0.01);
        assertEquals(140, order.getTime());
        assertEquals(2, order.getItems().size());
    }

    @org.junit.jupiter.api.Test
    public void testAddItemDelivery() {
        MenuItem item = new MenuItem();
        item.setCost(12.99);
        item.setTime(200);

        Order order = new Order();
        order.addItem(item);

        assertFalse(order.isDelivery());

        order.setDelivery(true);

        assertTrue(order.isDelivery());
        assertEquals(20.87, order.getCost(), 0.01);
        assertEquals(220, order.getTime());
    }

    @org.junit.jupiter.api.Test
    public void testToString() {
        MenuItem item = new MenuItem();
        item.setCost(12.99);
        item.setTime(200);

        Order order = new Order();
        order.addItem(item);
        order.setDelivery(true);

        String str = order.toString();
        //No test here. Feel free to get creative. The line above exists
        //only to ensure that you have created a toString method for
        //your Order class.
    }
}
