import java.util.Scanner;
public class countdigits {
    public static void main(String [] args){
        int n;
        int q,count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number:");
        n = sc.nextInt();
        while(n>0){
            q = n/10;
            count++;
            n = q;
        }
        System.out.println("The no of digits:"+count);
    }
}
