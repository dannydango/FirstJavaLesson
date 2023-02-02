package com.sparta;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Please enter the time using 24hr format (1 - 24)");
        try {
            int timeOfDay = input.nextInt();
            String result = greeting(timeOfDay);
            System.out.println(result);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter an number between 1 and 24.");
        }
    }

    public static String greeting(int timeOfDay) {
        String greeting;

        if(timeOfDay >= 5 && timeOfDay <= 11){
            greeting = "Good Morning!";
        }
        else if(timeOfDay >= 12 && timeOfDay <= 17){
            greeting = "Good Afternoon!";
    }
        else if(timeOfDay >=  18 && timeOfDay <= 24 || timeOfDay <= 4 && timeOfDay >= 1){
            greeting = "Good Evening!";
        }
        else
            greeting = "This is an invalid entry please choose a number between 1 and 24";
        return greeting;
    }
}
