package pl.sdacademy.java.basic.exercises.day3;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.logging.SocketHandler;

public class Task6 {
    private static final String INPUT_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert date [ "+ INPUT_DATE_FORMAT +" ] ");
        String input = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern((INPUT_DATE_FORMAT));
        LocalDateTime nextLesson = LocalDateTime.parse(input,formatter);
        LocalDateTime now= LocalDateTime.now();
        Duration duration = Duration.between(now,nextLesson);
        long days =duration.toDays();
        System.out.println("You have " + days + " days to next lesson");
        int hours = duration.toHoursPart();
        int minutes = duration.toMinutesPart();
        int seconds = duration.toSecondsPart();
        System.out.printf("You have days:%1d hours: %01d, Minutes: %01d, Seconds: %01d", days, hours,minutes,seconds);
        }
    }