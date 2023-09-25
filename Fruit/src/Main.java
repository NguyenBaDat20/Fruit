
import controller.Fruit_Shop_System;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class Main {
    public static void main(String[] args) {
        String[]options = {"Create Fruit","View orders","Shopping","Exit"};
        Fruit_Shop_System f = new Fruit_Shop_System("FRUIT SHOP SYSTEM",options);
        f.run();
    }
}
