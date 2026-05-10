import java.util.Scanner;
public class pnc {
    public static void main(String [] args){
        int n,fact;
        System.out.print("Enter a number:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        fact = factorial(n);
        System.out.println("Factorial:"+fact);
    }
    public static int factorial(int n){
        int fact = 1,i;
        for(i=n;i>=1;i--){
            fact = fact*i;
        }
        return fact;

    }
}
