import java.util.Scanner;
public class evenodd {
    public static void main(String [] args){
        int x;
        System.out.print("enter a number:");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        if(x%2==0){
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is odd");
        }
    }
}
