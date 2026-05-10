import java.util.Scanner;
public class exhandlingprob1 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        class DivisionExample{
            void divideNumbers(){
               int a = sc.nextInt();
               int b = sc.nextInt();
               try{
                   int result = a/b;
                   System.out.println(result);
               }
               catch(ArithmeticException e){
                   System.out.println("Cannot divide by zero");
               }
            }
        }
        DivisionExample ex = new DivisionExample();
        ex.divideNumbers();
    }
}
