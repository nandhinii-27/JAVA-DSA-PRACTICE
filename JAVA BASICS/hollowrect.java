import java.util.Scanner;
public class hollowrect {
    public static void main(String [] args){
        int i,j,m,n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows and columns:");
        m = sc.nextInt();
        n = sc.nextInt();
        for(i=1;i<=m;i++){
            for(j=1;j<=n;j++){
                if(i==1||i==m||j==1||j==n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

}
