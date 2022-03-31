
import java.io.InputStream;
import java.util.Scanner;
import java.util.ArrayList;


public class MenuItem {
        private String nameOfItem;
        private Double costOfItem;
        private Integer timeForItem;
        public MenuItem(double cOIt, int tFIt, String nOIt){
            nameOfItem= nOIt;
            costOfItem= cOIt;
            timeForItem= tFIt;
        }
        public MenuItem(){
            nameOfItem= "";
            costOfItem= 0.0;
            timeForItem= 0;

        }

        public static void main(String[] args){
            Scanner keyboard = new Scanner(System.in);
           // MenuItem menuIt= new MenuItem();
        }
        public void makeMenuItem(int orderNumber){
            if(orderNumber == 1){
                nameOfItem= "Pupusas";
                costOfItem= 1.99;
                timeForItem= 2;
            }
            if(orderNumber== 2){
                nameOfItem= "Tamales";
                costOfItem= 2.99;
                timeForItem= 6;
            }
            if(orderNumber==3){
                nameOfItem= "Huevos Rancheros";
                costOfItem= 3.99;
                timeForItem= 15;
            }
            if(orderNumber==4){
                nameOfItem= "Carne Asada";
                costOfItem= 4.99;
                timeForItem= 5;
            }

        }
        public ArrayList<Object> getMenuItem(){
            ArrayList<Object> menuItemInformation= new ArrayList<Object>();
            menuItemInformation.add(nameOfItem);
            menuItemInformation.add(costOfItem);
            menuItemInformation.add(timeForItem);
            return menuItemInformation;
        }
        public void setName(String n){
            nameOfItem= n;

        }
        public void setCost(Double n){
            costOfItem= n;

        }
        public void setTime(Integer n){
            timeForItem= n;
        }
        public String getName(){
            return nameOfItem;
        }
        public Double getCost(){
            return costOfItem;
        }
        public Integer getTime(){
            return timeForItem;
        }
        public String toString(){
            return nameOfItem+ " " +  "$"+costOfItem;
        }

    }




