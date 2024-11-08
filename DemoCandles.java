/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Owner
 */
import java.util.Scanner;

public class DemoCandles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create and set up Candle object
        candle regularCandle = new candle();
        System.out.print("Enter color for Candle: ");
        regularCandle.setColor(scanner.nextLine());
        System.out.print("Enter height for Candle in inches: ");
        regularCandle.setHeight(scanner.nextDouble());
        scanner.nextLine(); // consume newline

        // Create and set up ScentedCandle object
        ScentedCandle scentedCandle = new ScentedCandle();
        System.out.print("Enter color for Scented Candle: ");
        scentedCandle.setColor(scanner.nextLine());
        System.out.print("Enter height for Scented Candle in inches: ");
        scentedCandle.setHeight(scanner.nextDouble());
        scanner.nextLine(); // consume newline
        System.out.print("Choose a scent (e.g., Gardenia, Lavender, Rose, Vanilla): ");
        scentedCandle.setScent(scanner.nextLine());

        // Display details
        System.out.println("\nRegular Candle:");
        System.out.println("Color: " + regularCandle.getColor());
        System.out.println("Height: " + regularCandle.getHeight() + " inches");
        System.out.println("Price: $" + regularCandle.getPrice());

        System.out.println("\nScented Candle:");
        System.out.println("Color: " + scentedCandle.getColor());
        System.out.println("Height: " + scentedCandle.getHeight() + " inches");
        System.out.println("Scent: " + scentedCandle.getScent());
        System.out.println("Price: $" + scentedCandle.getPrice());

        scanner.close();
    }
}
