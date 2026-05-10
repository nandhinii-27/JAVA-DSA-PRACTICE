import java.util.Scanner;
public class checktriangle {
    public static void main(String [] args){
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three sides of triangle:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if((a+b>c) && (a+c>b) && (b+c>a)){
            System.out.println("Its a triangle");
        }
        else{
            System.out.println("Its  not a triangle");
        }
    }
}
