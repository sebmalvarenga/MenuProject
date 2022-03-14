import java.io.InputStream;
import java.util.Scanner;

public class Delivery {

    public static void main(String[] args) {
        placeOrder(System.in);
    }

    public static Order placeOrder(InputStream in) {
        Scanner keyboard = new Scanner(in);
        Order order = new Order();
        return order;
    }
}
