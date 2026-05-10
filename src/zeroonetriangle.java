import java.util.Scanner;
public class zeroonetriangle {
    public static void main(String [] args){
        int i,j,m,a;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no of rows:");
        m = sc.nextInt();
        for(i=1;i<=m;i++){
            for(j=1;j<=i;j++){
                if(i%2!=0 && j%2 !=0){
                    System.out.print(" 1 ");
                }
                else if(i%2!=0 && j%2==0){
                    System.out.print(" 0 ");
                }
                else if(i%2==0 && j%2==0){
                    System.out.print(" 1 ");
                }
                else if(i%2==0 && j%2!=0){
                    System.out.print(" 0 ");
                }
                }
            System.out.println();
            }
        }
}
