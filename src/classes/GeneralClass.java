package classes;

import java.util.Scanner;

public class GeneralClass {

    public int getIntUserInput(int min, int max, String message) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Choose " + message + " (from " + min + " to " + max + ") - ");
        int userInput = 0;
        do {
            while (!scan.hasNextInt()) {
                if (scan.hasNextDouble()) {
                    System.out.print("The number is not an integer - ");
                } else {
                    System.out.print("That not a number! Try again - ");
                }
                scan.next();
            }
            userInput = scan.nextInt();

            if (userInput < min) {
                System.out.print("Number less than " + min + ". Try again - ");
            } else if (userInput > max) {
                System.out.print("Number greater than " + max + ". Try again - ");
            }
        } while (userInput < min | userInput > max);

        return userInput;
    }

    public double getDoubleUserInput(int min, int max, String message) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Choose " + message + " (from " + min + " to " + max + ") - ");
        double doubleUserInput = 0;
        do {
            while (!scan.hasNextDouble()) {
                System.out.print("That not a number! Try again - ");
                scan.next();
            }
            doubleUserInput = scan.nextDouble();
            if (doubleUserInput < min) {
                System.out.print("Number less than " + min + ". Try again - ");
            } else if (doubleUserInput > max) {
                System.out.print("Number greater than " + max + ". Try again - ");
            }
        } while (doubleUserInput < min | doubleUserInput > max);

        return doubleUserInput;
    }
}
