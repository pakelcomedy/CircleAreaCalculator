/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DANIEL
 */import java.util.Scanner;
public class NewClass {
     public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the radius of the circle
        System.out.print("Enter the radius of the circle: ");
        
        // Read the radius from the user
        double radius = scanner.nextDouble();

        // Calculate the area of the circle
        double area = Math.PI * Math.pow(radius, 2);

        // Display the result
        System.out.println("The area of the circle with radius " + radius + " is: " + area);

        // Close the Scanner
        scanner.close();
    }
}
