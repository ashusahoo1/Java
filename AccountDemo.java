/*4. Aim of the program :Write a class Account containing acc_no, balance as data members and two methods as input() for taking input from user and disp() method to display the details. Create a subclass Person which has name and aadhar_no as extra data members and override disp() function. Write the complete progrm to take and print details of three persons. */


import java.util.Scanner;

// Base class Account
class Account {
    protected String accNo;
    protected double balance;

    // Method to take input for Account
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Account Number: ");
        accNo = scanner.nextLine();
        System.out.print("Enter Balance: ");
        balance = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
    }

    // Method to display Account details
    public void disp() {
        System.out.println("Account Number: " + accNo);
        System.out.println("Balance: " + balance);
    }
}

// Subclass Person inheriting from Account
class Person extends Account {
    private String name;
    private String aadharNo;

    // Method to take input for Person including Account details
    @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);
        super.input(); // Call input method of Account class
        System.out.print("Enter Name: ");
        name = scanner.nextLine();
        System.out.print("Enter Aadhaar Number: ");
        aadharNo = scanner.nextLine();
    }

    // Method to display Person details including Account details
    @Override
    public void disp() {
        super.disp(); // Call disp method of Account class
        System.out.println("Name: " + name);
        System.out.println("Aadhaar Number: " + aadharNo);
    }
}

// Driver class to test the implementation
public class AccountDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person[] persons = new Person[3];

        // Create and input details for three persons
        for (int i = 0; i < 3; i++) {
            System.out.println("\nEntering details for Person " + (i + 1) + ":");
            persons[i] = new Person();
            persons[i].input();
        }

        // Display details of the three persons
        System.out.println("\nDisplaying details of all persons:");
        for (int i = 0; i < 3; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            persons[i].disp();
        }

        scanner.close(); // Close the scanner object
    }
}
