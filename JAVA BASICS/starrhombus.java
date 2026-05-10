import java.util.Scanner;
public class starrhombus {
    public static void main(String [] args){
        int i,j,k,n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows:");
        n = sc.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){
                System.out.print(" "+" ");
            }
            for(j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
