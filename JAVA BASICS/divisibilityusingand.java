import java.util.Scanner;
public class divisibilityusingand {
    public static void main(String [] args){
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        x = sc.nextInt();
        if(x%5==0 && x%3==0){
            System.out.println("The given number is divisible by both 5 and 3");
        }
        else{
            System.out.println("The given number is not divisible by 5 and 3");
        }
    }
}
