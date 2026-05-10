import java.util.Scanner;
public class oddnumbertriangle {
    public static void main(String [] args){
        int i,j,n;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no of rows:");
        n = sc.nextInt();
        int a;
        for(i=1;i<=n;i++){
            a = 1;
            for(j=1;j<=i;j++){
                System.out.print(" "+a+" ");
                a+=2;
            }
            System.out.println();
        }
    }
}
