import java.util.Scanner;
public class square {
    public static void main(String [] args){
        int x,square;
        System.out.println("enter a number:");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        square = x*x;
        System.out.print("The square of the given number:"+square);
    }
}
