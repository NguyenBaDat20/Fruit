/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.Hashtable;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public abstract class Menu {
    protected String title;
    protected String[] options;
    protected boolean result = true;

    public Menu(String title, String[] options) {
        this.title = title;
        this.options = options;
    }
    
    public void display(){
        for (int i = 0; i < options.length; i++) {
            System.out.println((i+1)+". "+options[i]);
        }
    }
    
    public int getSalected(){
        display();
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    public abstract void run(int n);
    public void run(){
        while(result){
            int n = getSalected();
            run(n);
        }
    }
    public static void main(String[] args) {
        Hashtable<String,Integer> a = new Hashtable<>();
        a.put("A", 1);
        System.out.println(a);
    }
}
