import java.util.Scanner;
public class threedigitornot {
    public static void main(String [] args){
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        x = sc.nextInt();
        if(x>99 && x<1000){
            System.out.println("Its a three digit number");
        }
        else{
            System.out.println("Its not a three digit number");
        }
    }
}
