import java.util.Scanner;
public class starcross {
    public static void main(String [] args){
        int i,j,n;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no of rows:");
        n = sc.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                if(i==j|| j== n-i+1){
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
