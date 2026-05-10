import java.util.Scanner;
public class divisibility {
    public static void main(String[] args){
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        x = sc.nextInt();
        if(x%5==0){
            System.out.println("The given number is divisible by 5");
        }
        else{
            System.out.println("The given number is not divisible by 5");
        }

    }
}
