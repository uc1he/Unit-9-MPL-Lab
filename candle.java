/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @Uche 
 */
public class candle {
    private String color;
    private double height;
    public double price;

    // Get methods
    public String getColor() {
        return color;
    }

    public double getHeight() {
        return height;
    }

    public double getPrice() {
        return price;
    }

    // Set methods
    public void setColor(String color) {
        this.color = color;
    }

    public void setHeight(double height) {
        this.height = height;
        this.price = height * 2;  // Price is set as $2 per inch of height
    }
}
