import java.util.Scanner;
public class solidsquare {
    public static void main(String[] args){
        int i,j,m;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows:");
        m = sc.nextInt();
        for(i=1;i<=m;i++){
            for(j=1;j<=m;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
