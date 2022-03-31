import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Order {
    private ArrayList<MenuItem> menuItems;
    private Boolean deliverTOF;
    private Double tipPercentage;
    private Double totalCost;
    private Integer finalTime;
    public Order(ArrayList<MenuItem> menuItems2, Boolean tOF, Double tipPercentage1, Double totalcost1, Integer fT){
        menuItems= menuItems2;
        deliverTOF= tOF;
        tipPercentage= tipPercentage1;
        totalCost= totalcost1;
        finalTime= fT;

    }
    public Order(){
        menuItems= new ArrayList<MenuItem>();
        deliverTOF= false;
        tipPercentage= 0.0;
        totalCost= 0.0;
        finalTime= 0;
    }

    public static void main(String[] args) {

    }

    public Boolean isDelivery(){
        return deliverTOF;
    }
    public void changeTip(Double a){
        tipPercentage= a;
    }
    public void setDelivery(Boolean f){
        deliverTOF= f;
    }
    public void orderToString(){
        System.out.println("Your order items are:");
        for(MenuItem m: menuItems){
            System.out.println(m.toString());
        }
        System.out.println("The total cost is:" + totalCost.toString());
        System.out.println("It will take" + finalTime.toString() + "minutes to be ready");
    }
    public Double getTipPercentage(){
        return tipPercentage;
    }
    public String stringTotalCost(){
        String total= totalCost.toString();
        return total;
    }
    public void addItem(MenuItem a){
        menuItems.add(a);
    }
    public ArrayList getItems(){
        return menuItems;
    }


    public double getTime(){
        ArrayList<Integer> allTimes= new ArrayList<>();
        for(MenuItem m: menuItems){
            allTimes.add(m.getTime());
        }
        Collections.sort(allTimes);
        if(deliverTOF== true){
            int wDeliver= allTimes.get(allTimes.size()-1) + 20;
            allTimes.add(wDeliver);
        }
        if(deliverTOF== false){
            allTimes.add(0);
        }
        finalTime= Collections.max(allTimes);
        return finalTime;
    }
    public double getCost(){
        for(MenuItem s: menuItems){
            totalCost= totalCost + s.getCost();
        }
        double actualTipPercentage= tipPercentage/100;
        double additionalTip= totalCost*actualTipPercentage;
        if(deliverTOF== true){
            totalCost= totalCost +5.99;
        }
        if(deliverTOF== false){
            totalCost= totalCost +0;
        }
        double taxes= totalCost*.10;
        totalCost = totalCost +taxes + additionalTip;
        return totalCost;
    }

}
