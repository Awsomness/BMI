package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	// write your code here
        Scanner keyboard;
        int inches,pounds;
        double conversionFrominchesTometers = 0.0254 ,conversionFrompoundsTokilograms = 0.453592 ,meters,kg,bmi;

        //Initial
        System.out.println("What is your height in inches?");
        keyboard = new Scanner(System.in);
        inches = keyboard.nextInt();
        meters=inches*0.0254;
        System.out.println(meters+"meters");
        System.out.println("What is your weight in pounds?");
        pounds=keyboard.nextInt();
        kg=pounds*0.453592;
        System.out.println(kg+ "kg");
        bmi=kg/(meters*meters);
        System.out.println("Your bmi is...");
        System.out.println(bmi);
        
    }
}
