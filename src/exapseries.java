import java.util.Scanner;
public class exapseries {
    public static void main(String [] args){
        int n,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n:");
        n = sc.nextInt();
        for(i=4;i<=(3*n)+1;i+=3){
            System.out.print(i+" ");
        }
    }
}
