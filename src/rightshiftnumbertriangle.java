import java.util.Scanner;
public class rightshiftnumbertriangle {
    public static void main(String [] args){
        int i,j,m,a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows:");
        m = sc.nextInt();
        for(i=1;i<=m;i++){
            a = 1;
            for(j=1;j<=m;j++){
                if((i+j)>m){
                    System.out.print(" "+a);
                    a++;
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
