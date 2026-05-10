import java.util.Scanner;
public class alphabetsquare {
    public static void main(String [] args){
        int i,j,m;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        m = sc.nextInt();
        for(i=1;i<=m;i++){
            for(j=1;j<=m;j++){
                System.out.print((char)(i+64)+" ");
            }
            System.out.println();
        }
    }
}
