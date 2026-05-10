import java.util.Scanner;
public class alphanumeric {
    public static void main(String [] args){
        int i,j,m;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no of rows:");
        m = sc.nextInt();
        for(i=1;i<=m;i++){
            if(i%2==0){
                for(j=1;j<=i;j++){
                    System.out.print(" "+(char)(64+j)+" ");
                }
            }
            else{
                for(j=1;j<=i;j++){
                    System.out.print(" "+j+" ");
                }
            }
            System.out.println();
        }
    }
}
