

import java.util.*;

public class timer {

    int hours, minutes, seconds, input;
    Scanner sc = new Scanner(System.in);

    public void secondstohours() {
        System.out.print("Enter seconds: ");
        input = sc.nextInt();

        hours = input / 3600;
        minutes = (input % 3600) / 60;
        seconds = input % 60;

        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);
    }

    public void minutestohours() {
        System.out.print("Enter minutes: ");
        minutes = sc.nextInt();

        hours = minutes / 60;
        minutes = minutes % 60;

        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
    }

    public void hourstominutes() {
        System.out.print("Enter hours: ");
        hours = sc.nextInt();

        minutes = hours * 60;
        System.out.println("Minutes: " + minutes);
    }

    public void hourstoseconds() {
        System.out.print("Enter hours: ");
        hours = sc.nextInt();

        seconds = hours * 3600;
        System.out.println("Seconds: " + seconds);
    }
}