package pl.sdacademy.java.basic.exercises.day1;

import java.util.Scanner;
import java.lang.Math;

public class Task3 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] arg){
        float weight = getWeight();
        int height = getHeight();
        System.out.println(weight+ "   " + height);
        displayInfo(weight,height);
    }
    private static float getWeight(){
        System.out.println("Please insert weight in kg: ");
        return scanner.nextFloat();
    }
    private  static  int getHeight(){
        System.out.println("Please insert height in cm: ");
        return scanner.nextInt();
    }
    private  static void displayInfo(float weight, int height){
        float bmi = weight/(float)Math.pow((float)height/100,2);
        System.out.println(bmi);
        if (bmi >=18.5 && bmi <=24.9){
            System.out.println("BMI is correct:" +bmi);
        }
        else{
            System.out.println("BMI is not correct:" + bmi);
        }
    }

}
