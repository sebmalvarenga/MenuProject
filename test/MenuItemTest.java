import static org.junit.jupiter.api.Assertions.assertEquals;

public class MenuItemTest {

    @org.junit.jupiter.api.Test
    public void testDefaultConstructor() {
        MenuItem item = new MenuItem();
        assertEquals(0, item.getCost());
        assertEquals(0, item.getTime());
    }

    @org.junit.jupiter.api.Test
    public void testGetAndSetName() {
        MenuItem item = new MenuItem();
        item.setName("hot dog");
        assertEquals("hot dog", item.getName());
        item.setName("tortilla");
        assertEquals("tortilla", item.getName());
    }

    @org.junit.jupiter.api.Test
    public void testGetAndSetPrice() {
        MenuItem item = new MenuItem();
        item.setCost(12.99);
        assertEquals(12.99, item.getCost(), 0.01);
        item.setCost(5.99);
        assertEquals(5.99, item.getCost(), 0.01);
    }

    @org.junit.jupiter.api.Test
    public void testGetAndSetTime() {
        MenuItem item = new MenuItem();
        item.setTime(12);
        assertEquals(12, item.getTime());
        item.setTime(5);
        assertEquals(5, item.getTime());
    }

    @org.junit.jupiter.api.Test
    public void testParamConstructor() {
        MenuItem item = new MenuItem(12.99, 5, "Hot Dog");
        assertEquals(12.99, item.getCost(), 0.01);
        assertEquals(5, item.getTime());

        MenuItem item2 = new MenuItem(200.13, 75, "World's Largest Cuban Sandwich");
        assertEquals(200.13, item2.getCost(), 0.01);
        assertEquals(75, item2.getTime());
    }

    @org.junit.jupiter.api.Test
    public void testToString() {
        MenuItem item = new MenuItem(12.99, 5, "Hot Dog");
        assertEquals("Hot Dog $12.99", item.toString());

        MenuItem item2 = new MenuItem(200.13, 75, "World's Largest Cuban Sandwich");
        assertEquals("World's Largest Cuban Sandwich $200.13", item2.toString());

    }
}
