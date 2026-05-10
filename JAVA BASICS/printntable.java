import java.util.Scanner;
public class printntable {
    public static void main(String [] args){
        int n,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        n  = sc.nextInt();
        for(i=1;i<=10;i++){
            System.out.println(n+" X "+i+" = "+(n*i));
        }
    }
}
