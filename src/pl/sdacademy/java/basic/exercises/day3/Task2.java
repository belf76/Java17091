package pl.sdacademy.java.basic.exercises.day3;

import java.util.regex.Pattern;

public class Task2 {

    private static final String IBAN_REGEX = "PL[0-9]{24}";


    public static void main(String[] args) {
        String correctIban = "PL234567891234587876543218";
        System.out.println("If PL IBAN "+ correctIban+" has correct format: "+isIbanOk(correctIban));
        correctIban = "PO1213654387654328762524";
        System.out.println("If PL IBAN "+ correctIban+" has correct format: "+isIbanOk(correctIban));
        correctIban="PL1213654387654328762524";
        System.out.println("If PL IBAN "+ correctIban+" has correct format: "+isIbanOk(correctIban));
    }
    private static boolean isIbanOk (String iban){
        return Pattern.compile(IBAN_REGEX).matcher(iban).matches();
    }
}
