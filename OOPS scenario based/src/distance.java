

import java.util.*;

public class distance {

    double km, m, miles;
    Scanner sc = new Scanner(System.in);

    public void kmtom() {
        System.out.print("Enter km: ");
        km = sc.nextDouble();
        m = km * 1000;
        System.out.println(km + " km = " + m + " meters");
    }

    public void mtokm() {
        System.out.print("Enter meters: ");
        m = sc.nextDouble();
        km = m / 1000;
        System.out.println(m + " m = " + km + " km");
    }

    public void milestokm() {
        System.out.print("Enter miles: ");
        miles = sc.nextDouble();
        km = miles * 1.60934;
        System.out.println(miles + " miles = " + km + " km");
    }

    public void kmtomiles() {
        System.out.print("Enter km: ");
        km = sc.nextDouble();
        miles = km * 0.621371;
        System.out.println(km + " km = " + miles + " miles");
    }
}