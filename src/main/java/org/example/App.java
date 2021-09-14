/**
 * UCF COP3330 Fall 2021 Assignment 5 Solution
 * Copyright 2021 Emily Radney
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scnr = new Scanner(System.in);
        int first, second, third;

        System.out.print("Enter the first number: ");
        first = scnr.nextInt();
        System.out.print("Enter the second number: ");
        second = scnr.nextInt();
        System.out.print("Enter the third number: ");
        third = scnr.nextInt();

        if ((first == second) || (second == third) || (first == third)) {
            System.out.print("Invalid input.\nPlease enter three different numbers.\n");
            System.exit(0);
        }
        else if((first > second) && (first > third)) {
            System.out.println("The largest number is " + first + ".");
        }
        else if((second > first) && (second > third)) {
            System.out.println("The largest number is " + second + ".");
        }
        else {
            System.out.println("The largest number is " + third + ".");
        }
    }
}
