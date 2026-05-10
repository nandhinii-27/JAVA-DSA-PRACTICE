import java.util.Scanner;
public class plusstar {
    public static void main(String [] args){
        int i,j,m,n;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no of rows:");
        m = sc.nextInt();
        if(m%2 != 0){
             n = (m/2)+1;
        }
        else{
             n = m/2;
        }
        for(i=1;i<=m;i++){
            for(j=1;j<=m;j++){
                if((i==n) || (j==n)){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
