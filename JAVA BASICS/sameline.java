import java.util.Scanner;
public class sameline {
    public static void main(String[] args) {
        double x1, y1, x2, y2, x3, y3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x1 and y1:");
        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        System.out.println("Enter x2 and y2:");
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();
        System.out.println("Enter x3 and y3:");
        x3 = sc.nextDouble();
        y3 = sc.nextDouble();
        if ((x2 - x1) * (y3 - y1) == (y2 - y1) * (x3 - x1)) {
            System.out.println("All three points are in the same line");
        }
        else {
            System.out.println("All three points are NOT in the same line");
        }
    }
}
