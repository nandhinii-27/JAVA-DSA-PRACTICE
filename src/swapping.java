import java.util.Scanner;
public class swapping {
    public static void main(String [] args){
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a and b:");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println(a+" "+b);
        a = a+b;
        b = a- b;
        a = a- b;
        System.out.println(a+" "+b);

    }
}
