import java.util.Scanner;
public class sumeven {
    public  static void main(String[] args){
        int n,q,r;
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.print("enter a number:");
        n = sc.nextInt();
        while(n>0){
            r = n%10;
            if(r%2==0){
                sum = sum+r;
            }
            q = n/10;
            n = q;
        }
        System.out.println("The sum is:"+sum);
    }
}
