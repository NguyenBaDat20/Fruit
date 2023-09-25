/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;
import model.Fruit;
import model.viewOrders;
import view.Menu;

/**
 *
 * @author admin
 */
public class Fruit_Shop_System extends Menu{
    
    ArrayList<Fruit> fruits=new ArrayList<>();;
    ArrayList<viewOrders> od = new ArrayList<>();
    Hashtable<String, ArrayList<viewOrders>>ht = new Hashtable<>();
    Scanner sc = new Scanner(System.in);
    public Fruit_Shop_System( String title, String[] options) {
        super(title, options);
    }
    public String getValue(String msg){
        System.out.print(msg);
        return sc.nextLine();
    }
    public void createFruit(){       
        int id = Integer.parseInt(getValue("ID:"));
        String name = getValue("Enter name Fruit:");
       double price = Double.parseDouble(getValue("Price:"));
        int quantity = Integer.parseInt(getValue("Quantity:"));
        String origin = getValue("Origin:");
        Fruit f = new Fruit(id, name, price, quantity, origin);
        fruits.add(f);
       
        String choice = getValue("Do you want to continue (Y/N):");
        if(choice.equals("Y")||choice.equals("y")){
            createFruit();
        }else {
            return;
        }
    }
    public void displays(){
        for (Fruit fruit : fruits) {
            System.out.println(fruit);
        }
    }
    public void displayOrders(ArrayList<viewOrders> od){
        double total = 0;
        for (viewOrders o : od) {
            System.out.println("Id: "+o.getId()+" - Name: "+o.getProduct()+" -Quantity: "+o.getQuantity()+" -Price: "+o.getPrice());
            total +=o.getPrice()* o.getQuantity();
        }
        System.out.println("Total:"+total);
    }
    public void viewOrders(){  
        if(ht==null){
            System.out.println("No order");
            return;
        }
        for (String name : ht.keySet()) {
            System.out.println("Customer:"+name);
            ArrayList<viewOrders> orderses = ht.get(name);
            displayOrders(orderses);
        }
    }
    public void shopping(){
        displays();
        String name = getValue("Enter fruit name: ");
        ArrayList<viewOrders> o = new ArrayList<>();
        for (Fruit f : fruits) {
            if(name.equals(f.getName())){
                int id = f.getId();
                double price = f.getPrice();
                int quantity = f.getQuality();
                o.add(new viewOrders(id, name, quantity, (int) price));
                displayOrders(o);
                String customer = getValue("Enter Customer of name:");
                ht.put(customer, o);
                System.out.println("Add Successfull!");
            }
        }
    }

    @Override
    public void run(int n) {
        if(n==options.length){
            System.out.println("Exit!");
            result=false;
        }
        else{
            switch(n){
                case 1:
                   createFruit();
                   break;
                case 2:
                    viewOrders();
                   break;
                case 3:
                    shopping();
                    break;
            }
        }
    }
    
}
