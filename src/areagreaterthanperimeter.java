import java.util.Scanner;
public class areagreaterthanperimeter {
    public static void main(String [] args){
        int l,b,area,perimeter;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter l and b of rectangle:");
        l = sc.nextInt();
        b = sc.nextInt();
        area = l*b;
        perimeter = 2*(l+b);
        if(area>perimeter){
            System.out.println("area is greater than perimeter");
        }
        else{
            System.out.println("area is not greater than perimeter");
        }
    }
}
