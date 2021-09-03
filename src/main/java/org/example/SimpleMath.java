package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class SimpleMath
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the first number? ");
        int first_num = input.nextInt();
        while (first_num < 0)
            System.out.print("Invalid answer. What is the first number? ");
        System.out.print("What is the second number? ");
        int second_num = input.nextInt();
        while (second_num < 0)
            System.out.print("Invalid answer. What is the first number? ");
        System.out.println(first_num + " + " + second_num + " = " + add(first_num, second_num) +
                "\n" + first_num + " - " + second_num + " = " + subtract(first_num, second_num) +
                "\n" + first_num + " * " + second_num + " = " + multiply(first_num, second_num) +
                "\n" + first_num + " / " + second_num + " = " + divide(first_num, second_num));
    }

    private static int add(int a, int b) { return a + b; }
    private static int subtract(int a, int b) { return a - b; }
    private static int multiply(int a, int b) { return a * b; }
    private static int divide(int a, int b) { return a / b; }
}
