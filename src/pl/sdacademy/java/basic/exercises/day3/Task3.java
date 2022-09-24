package pl.sdacademy.java.basic.exercises.day3;

import java.util.regex.Pattern;

public class Task3 {

   private static final String NUMBER_REGEX = "-?[0-9]+(,[0-9]+)*";

    public static void main(String[] args) {
        String number = "1";
        System.out.println("If digit "+ number +" has correct format: "+isCorrectNumberFormat(number));
        number = "-1234,1234";
        System.out.println("If digit "+ number +" has correct format: "+isCorrectNumberFormat(number));
        number = "1234,123d";
        System.out.println("If digit "+ number +" has correct format: "+isCorrectNumberFormat(number));
        number = "1234";
        System.out.println("If digit "+ number +" has correct format: "+isCorrectNumberFormat(number));
        number = "09,56";
        System.out.println("If digit "+ number +" has correct format: "+isCorrectNumberFormat(number));
    }
    private static boolean isCorrectNumberFormat(String number){
        return Pattern.compile(NUMBER_REGEX).matcher(number).matches();
    }
}
