package pl.sdacademy.java.basic.exercises.day1;

public class Task5 {
    public static void main(String[] args) {
        int firstDigit = 4;
        int secondDigit=11;
        int sum = sumOfSequence(firstDigit,secondDigit);
        System.out.println("Sum: "+sum);
    }
    private static int sumOfSequence (int firstDigit, int secondDigit){
        int s=0;
        int i = firstDigit;
        for (i = firstDigit;i<=secondDigit;i++){
            s+=i;
        }
//        while (i<=secondDigit){
//            s+=i;
//            i++;
//        }

        return  s;
    }
}
