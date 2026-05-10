import java.util.Scanner;
public class ordivisiblity {
    public static void main(String [] args){
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        x = sc.nextInt();
        if(x%3==0 && x%5==0){
            System.out.println("Divisible by both 5 and 3");
        }
        else if(x%3==0 && x%5 != 0){
            System.out.println("Divisible by 3 but not 5");
        }
        else if(x%3 != 0 && x%5==0){
            System.out.println("Divisible by 5 but not 3");
        }
        else{
            System.out.println("not Divisible by both 5 and 3");
        }
    }
}
