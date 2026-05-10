import java.util.Scanner;
public class prodofdigits {
    public static void main(String[] args){
        int n,q,r,prod = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number:");
        n = sc.nextInt();
        while(n>0){
            r = n%10;
            prod = prod*r;
            q = n/10;
            n = q;
        }
        System.out.print("The product of digits:"+prod);
    }
}
