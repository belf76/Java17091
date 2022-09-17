package pl.sdacademy.java.basic.exercises.day1;

import java.util.Scanner;
import java.lang.Math;
public class Task2 {
    private static final float PI =3.14F;
    public static void main(String[] args) {
        float radius = getDiameterFromUser()/2;
        System.out.println("Circumference Of A Circle:" + calculateCircumferencseOfACircle(radius));
        System.out.println("Area Of A Circle: " + calculateAreaOfACircle(radius));

    }
    private static float getDiameterFromUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert diameter: ");
        return scanner.nextFloat();
    }
    private static float calculateCircumferencseOfACircle(float radius){
        return 2*(float)Math.PI*radius;
    }
    private static float calculateAreaOfACircle (float radius){
        return (float)Math.PI*(float)Math.pow(radius,2);
    }
}
