import java.util.Scanner;
public class starcenterictriangle {
    public static void main(String [] args){
        int i,j,n;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of rows:");
        n = sc.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){
                System.out.print(" "+" ");
            }
            for(j=1;j<=(2*i)-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
