package pl.sdacademy.java.basic.exercises.day3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Task1 {
    private static final String EMAIL_REGEX = "[A-Za-z0-9]+@[a-z]+(.[a-z]+)*";

    public static void main(String[] args){
        System.out.println(isCorrectEmailFormat("belf76@gmail.com"));
        System.out.println(isCorrectEmailFormat("belf76@gmail.com.pl"));
        System.out.println(isCorrectEmailFormat("belf76@gmail."));
        System.out.println(isCorrectEmailFormat("belf76@"));
        System.out.println(isCorrectEmailFormat("belf76@gmail.com.pl.test"));
        System.out.println(isCorrectEmailFormat("belf76@.com"));//??
    }
    private static boolean isCorrectEmailFormat(String emailAddress){
//        Pattern pattern = Pattern.compile("");
//        Matcher matcher = pattern.matcher(emailAddress);
//        return matcher.matches();
        //"[A-Za-z0-9]+@[a-z.]*[a-z]+"
        return Pattern.compile(EMAIL_REGEX).matcher(emailAddress).matches();

    }
}
