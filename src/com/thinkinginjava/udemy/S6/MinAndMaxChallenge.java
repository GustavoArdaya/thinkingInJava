package com.thinkinginjava.udemy.S6;
import java.util.Scanner;

public class MinAndMaxChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean validNumber = true;

    double max = 0.0;
    double min = 0.0;

        while (validNumber) {

            System.out.println("Enter a number to find the maximum or minimum. Enter any other character to end program.");

            String input = scanner.nextLine();

            try {
                double number = Double.parseDouble(input);
                if (number < min || min == 0.0) {
                    min = number;
                } else if (number > max) {
                    max = number;
                }
            } catch (NumberFormatException nfe) {
                validNumber = false;
            }
        }
        System.out.println("Max number is " + max + " and min number is " + min);
    }


}
