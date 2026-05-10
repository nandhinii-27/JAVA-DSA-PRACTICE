import java.util.Scanner;
public class sumof2 {
    public static void main(String[] args){
        int x,y,sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter x and y:");
        x = sc.nextInt();
        y = sc.nextInt();
        sum = x+y;
        System.out.println("The sum is:"+sum);
    }
}
