import java.util.Scanner;
public class floydtriangle {
    public static void main(String [] args){
        int i,j,m;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no rows:");
        m = sc.nextInt();
        int a = 1;
        for(i=1;i<=m;i++){
            for(j=1;j<=i;j++){
                System.out.print(" "+a+" ");
                a++;
            }
            System.out.println();
        }

    }
}
