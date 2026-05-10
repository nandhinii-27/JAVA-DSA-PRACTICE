import java.util.Scanner;
public class factorialofnnumbers {
    public static void main(String [] args){
        int i,n,fact=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number:");
        n = sc.nextInt();
        for(i=1;i<=n;i++){
            fact = fact*i;
            System.out.println("The factorial of "+ i +" is "+fact);
        }
    }
}
