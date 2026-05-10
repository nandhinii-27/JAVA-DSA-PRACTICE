import java.util.Scanner;
public class remainder {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a,b,rem;
        System.out.print("Enter a:");
        a = sc.nextInt();
        System.out.print("Enter b:");
        b = sc.nextInt();
        int q;
        q = a/b;
        rem = a - (q*b);
        System.out.println("The remainder when "+a+" is divided by "+b+" is:"+rem);
    }
}
