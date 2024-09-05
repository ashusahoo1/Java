/*1. Aim of the program :Write a class file – box with three data members(length, width, height) and a method volume() . Also implement the application class Demo where an object of the box class is created with user entered dimensions and volume is printed.
Input:  length, width and height.
      Output: Volume
 */

 import java.util.Scanner;

public class BoxDemo {

    // Box class with dimensions and volume calculation
    static class Box {
        // Data members
        private double length;
        private double width;
        private double height;

        // Constructor to initialize the box dimensions
        public Box(double length, double width, double height) {
            this.length = length;
            this.width = width;
            this.height = height;
        }

        // Method to calculate the volume of the box
        public double volume() {
            return length * width * height;
        }
    }

    // Demo class to interact with the user
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Read the dimensions of the box from the user
        System.out.print("Enter the length of the box: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the box: ");
        double width = scanner.nextDouble();

        System.out.print("Enter the height of the box: ");
        double height = scanner.nextDouble();

        // Create an object of the Box class with the user-entered dimensions
        Box box = new Box(length, width, height);

        // Output: Calculate and print the volume of the box
        double volume = box.volume();
        System.out.println("The volume of the box is: " + volume);

        scanner.close();  // Close the scanner object
    }
}

