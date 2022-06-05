package com.akilesh;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int currentYear;
        int dateOfBirth;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the current year: ");
        boolean isNextInt = scanner.hasNextInt();
        if (isNextInt) {
            currentYear = scanner.nextInt();
            scanner.nextLine(); // Clearing the console.

            System.out.println("Enter your date of birth: ");
            isNextInt = scanner.hasNextInt();

            if (isNextInt) {
                dateOfBirth = scanner.nextInt();
                scanner.nextLine(); // Clearing the console.
                scanner.close();
                int age = currentYear - dateOfBirth;
                System.out.println("Your are " + age + " years old");
            } else {
                System.out.println("Invalid input for date of birth.");
            }
        } else {
            System.out.println("Invalid year input.");
        }
        scanner.close();
    }
}
