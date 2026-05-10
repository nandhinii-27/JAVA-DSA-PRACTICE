import java.util.Scanner;
public class pascaltriangle {
    public  static void main(String [] args){
        int n,i,j,num;
        System.out.print("enter no of rows:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            num = 1;
            for(j=1;j<=i;j++){
                System.out.print(num+" ");
                num = (num*(i-j))/(j);
            }
            System.out.println();
        }
    }
}
