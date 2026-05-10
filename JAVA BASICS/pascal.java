import java.util.Scanner;
public class pascal {
    public static int Fact(int n){
        int fact=1;
        int i;
        for(i=n;i>=1;i--){
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String [] args){
        int i,j,n,icj;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows:");
        n = sc.nextInt();
        for(i=0;i<=n;i++){
            for(j=0;j<=n-i;j++){
                System.out.print(" ");
            }
            for(j=0;j<=i;j++){
                icj = Fact(i)/(Fact(j)*Fact(i-j));
                System.out.print(icj+" ");
            }
            System.out.println();
        }

    }
}
