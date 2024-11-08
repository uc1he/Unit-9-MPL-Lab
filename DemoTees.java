/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Owner
 */
import java.util.Scanner;

public class DemoTees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating TeeShirt objects
        TeeShirt shirt1 = new TeeShirt();
        System.out.print("Enter order number for TeeShirt 1: ");
        shirt1.setOrderNumber(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Enter size for TeeShirt 1: ");
        shirt1.setSize(scanner.nextLine());
        System.out.print("Enter color for TeeShirt 1: ");
        shirt1.setColor(scanner.nextLine());

        TeeShirt shirt2 = new TeeShirt();
        // Repeat for shirt2...

        // Creating CustomTee objects
        CustomTee customShirt1 = new CustomTee();
        System.out.print("Enter order number for Custom Tee 1: ");
        customShirt1.setOrderNumber(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Enter size for Custom Tee 1: ");
        customShirt1.setSize(scanner.nextLine());
        System.out.print("Enter color for Custom Tee 1: ");
        customShirt1.setColor(scanner.nextLine());
        System.out.print("Enter slogan for Custom Tee 1: ");
        customShirt1.setSlogan(scanner.nextLine());

        // Display details
        System.out.println("\nTeeShirt 1:");
        // Print details for shirt1...

        System.out.println("\nCustom Tee 1:");
        // Print details for customShirt1...

        scanner.close();
    }
}
