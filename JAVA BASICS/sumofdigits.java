import java.util.Scanner;
public class sumofdigits {
    public static void main(String [] args){
        int n,q,r,sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number:");
        n = sc.nextInt();
        while(n>0){
            r = n%10;
            sum = sum+r;
            q = n/10;
            n = q;
        }
        System.out.print("The sum of digits are:"+sum);
    }
}
