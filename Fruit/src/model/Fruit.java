/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class Fruit {
    private int id;
    private String name;
    private double price;
    private int quantity;
    private  String origin;

    public Fruit(int id, String name, double price, int quality, String origin) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quality;
        this.origin = origin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuality() {
        return quantity;
    }

    public void setQuality(int quality) {
        this.quantity = quality;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "Fruit{" + "id=" + id + ", name=" + name + ", price=" + price + ", quality=" + quantity + ", origin=" + origin + '}';
    }
    
}
