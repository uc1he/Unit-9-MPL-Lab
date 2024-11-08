/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Owner
 */
public class TeeShirt {
    private int orderNumber;
    private String size;
    private String color;
    private double price;

    // Get methods
    public int getOrderNumber() {
        return orderNumber;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    // Set methods
    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public void setSize(String size) {
        this.size = size;
        this.price = (size.equals("XXL") || size.equals("XXXL")) ? 22.99 : 19.99;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
