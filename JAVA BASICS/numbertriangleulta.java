import java.util.Scanner;
public class numbertriangleulta {
    public static void main(String[] args){
        int i,j,m;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no of rows:");
        m = sc.nextInt();
        for(i=m;i>=1;i--){
            for(j=1;j<=i;j++){
                System.out.print(" "+j+" ");
            }
            System.out.println();
        }
    }
}
