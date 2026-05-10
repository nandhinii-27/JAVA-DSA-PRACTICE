import java.util.Scanner;
public class areatriangle{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter b and  h:");
        double b,h,area;
        b = sc.nextDouble();
        h = sc.nextDouble();
        area = (b*h)/2;
        System.out.println(area);
    }
}