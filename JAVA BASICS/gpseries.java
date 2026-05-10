import java.util.Scanner;
public class gpseries {
    public static void main(String [] args){
        int n,i,a,r;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n:");
        n = sc.nextInt();
        a=1;
        r=2;
        for(i=1;i<=n;i++){
            System.out.print(a+" ");
            a = a*r;
        }
    }

}
