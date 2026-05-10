import java.util.Scanner;
public class faactorial {
    public static void main(String[] args){
        int n,i;
        Scanner sc = new Scanner(System.in);
        int fact = 1;
        System.out.print("enter a number:");
        n = sc.nextInt();
        for(i=n;i>1;i--){
            fact = fact*i;
        }
        System.out.println("The factorial "+n+" is "+fact);
    }
}
