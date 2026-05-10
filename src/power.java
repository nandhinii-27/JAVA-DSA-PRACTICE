import java.util.Scanner;
public class power {
    public static void main(String [] args){
        int a,b,pow=1,i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a and b:");
        a = sc.nextInt();
        b = sc.nextInt();
        for(i=1;i<=b;i++){
            pow = a*pow;
        }
        System.out.print(pow);
    }
}
