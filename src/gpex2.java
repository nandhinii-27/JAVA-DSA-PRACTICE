import java.util.Scanner;
public class gpex2 {
    public static void main(String [] args){
        int n,i;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n:");
        n = sc.nextInt();
        int a,r;
        a = 3;
        r = 4;
        for(i=1;i<=n;i++){
            System.out.print(a+" ");
            a = a*r;
        }
    }
}
