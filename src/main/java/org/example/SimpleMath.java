package org.example;
import java.util.Scanner;

/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 *Copyright 2021 Daniela Gomez-Dugan
 */
public class SimpleMath
{
    public static void main( String[] args )
    {
        // Get two numbers and calculate the addition, subtraction, multiplication, and division
        Scanner input = new Scanner(System.in);

        System.out.print("What is the first number? ");
        int first_num = input.nextInt();

        // Checking if number is negative
        while (first_num < 0) {
            System.out.print("Please enter a positive number. What is the first number? ");
            first_num = input.nextInt();
        }

        System.out.print("What is the second number? ");
        int second_num = input.nextInt();

        // Checking if number is negative
        while (second_num < 0) {
            System.out.print("Please enter a positive number. What is the second number? ");
            second_num = input.nextInt();
        }

        System.out.println(first_num + " + " + second_num + " = " + MathOperations.add(first_num, second_num)
            + "\n" + first_num + " - " + second_num + " = " + MathOperations.subtract(first_num, second_num)
                + "\n" + first_num + " * " + second_num + " = " + MathOperations.multiply(first_num, second_num)
                + "\n" + first_num + " / " + second_num + " = " + MathOperations.divide(first_num, second_num));
    }
}

// Class to calculate all operations
class MathOperations
{
    public static int add(int a, int b) { return a + b; }
    public static int subtract(int a, int b) { return a - b; }
    public static int multiply(int a, int b) { return a * b; }
    public static int divide(int a, int b) { return a / b; }
}