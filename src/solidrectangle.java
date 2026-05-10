import java.util.Scanner;
public class solidrectangle {
    public static void main(String [] args){
        int i,j,m,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows and columns:");
        m = sc.nextInt();
        n = sc.nextInt();
        for(i=1;i<=m;i++){
            for(j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
