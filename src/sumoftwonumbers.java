import java.util.Scanner;
public class sumoftwonumbers {
    public static void main(String [] args){
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a and b:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sum(a,b);
        System.out.print("Sum of these tow numbers is:"+c);
    }

        public static int sum(int a,int b){
               return a+b;
        }

}
