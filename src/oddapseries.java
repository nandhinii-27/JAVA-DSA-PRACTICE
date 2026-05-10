import java.util.Scanner;
public class oddapseries {
    public static void main(String [] args){
        int n,i;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(i=1;i<=(2*n)-1;i+=2){
            System.out.println(i);
        }
    }
}
