import java.util.InputMismatchException;
import java.util.Scanner;
public class arithmetic {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        try{
            int a = sc.nextInt();
            int b = sc.nextInt();
            int ans = a/b;
        }
        catch(InputMismatchException e){
               System.out.println(e);
        }
        catch(ArithmeticException e){
               System.out.println(e);
        }
        System.out.println("Program ended");
    }
}
