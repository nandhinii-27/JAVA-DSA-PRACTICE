import java.util.Scanner;
public class areacircle{
    public static void main(String [] args){
        double radius,pi,area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius:");
        radius = sc.nextDouble();
        pi = 3.1415;
        area = radius*radius*pi;
        System.out.println("The area of circle is :"+area);
    }
}