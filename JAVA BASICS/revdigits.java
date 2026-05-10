import java.util.Scanner;
public class revdigits {
    public static void main(String[] args){
        int n,r,q,rev;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number:");
        n = sc.nextInt();
        rev = 0;
        while(n>0){
            r = n%10;
            rev = (rev*10)+r;
            q = n/10;
            n = q;
        }
        System.out.println("The reversed number is:"+rev);
    }
}
