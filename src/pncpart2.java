import java.util.Scanner;
public class pncpart2 {
    public static void main(String [] args){
        int nfact,nrfact,rfact,ncr,n,r;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n and r:");
        n = sc.nextInt();
        r = sc.nextInt();
        nfact = factorial(n);
        nrfact = factorial(n-r);
        rfact = factorial(r);
        ncr = nfact/(rfact*nrfact);
        System.out.println(ncr);
    }
    public static int factorial(int n){
        int fact = 1,i;
        for(i=n;i>=1;i--){
            fact = fact*i;
        }
        return fact;
    }
}
