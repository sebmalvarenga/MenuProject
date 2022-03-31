import java.io.InputStream;
import java.util.Scanner;


public class Delivery1 {
    public static void main(String[] args) {

    }

    public static Order placeOrder(InputStream in) {
        Scanner keyboard = new Scanner(in);
        Order order = new Order();
        System.out.println("Welcome to My Canton! On our menu we currently offer:");
        System.out.println("1. Pupusas");
        System.out.println("2. Tamales");
        System.out.println("3. Huevos Rancheros");
        System.out.println("4. Carne Asada ");
        System.out.println("What number would you like to order?");
        Integer menuItemNumber= keyboard.nextInt();
        while(menuItemNumber > 0){
            MenuItem item= new MenuItem();
            item.makeMenuItem(menuItemNumber);
            order.addItem(item);
            System.out.println("What number would you like to order?");
            menuItemNumber= keyboard.nextInt();
        }
        System.out.println("Would you like deliver? y/n");
        String deliveryOrNo= keyboard.next();
        String yes = "y";
        if(deliveryOrNo.equals(yes)){
            order.setDelivery(true);
        }
        System.out.println("Would you like to tip? y/n");
        String tipOrNo= keyboard.next();
        if(tipOrNo.equals(yes)){
            System.out.println("How much of a tip 1-40%:");
            double tipAmount1= keyboard.nextDouble();
            if(tipAmount1 <= 0.0){
                System.out.println("Invalid amount! How much of a tip 1-40%:");
                tipAmount1= keyboard.nextDouble();
            }
            order.changeTip(tipAmount1);
        }

        return order;
    }

}


