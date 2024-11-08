/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @Uche
 */
public class ScentedCandle extends candle {
    private String scent;
    //private Double price;

    // Get method for scent
    public String getScent() {
        return scent;
    }

    // Set method for scent
    public void setScent(String scent) {
        this.scent = scent;
    }

    // Override setHeight to set price at $3 per inch
    @Override
    public void setHeight(double height) {
        super.setHeight(height); // Optionally, you could set this.height directly
        super.price = height * 3;
    }
}
